package sip3client;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.Optional;
import nato.fft.protocols.sip3.NFFIDataResponse;
import nato.fft.protocols.sip3.ReqResFilter;
import nato.fft.protocols.sip3.reqresservice.PullDataFaultMessage;
import nato.fft.protocols.sip3.reqresservice.SIP3PortReqRes;
import nato.fft.protocols.sip3.reqresservice.SIP3ServiceReqRes;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class SIP3Client {
    
    public static final int FACTOR = 20;
    public static final int CAP = 20;
    
    private final Optional<URL> wsdlLocation;
    
    public static void main(String[] args) throws PullDataFaultMessage, MalformedURLException {
        SIP3Client client;
        if (args.length > 0) {
            System.out.println("Using provided wsdl:" + args[0]);
            client = new SIP3Client(new URL(args[0]));
        } else {
            System.out.println("Using default WSDL");
            client = new SIP3Client();
        }

        client.start();
    }
    
    public SIP3Client() {
        wsdlLocation = Optional.empty();
    }
    
    public SIP3Client(URL url) {
        wsdlLocation = Optional.of(url);
    }
    
    public void start() throws PullDataFaultMessage {
        System.out.println("Dowing one warm-up..");
        NFFIDataResponse response = pullDataOperation(null);
        
        for (int i = FACTOR; i<=CAP; i+=FACTOR) {
            System.out.println("Running "+i+" WS accesses...");            
            aksess(i);
        }
    }
    
    public long aksess(int antall) throws PullDataFaultMessage {     
        DescriptiveStatistics stats = new DescriptiveStatistics();
        pullDataOperation(null); // Warm up
        
        for (int i=0; i<antall; ++i) {
            long ts1 = System.currentTimeMillis();  
            NFFIDataResponse response = pullDataOperation(null);
            if (response.getNFFIMessage().getTrack().isEmpty() ) {
                throw new RuntimeException("Tracks is empty. Something is probably wrong");
            }
            long ts2 = System.currentTimeMillis();        
            stats.addValue(ts2-ts1);
            System.out.println("Finished running test" + i);
            
        }
            System.out.println("Finshed running " + antall + " tests");
        System.out.println(LocalDateTime.now().toString());

        System.out.println("Mean: " + stats.getMean());
        System.out.println("Standard Deviation: " + stats.getStandardDeviation());
        System.out.println("Variance: " + stats.getVariance());
       System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Median: " + stats.getPercentile(50));
        return 0;
    }

    private NFFIDataResponse pullDataOperation(ReqResFilter request) throws PullDataFaultMessage {
        SIP3ServiceReqRes service;
        if (wsdlLocation.isPresent()) {
            service = new SIP3ServiceReqRes(wsdlLocation.get());
        } else {
            service = new SIP3ServiceReqRes();
        }
        
        SIP3PortReqRes port = service.getSIP3ServicePortReqRes();
        return port.pullDataOperation(request);
    }
    
}

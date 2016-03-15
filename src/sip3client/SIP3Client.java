package sip3client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;
import nato.fft.protocols.sip3.NFFIDataResponse;
import nato.fft.protocols.sip3.ReqResFilter;
import nato.fft.protocols.sip3.reqresservice.PullDataFaultMessage;
import nato.fft.protocols.sip3.reqresservice.SIP3PortReqRes;
import nato.fft.protocols.sip3.reqresservice.SIP3ServiceReqRes;

public class SIP3Client {
    
    public static final int FACTOR = 100;
    public static final int CAP = 500;
    
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
        for (int i = FACTOR; i<=CAP; i+=FACTOR) {
            System.out.println("Running "+i+" WS accesses...");            
            System.out.println("Avg. RTT: " + aksess(i) + " ms.");
        }
    }
    
    public long aksess(int antall) throws PullDataFaultMessage {                
        long ts1 = System.currentTimeMillis();        
        for (int i=0;i<antall; ++i) {
            NFFIDataResponse response = pullDataOperation(null);
            if (response.getNFFIMessage().getTrack().isEmpty() ) {
                throw new RuntimeException("Tracks is empty. Something is probably wrong");
            }
        }
        long ts2 = System.currentTimeMillis();        
                
        return (ts2-ts1)/antall;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sip3client;

import nato.fft.protocols.sip3.NFFIDataResponse;
import nato.fft.protocols.sip3.reqresservice.PullDataFaultMessage;

/**
 *
 * @author Frank
 */
public class SIP3Client {

    public static final int FACTOR = 100;
    public static final int CAP = 500;
    
    public static long aksess(int antall) throws PullDataFaultMessage {                
        long ts1 = System.currentTimeMillis();        
        for (int i=0;i<antall; ++i) {
            pullDataOperation(null);
        }
        long ts2 = System.currentTimeMillis();        
                
        return (ts2-ts1)/antall;
    }
    
    public static void main(String[] args) throws PullDataFaultMessage {

        
        for (int i = FACTOR; i<=CAP; i+=FACTOR) {
            System.out.println("Running "+i+" WS accesses...");            
            System.out.println("Avg. RTT: "+aksess(i) + " ms.");
        }
                
    }

    private static NFFIDataResponse pullDataOperation(nato.fft.protocols.sip3.ReqResFilter request) throws PullDataFaultMessage {
        nato.fft.protocols.sip3.reqresservice.SIP3ServiceReqRes service = new nato.fft.protocols.sip3.reqresservice.SIP3ServiceReqRes();
        nato.fft.protocols.sip3.reqresservice.SIP3PortReqRes port = service.getSIP3ServicePortReqRes();
        return port.pullDataOperation(request);
    }
    
}


package nato.fft.protocols.sip3.reqresservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import nato.fft.protocols.sip3.NFFIDataResponse;
import nato.fft.protocols.sip3.ReqResFilter;


/**
 * Request Response protocol
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SIP3_Port_ReqRes", targetNamespace = "urn:nato:fft:protocols:sip3:wsdlservice")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    nato.fft.protocols.nffi13.ObjectFactory.class,
    nato.fft.protocols.nffi13.query.ObjectFactory.class,
    nato.fft.protocols.sip3.ObjectFactory.class,
    nato.fft.protocols.sip3.compression.ObjectFactory.class,
    nato.fft.protocols.sip3.delivery.batched.ObjectFactory.class,
    nato.fft.protocols.sip3.errors.ObjectFactory.class
})
public interface SIP3PortReqRes {


    /**
     * 
     * @param request
     * @return
     *     returns nato.fft.protocols.sip3.NFFIDataResponse
     * @throws PullDataFaultMessage
     */
    @WebMethod(operationName = "PullDataOperation", action = "PullDataOperation")
    @WebResult(name = "NFFIDataResponse", targetNamespace = "urn:nato:fft:protocols:sip3", partName = "response")
    public NFFIDataResponse pullDataOperation(
        @WebParam(name = "ReqResFilter", targetNamespace = "urn:nato:fft:protocols:sip3", partName = "request")
        ReqResFilter request)
        throws PullDataFaultMessage
    ;

}

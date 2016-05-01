
package nato.fft.protocols.sip3.delivery.batched;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nato.fft.protocols.sip3.delivery.batched package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MinTime_QNAME = new QName("urn:nato:fft:protocols:sip3:delivery:batched", "MinTime");
    private final static QName _Heartbeats_QNAME = new QName("urn:nato:fft:protocols:sip3:delivery:batched", "Heartbeats");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nato.fft.protocols.sip3.delivery.batched
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nato:fft:protocols:sip3:delivery:batched", name = "MinTime", defaultValue = "30")
    public JAXBElement<Long> createMinTime(Long value) {
        return new JAXBElement<Long>(_MinTime_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nato:fft:protocols:sip3:delivery:batched", name = "Heartbeats", defaultValue = "true")
    public JAXBElement<Boolean> createHeartbeats(Boolean value) {
        return new JAXBElement<Boolean>(_Heartbeats_QNAME, Boolean.class, null, value);
    }

}

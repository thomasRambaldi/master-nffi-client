
package nato.fft.protocols.sip3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import nato.fft.protocols.sip3.compression.CompressionAlgType;
import nato.fft.protocols.sip3.compression.CompressionAlgorithmsSupported;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nato.fft.protocols.sip3 package. 
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

    private final static QName _CompressionAlgUsed_QNAME = new QName("urn:nato:fft:protocols:sip3", "CompressionAlgUsed");
    private final static QName _SIP3DataRequest_QNAME = new QName("urn:nato:fft:protocols:sip3", "SIP3DataRequest");
    private final static QName _CompressionAlgsSupported_QNAME = new QName("urn:nato:fft:protocols:sip3", "CompressionAlgsSupported");
    private final static QName _SIP3DataResponse_QNAME = new QName("urn:nato:fft:protocols:sip3", "SIP3DataResponse");
    private final static QName _GenericRequestTypeFilter_QNAME = new QName("urn:nato:fft:protocols:sip3", "Filter");
    private final static QName _GenericRequestTypeResponseDialect_QNAME = new QName("urn:nato:fft:protocols:sip3", "ResponseDialect");
    private final static QName _GenericResponseTypeMessage_QNAME = new QName("urn:nato:fft:protocols:sip3", "Message");
    private final static QName _GenericResponseTypeAllAvailableDataTransferred_QNAME = new QName("urn:nato:fft:protocols:sip3", "allAvailableDataTransferred");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nato.fft.protocols.sip3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReqResFilter }
     * 
     */
    public ReqResFilter createReqResFilter() {
        return new ReqResFilter();
    }

    /**
     * Create an instance of {@link ReqResPeriodType }
     * 
     */
    public ReqResPeriodType createReqResPeriodType() {
        return new ReqResPeriodType();
    }

    /**
     * Create an instance of {@link NFFIDataResponse }
     * 
     */
    public NFFIDataResponse createNFFIDataResponse() {
        return new NFFIDataResponse();
    }

    /**
     * Create an instance of {@link GenericResponseType }
     * 
     */
    public GenericResponseType createGenericResponseType() {
        return new GenericResponseType();
    }

    /**
     * Create an instance of {@link GenericRequestType }
     * 
     */
    public GenericRequestType createGenericRequestType() {
        return new GenericRequestType();
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompressionAlgType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nato:fft:protocols:sip3", name = "CompressionAlgUsed")
    public JAXBElement<CompressionAlgType> createCompressionAlgUsed(CompressionAlgType value) {
        return new JAXBElement<CompressionAlgType>(_CompressionAlgUsed_QNAME, CompressionAlgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nato:fft:protocols:sip3", name = "SIP3DataRequest")
    public JAXBElement<GenericRequestType> createSIP3DataRequest(GenericRequestType value) {
        return new JAXBElement<GenericRequestType>(_SIP3DataRequest_QNAME, GenericRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompressionAlgorithmsSupported }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nato:fft:protocols:sip3", name = "CompressionAlgsSupported")
    public JAXBElement<CompressionAlgorithmsSupported> createCompressionAlgsSupported(CompressionAlgorithmsSupported value) {
        return new JAXBElement<CompressionAlgorithmsSupported>(_CompressionAlgsSupported_QNAME, CompressionAlgorithmsSupported.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenericResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nato:fft:protocols:sip3", name = "SIP3DataResponse")
    public JAXBElement<GenericResponseType> createSIP3DataResponse(GenericResponseType value) {
        return new JAXBElement<GenericResponseType>(_SIP3DataResponse_QNAME, GenericResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nato:fft:protocols:sip3", name = "Filter", scope = GenericRequestType.class)
    public JAXBElement<DataType> createGenericRequestTypeFilter(DataType value) {
        return new JAXBElement<DataType>(_GenericRequestTypeFilter_QNAME, DataType.class, GenericRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nato:fft:protocols:sip3", name = "ResponseDialect", scope = GenericRequestType.class)
    public JAXBElement<String> createGenericRequestTypeResponseDialect(String value) {
        return new JAXBElement<String>(_GenericRequestTypeResponseDialect_QNAME, String.class, GenericRequestType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nato:fft:protocols:sip3", name = "Message", scope = GenericResponseType.class)
    public JAXBElement<DataType> createGenericResponseTypeMessage(DataType value) {
        return new JAXBElement<DataType>(_GenericResponseTypeMessage_QNAME, DataType.class, GenericResponseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nato:fft:protocols:sip3", name = "allAvailableDataTransferred", scope = GenericResponseType.class)
    public JAXBElement<Boolean> createGenericResponseTypeAllAvailableDataTransferred(Boolean value) {
        return new JAXBElement<Boolean>(_GenericResponseTypeAllAvailableDataTransferred_QNAME, Boolean.class, GenericResponseType.class, value);
    }

}

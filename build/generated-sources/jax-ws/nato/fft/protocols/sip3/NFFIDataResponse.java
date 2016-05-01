
package nato.fft.protocols.sip3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import nato.fft.protocols.nffi13.NFFIMessage;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allAvailableDataTransferred" type="{urn:nato:fft:protocols:sip3}allAvailableDataTransferredType"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:nato:fft:protocols:nffi13}NFFIMessage"/>
 *           &lt;element name="compressedMessage" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allAvailableDataTransferred",
    "nffiMessage",
    "compressedMessage"
})
@XmlRootElement(name = "NFFIDataResponse")
public class NFFIDataResponse {

    protected boolean allAvailableDataTransferred;
    @XmlElement(name = "NFFIMessage", namespace = "urn:nato:fft:protocols:nffi13")
    protected NFFIMessage nffiMessage;
    protected byte[] compressedMessage;

    /**
     * Gets the value of the allAvailableDataTransferred property.
     * 
     */
    public boolean isAllAvailableDataTransferred() {
        return allAvailableDataTransferred;
    }

    /**
     * Sets the value of the allAvailableDataTransferred property.
     * 
     */
    public void setAllAvailableDataTransferred(boolean value) {
        this.allAvailableDataTransferred = value;
    }

    /**
     * Gets the value of the nffiMessage property.
     * 
     * @return
     *     possible object is
     *     {@link NFFIMessage }
     *     
     */
    public NFFIMessage getNFFIMessage() {
        return nffiMessage;
    }

    /**
     * Sets the value of the nffiMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NFFIMessage }
     *     
     */
    public void setNFFIMessage(NFFIMessage value) {
        this.nffiMessage = value;
    }

    /**
     * Gets the value of the compressedMessage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCompressedMessage() {
        return compressedMessage;
    }

    /**
     * Sets the value of the compressedMessage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCompressedMessage(byte[] value) {
        this.compressedMessage = value;
    }

}


package nato.fft.protocols.nffi13.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose: unambiguous identification of data source. 
 * Format: contains a value being a combination of data on the device that transmitted the data and the system which releases the data. The value has to be unique for every device/system in order to unambiguously identify the source of information. 
 * 
 * <p>Java class for trackSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trackSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceSystem" type="{urn:nato:fft:protocols:nffi13:query}SourceSystemType" minOccurs="0"/>
 *         &lt;element name="transponderId" type="{urn:nato:fft:protocols:nffi13:query}transponderIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackSourceType", propOrder = {
    "sourceSystem",
    "transponderId"
})
public class TrackSourceType {

    protected SourceSystemType sourceSystem;
    protected String transponderId;

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SourceSystemType }
     *     
     */
    public SourceSystemType getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceSystemType }
     *     
     */
    public void setSourceSystem(SourceSystemType value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the transponderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransponderId() {
        return transponderId;
    }

    /**
     * Sets the value of the transponderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransponderId(String value) {
        this.transponderId = value;
    }

}

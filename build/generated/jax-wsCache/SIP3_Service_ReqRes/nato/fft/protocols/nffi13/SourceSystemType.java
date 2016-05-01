
package nato.fft.protocols.nffi13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose: track data source identification. 
 * Format: identifies track data owner/producer (system that releases the data and country which controls the system). The element is critical for providing track uniqueness. Therefore all the three elements should be used when applicable despite only 'system' element is mandatory. 
 * 
 * <p>Java class for sourceSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sourceSystemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{urn:nato:fft:protocols:nffi13}countryType" minOccurs="0"/>
 *         &lt;element name="system" type="{urn:nato:fft:protocols:nffi13}systemType"/>
 *         &lt;element name="subsystem" type="{urn:nato:fft:protocols:nffi13}systemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceSystemType", propOrder = {
    "country",
    "system",
    "subsystem"
})
public class SourceSystemType {

    protected String country;
    @XmlElement(required = true)
    protected String system;
    protected String subsystem;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

    /**
     * Gets the value of the subsystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsystem() {
        return subsystem;
    }

    /**
     * Sets the value of the subsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsystem(String value) {
        this.subsystem = value;
    }

}

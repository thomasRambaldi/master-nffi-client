
package nato.fft.protocols.nffi13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose: provides information on operational status of the unit associated with data in 'positionalData' section.
 * Format: All elements of the section are optional. 
 * 
 * <p>Java class for operStatusDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operStatusDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="footprint" type="{urn:nato:fft:protocols:nffi13}footprintType" minOccurs="0"/>
 *         &lt;element name="strength" type="{urn:nato:fft:protocols:nffi13}strengthType" minOccurs="0"/>
 *         &lt;element name="statusCode" type="{urn:nato:fft:protocols:nffi13}statusCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="secPolicyName" type="{urn:nato:fft:protocols:nffi13}secPolicyNameType" />
 *       &lt;attribute name="secClassification" type="{urn:nato:fft:protocols:nffi13}secClassificationType" />
 *       &lt;attribute name="secCategory" type="{urn:nato:fft:protocols:nffi13}secCategoryType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operStatusDataType", propOrder = {
    "footprint",
    "strength",
    "statusCode"
})
public class OperStatusDataType {

    protected Double footprint;
    protected Integer strength;
    protected StatusCodeType statusCode;
    @XmlAttribute(name = "secPolicyName")
    protected String secPolicyName;
    @XmlAttribute(name = "secClassification")
    protected String secClassification;
    @XmlAttribute(name = "secCategory")
    protected String secCategory;

    /**
     * Gets the value of the footprint property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFootprint() {
        return footprint;
    }

    /**
     * Sets the value of the footprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFootprint(Double value) {
        this.footprint = value;
    }

    /**
     * Gets the value of the strength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStrength() {
        return strength;
    }

    /**
     * Sets the value of the strength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStrength(Integer value) {
        this.strength = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeType }
     *     
     */
    public StatusCodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeType }
     *     
     */
    public void setStatusCode(StatusCodeType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the secPolicyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecPolicyName() {
        return secPolicyName;
    }

    /**
     * Sets the value of the secPolicyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecPolicyName(String value) {
        this.secPolicyName = value;
    }

    /**
     * Gets the value of the secClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecClassification() {
        return secClassification;
    }

    /**
     * Sets the value of the secClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecClassification(String value) {
        this.secClassification = value;
    }

    /**
     * Gets the value of the secCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecCategory() {
        return secCategory;
    }

    /**
     * Sets the value of the secCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecCategory(String value) {
        this.secCategory = value;
    }

}

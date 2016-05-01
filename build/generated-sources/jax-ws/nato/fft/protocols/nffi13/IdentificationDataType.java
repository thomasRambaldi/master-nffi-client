
package nato.fft.protocols.nffi13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose: identification of the unit that is associated with data in the 'positionalData' section. Usually needed for a standard situation display.
 * 
 * <p>Java class for identificationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identificationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitSymbol" type="{urn:nato:fft:protocols:nffi13}unitSymbolType"/>
 *         &lt;element name="unitShortName" type="{urn:nato:fft:protocols:nffi13}unitShortNameType"/>
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
@XmlType(name = "identificationDataType", propOrder = {
    "unitSymbol",
    "unitShortName"
})
public class IdentificationDataType {

    @XmlElement(required = true)
    protected String unitSymbol;
    @XmlElement(required = true)
    protected String unitShortName;
    @XmlAttribute(name = "secPolicyName")
    protected String secPolicyName;
    @XmlAttribute(name = "secClassification")
    protected String secClassification;
    @XmlAttribute(name = "secCategory")
    protected String secCategory;

    /**
     * Gets the value of the unitSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitSymbol() {
        return unitSymbol;
    }

    /**
     * Sets the value of the unitSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitSymbol(String value) {
        this.unitSymbol = value;
    }

    /**
     * Gets the value of the unitShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitShortName() {
        return unitShortName;
    }

    /**
     * Sets the value of the unitShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitShortName(String value) {
        this.unitShortName = value;
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

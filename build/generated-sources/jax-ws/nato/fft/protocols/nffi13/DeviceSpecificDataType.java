
package nato.fft.protocols.nffi13;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose: additional data which can be provided by some of the sensors.
 * Format: all elements of this type are optional.
 * 
 * <p>Java class for deviceSpecificDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deviceSpecificDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalId" type="{urn:nato:fft:protocols:nffi13}additionalIdType" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{urn:nato:fft:protocols:nffi13}phoneNumberType" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{urn:nato:fft:protocols:nffi13}serialNumberType" minOccurs="0"/>
 *         &lt;element name="terminalType" type="{urn:nato:fft:protocols:nffi13}terminalTypeType" minOccurs="0"/>
 *         &lt;element name="terminalId" type="{urn:nato:fft:protocols:nffi13}terminalIdType" minOccurs="0"/>
 *         &lt;element name="specialUserDefined" type="{urn:nato:fft:protocols:nffi13}specialUserDefinedType" minOccurs="0"/>
 *         &lt;element name="alert" type="{urn:nato:fft:protocols:nffi13}alertType" minOccurs="0"/>
 *         &lt;element name="remarks" type="{urn:nato:fft:protocols:nffi13}remarksType" maxOccurs="4" minOccurs="0"/>
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
@XmlType(name = "deviceSpecificDataType", propOrder = {
    "additionalId",
    "phoneNumber",
    "serialNumber",
    "terminalType",
    "terminalId",
    "specialUserDefined",
    "alert",
    "remarks"
})
public class DeviceSpecificDataType {

    protected String additionalId;
    protected String phoneNumber;
    protected String serialNumber;
    protected String terminalType;
    protected String terminalId;
    protected String specialUserDefined;
    protected Boolean alert;
    protected List<String> remarks;
    @XmlAttribute(name = "secPolicyName")
    protected String secPolicyName;
    @XmlAttribute(name = "secClassification")
    protected String secClassification;
    @XmlAttribute(name = "secCategory")
    protected String secCategory;

    /**
     * Gets the value of the additionalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalId() {
        return additionalId;
    }

    /**
     * Sets the value of the additionalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalId(String value) {
        this.additionalId = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the terminalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * Sets the value of the terminalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(String value) {
        this.terminalType = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the specialUserDefined property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialUserDefined() {
        return specialUserDefined;
    }

    /**
     * Sets the value of the specialUserDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialUserDefined(String value) {
        this.specialUserDefined = value;
    }

    /**
     * Gets the value of the alert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlert() {
        return alert;
    }

    /**
     * Sets the value of the alert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlert(Boolean value) {
        this.alert = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<String>();
        }
        return this.remarks;
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

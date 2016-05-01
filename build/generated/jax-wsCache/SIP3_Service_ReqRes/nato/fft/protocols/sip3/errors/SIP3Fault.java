
package nato.fft.protocols.sip3.errors;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SIP3FCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SIP3FString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SIP3FSupportedDialect" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
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
    "sip3FCode",
    "sip3FString",
    "sip3FSupportedDialect"
})
@XmlRootElement(name = "SIP3Fault")
public class SIP3Fault {

    @XmlElement(name = "SIP3FCode", required = true)
    protected String sip3FCode;
    @XmlElement(name = "SIP3FString", required = true)
    protected String sip3FString;
    @XmlElement(name = "SIP3FSupportedDialect")
    @XmlSchemaType(name = "anyURI")
    protected List<String> sip3FSupportedDialect;

    /**
     * Gets the value of the sip3FCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIP3FCode() {
        return sip3FCode;
    }

    /**
     * Sets the value of the sip3FCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIP3FCode(String value) {
        this.sip3FCode = value;
    }

    /**
     * Gets the value of the sip3FString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIP3FString() {
        return sip3FString;
    }

    /**
     * Sets the value of the sip3FString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIP3FString(String value) {
        this.sip3FString = value;
    }

    /**
     * Gets the value of the sip3FSupportedDialect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sip3FSupportedDialect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSIP3FSupportedDialect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSIP3FSupportedDialect() {
        if (sip3FSupportedDialect == null) {
            sip3FSupportedDialect = new ArrayList<String>();
        }
        return this.sip3FSupportedDialect;
    }

}

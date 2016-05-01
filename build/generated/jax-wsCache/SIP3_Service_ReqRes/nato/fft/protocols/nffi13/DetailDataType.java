
package nato.fft.protocols.nffi13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * Purpose: Gives some flexibility in the future addition of extensions to the message definition. It can be used to include specific ad hoc requirements and/or to carry information that is specific to smaller communities of producers and consumers and require more intimate knowledge of the operating domain. 
 * 
 * <p>Java class for detailDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detailDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="secPolicyName" type="{urn:nato:fft:protocols:nffi13}secPolicyNameType" />
 *       &lt;attribute name="secClassification" type="{urn:nato:fft:protocols:nffi13}secClassificationType" />
 *       &lt;attribute name="secCategory" type="{urn:nato:fft:protocols:nffi13}secCategoryType" />
 *       &lt;anyAttribute processContents='skip'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detailDataType", propOrder = {
    "any"
})
public class DetailDataType {

    @XmlAnyElement
    protected List<Element> any;
    @XmlAttribute(name = "secPolicyName")
    protected String secPolicyName;
    @XmlAttribute(name = "secClassification")
    protected String secClassification;
    @XmlAttribute(name = "secCategory")
    protected String secCategory;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
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

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}


package nato.fft.protocols.sip3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import nato.fft.protocols.nffi13.query.NFFIFilterType;


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
 *         &lt;element name="period" type="{urn:nato:fft:protocols:sip3}ReqResPeriodType" minOccurs="0"/>
 *         &lt;element ref="{urn:nato:fft:protocols:nffi13:query}NFFIFilter" minOccurs="0"/>
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
    "period",
    "nffiFilter"
})
@XmlRootElement(name = "ReqResFilter")
public class ReqResFilter {

    protected ReqResPeriodType period;
    @XmlElement(name = "NFFIFilter", namespace = "urn:nato:fft:protocols:nffi13:query")
    protected NFFIFilterType nffiFilter;

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link ReqResPeriodType }
     *     
     */
    public ReqResPeriodType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqResPeriodType }
     *     
     */
    public void setPeriod(ReqResPeriodType value) {
        this.period = value;
    }

    /**
     * Gets the value of the nffiFilter property.
     * 
     * @return
     *     possible object is
     *     {@link NFFIFilterType }
     *     
     */
    public NFFIFilterType getNFFIFilter() {
        return nffiFilter;
    }

    /**
     * Sets the value of the nffiFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link NFFIFilterType }
     *     
     */
    public void setNFFIFilter(NFFIFilterType value) {
        this.nffiFilter = value;
    }

}

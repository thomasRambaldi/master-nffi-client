
package nato.fft.protocols.nffi13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Purpose: Provides data related to a track. The data is divided into five sections - positional data ('positionalData' element), unit identification data ('identificationData' element), unit operational status data ('operStatusData' element), device specific data ('deviceSpecificData' element), and non-standard detailed data ('detailData'). A single track can be uniquely identified by a combination of values in 'trackSource' and 'dateTime' elements from 'positionalData' section.   
 * Format: A single track contains one and only one 'positionalData' element. It is a mandatory element. All the other elements, i.e. 'identificationData', 'operStatusData', 'deviceSpecificData', and 'detailData' are optional. 
 * 
 * <p>Java class for trackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trackType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionalData" type="{urn:nato:fft:protocols:nffi13}positionalDataType"/>
 *         &lt;element name="identificationData" type="{urn:nato:fft:protocols:nffi13}identificationDataType" minOccurs="0"/>
 *         &lt;element name="operStatusData" type="{urn:nato:fft:protocols:nffi13}operStatusDataType" minOccurs="0"/>
 *         &lt;element name="deviceSpecificData" type="{urn:nato:fft:protocols:nffi13}deviceSpecificDataType" minOccurs="0"/>
 *         &lt;element name="detailData" type="{urn:nato:fft:protocols:nffi13}detailDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackType", propOrder = {
    "positionalData",
    "identificationData",
    "operStatusData",
    "deviceSpecificData",
    "detailData"
})
public class TrackType {

    @XmlElement(required = true)
    protected PositionalDataType positionalData;
    protected IdentificationDataType identificationData;
    protected OperStatusDataType operStatusData;
    protected DeviceSpecificDataType deviceSpecificData;
    protected DetailDataType detailData;

    /**
     * Gets the value of the positionalData property.
     * 
     * @return
     *     possible object is
     *     {@link PositionalDataType }
     *     
     */
    public PositionalDataType getPositionalData() {
        return positionalData;
    }

    /**
     * Sets the value of the positionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionalDataType }
     *     
     */
    public void setPositionalData(PositionalDataType value) {
        this.positionalData = value;
    }

    /**
     * Gets the value of the identificationData property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationDataType }
     *     
     */
    public IdentificationDataType getIdentificationData() {
        return identificationData;
    }

    /**
     * Sets the value of the identificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationDataType }
     *     
     */
    public void setIdentificationData(IdentificationDataType value) {
        this.identificationData = value;
    }

    /**
     * Gets the value of the operStatusData property.
     * 
     * @return
     *     possible object is
     *     {@link OperStatusDataType }
     *     
     */
    public OperStatusDataType getOperStatusData() {
        return operStatusData;
    }

    /**
     * Sets the value of the operStatusData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperStatusDataType }
     *     
     */
    public void setOperStatusData(OperStatusDataType value) {
        this.operStatusData = value;
    }

    /**
     * Gets the value of the deviceSpecificData property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSpecificDataType }
     *     
     */
    public DeviceSpecificDataType getDeviceSpecificData() {
        return deviceSpecificData;
    }

    /**
     * Sets the value of the deviceSpecificData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSpecificDataType }
     *     
     */
    public void setDeviceSpecificData(DeviceSpecificDataType value) {
        this.deviceSpecificData = value;
    }

    /**
     * Gets the value of the detailData property.
     * 
     * @return
     *     possible object is
     *     {@link DetailDataType }
     *     
     */
    public DetailDataType getDetailData() {
        return detailData;
    }

    /**
     * Sets the value of the detailData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailDataType }
     *     
     */
    public void setDetailData(DetailDataType value) {
        this.detailData = value;
    }

}

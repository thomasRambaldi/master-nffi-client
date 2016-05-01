
package nato.fft.protocols.nffi13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Purpose: section of positional and track identification data. Defines a structure of 'positionalData' element, which is a mandatory field in an element of 'trackType' type. 
 * Format: Contains a set of elements which all together constitute positional data. as well as a set attributes for security labeling. Every element type is defined separately. 
 * 
 * <p>Java class for positionalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="positionalDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trackSource" type="{urn:nato:fft:protocols:nffi13}trackSourceType"/>
 *         &lt;element name="dateTime" type="{urn:nato:fft:protocols:nffi13}dateTimeType"/>
 *         &lt;element name="coordinates" type="{urn:nato:fft:protocols:nffi13}coordinatesType"/>
 *         &lt;element name="bearing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>bearingType">
 *                 &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}bearingAccuracyType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="speed" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>speedType">
 *                 &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}speedAccuracyType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reliability" type="{urn:nato:fft:protocols:nffi13}reliabilityType" minOccurs="0"/>
 *         &lt;element name="credibility" type="{urn:nato:fft:protocols:nffi13}credibilityType" minOccurs="0"/>
 *         &lt;element name="inclination" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>inclinationType">
 *                 &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}inclinationAccuacyType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "positionalDataType", propOrder = {
    "trackSource",
    "dateTime",
    "coordinates",
    "bearing",
    "speed",
    "reliability",
    "credibility",
    "inclination"
})
public class PositionalDataType {

    @XmlElement(required = true)
    protected TrackSourceType trackSource;
    @XmlElement(required = true)
    protected String dateTime;
    @XmlElement(required = true)
    protected CoordinatesType coordinates;
    protected PositionalDataType.Bearing bearing;
    protected PositionalDataType.Speed speed;
    protected ReliabilityType reliability;
    protected CredibilityType credibility;
    protected PositionalDataType.Inclination inclination;
    @XmlAttribute(name = "secPolicyName")
    protected String secPolicyName;
    @XmlAttribute(name = "secClassification")
    protected String secClassification;
    @XmlAttribute(name = "secCategory")
    protected String secCategory;

    /**
     * Gets the value of the trackSource property.
     * 
     * @return
     *     possible object is
     *     {@link TrackSourceType }
     *     
     */
    public TrackSourceType getTrackSource() {
        return trackSource;
    }

    /**
     * Sets the value of the trackSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackSourceType }
     *     
     */
    public void setTrackSource(TrackSourceType value) {
        this.trackSource = value;
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the bearing property.
     * 
     * @return
     *     possible object is
     *     {@link PositionalDataType.Bearing }
     *     
     */
    public PositionalDataType.Bearing getBearing() {
        return bearing;
    }

    /**
     * Sets the value of the bearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionalDataType.Bearing }
     *     
     */
    public void setBearing(PositionalDataType.Bearing value) {
        this.bearing = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link PositionalDataType.Speed }
     *     
     */
    public PositionalDataType.Speed getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionalDataType.Speed }
     *     
     */
    public void setSpeed(PositionalDataType.Speed value) {
        this.speed = value;
    }

    /**
     * Gets the value of the reliability property.
     * 
     * @return
     *     possible object is
     *     {@link ReliabilityType }
     *     
     */
    public ReliabilityType getReliability() {
        return reliability;
    }

    /**
     * Sets the value of the reliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReliabilityType }
     *     
     */
    public void setReliability(ReliabilityType value) {
        this.reliability = value;
    }

    /**
     * Gets the value of the credibility property.
     * 
     * @return
     *     possible object is
     *     {@link CredibilityType }
     *     
     */
    public CredibilityType getCredibility() {
        return credibility;
    }

    /**
     * Sets the value of the credibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredibilityType }
     *     
     */
    public void setCredibility(CredibilityType value) {
        this.credibility = value;
    }

    /**
     * Gets the value of the inclination property.
     * 
     * @return
     *     possible object is
     *     {@link PositionalDataType.Inclination }
     *     
     */
    public PositionalDataType.Inclination getInclination() {
        return inclination;
    }

    /**
     * Sets the value of the inclination property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionalDataType.Inclination }
     *     
     */
    public void setInclination(PositionalDataType.Inclination value) {
        this.inclination = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>bearingType">
     *       &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}bearingAccuracyType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Bearing {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "accuracy")
        protected Double accuracy;

        /**
         * Purpose: The rotational measurement clockwise from the line of true North to the direction of motion of a specific track (see References : C2IEDM v 6.15e, JC3IEDM ed.3, US BFT COI EIS v.0.1). 
         * Format: Numeric representation in range including 0 and excluding 360 of the bearing value in decimal degree. 
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the accuracy property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getAccuracy() {
            return accuracy;
        }

        /**
         * Sets the value of the accuracy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setAccuracy(Double value) {
            this.accuracy = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>inclinationType">
     *       &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}inclinationAccuacyType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Inclination {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "accuracy")
        protected Double accuracy;

        /**
         * Purpose: The rotational measurement from the horizontal plane to the direction of motion of a specific battlespace object at a specific location where the positive angle is vertically upward (see References : JC3IEDM ed.3 and US BFT COI EIS v.0.1).
         * Format: Numeric representation in range including 0, excluding 360. Value in decimal degrees.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the accuracy property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getAccuracy() {
            return accuracy;
        }

        /**
         * Sets the value of the accuracy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setAccuracy(Double value) {
            this.accuracy = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>speedType">
     *       &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}speedAccuracyType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Speed {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "accuracy")
        protected Double accuracy;

        /**
         * Purpose: Speed value of the platform that holds the tracking device.
         * Format: Numeric representation of the speed value in Km per hours.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the accuracy property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getAccuracy() {
            return accuracy;
        }

        /**
         * Sets the value of the accuracy property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setAccuracy(Double value) {
            this.accuracy = value;
        }

    }

}


package nato.fft.protocols.nffi13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Purpose: object coordinates. 
 * Format: 2/3D geographical coordinates including latitude and longitude (mandatory) and altitude (optional). 
 * 
 * <p>Java class for coordinatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coordinatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latitude">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>latitudeType">
 *                 &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}horizontalAccuracyType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="longitude">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>longitudeType">
 *                 &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}horizontalAccuracyType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="altitude" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>altitudeType">
 *                 &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}altitudeAccuracyType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coordinatesType", propOrder = {
    "latitude",
    "longitude",
    "altitude"
})
public class CoordinatesType {

    @XmlElement(required = true)
    protected CoordinatesType.Latitude latitude;
    @XmlElement(required = true)
    protected CoordinatesType.Longitude longitude;
    protected CoordinatesType.Altitude altitude;

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType.Latitude }
     *     
     */
    public CoordinatesType.Latitude getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType.Latitude }
     *     
     */
    public void setLatitude(CoordinatesType.Latitude value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType.Longitude }
     *     
     */
    public CoordinatesType.Longitude getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType.Longitude }
     *     
     */
    public void setLongitude(CoordinatesType.Longitude value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType.Altitude }
     *     
     */
    public CoordinatesType.Altitude getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType.Altitude }
     *     
     */
    public void setAltitude(CoordinatesType.Altitude value) {
        this.altitude = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>altitudeType">
     *       &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}altitudeAccuracyType" />
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
    public static class Altitude {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "accuracy")
        protected Double accuracy;

        /**
         * Purpose: The vertical distance of a level, a point or an object considered as a point, measured from mean sea level (see Reference : AAP-6(2006)).
         * Format: Numeric data in meters msl. 
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
     *     &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>latitudeType">
     *       &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}horizontalAccuracyType" />
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
    public static class Latitude {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "accuracy")
        protected Double accuracy;

        /**
         * Purpose: Angular distance north or south of the earth's equator (see Reference ): WGS 84).
         * Format: Numeric data in range including -90, 90. Value in decimal degrees. 
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
     *     &lt;extension base="&lt;urn:nato:fft:protocols:nffi13>longitudeType">
     *       &lt;attribute name="accuracy" type="{urn:nato:fft:protocols:nffi13}horizontalAccuracyType" />
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
    public static class Longitude {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "accuracy")
        protected Double accuracy;

        /**
         * Purpose: Angular distance on the earth's surface, measured east or west from the prime meridian at Greenwich, England (see Reference : WGS 84).
         * Format: Numeric data in range excluding -180, including 180. Value in decimal degrees. 
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

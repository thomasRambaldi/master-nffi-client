
package nato.fft.protocols.nffi13.query;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NFFIFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NFFIFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="historyDepth" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="systemList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="incl_excl" type="{urn:nato:fft:protocols:nffi13:query}filterIncl_exclType" minOccurs="0"/>
 *                   &lt;element name="trackSource" type="{urn:nato:fft:protocols:nffi13:query}trackSourceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="geoFilter" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="rectangular" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="leftTopCorner">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
 *                                       &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="rightBottomCorner">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
 *                                       &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="closedPolygon" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="point" maxOccurs="unbounded" minOccurs="3">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
 *                                       &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="circle" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="center">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
 *                                       &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="XPathFilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxFrame" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "NFFIFilterType", propOrder = {
    "historyDepth",
    "systemList",
    "geoFilter",
    "xPathFilter",
    "maxFrame"
})
public class NFFIFilterType {

    @XmlElement(defaultValue = "1")
    protected Long historyDepth;
    protected NFFIFilterType.SystemList systemList;
    protected List<NFFIFilterType.GeoFilter> geoFilter;
    @XmlElement(name = "XPathFilter")
    protected List<String> xPathFilter;
    protected BigInteger maxFrame;

    /**
     * Gets the value of the historyDepth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHistoryDepth() {
        return historyDepth;
    }

    /**
     * Sets the value of the historyDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHistoryDepth(Long value) {
        this.historyDepth = value;
    }

    /**
     * Gets the value of the systemList property.
     * 
     * @return
     *     possible object is
     *     {@link NFFIFilterType.SystemList }
     *     
     */
    public NFFIFilterType.SystemList getSystemList() {
        return systemList;
    }

    /**
     * Sets the value of the systemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NFFIFilterType.SystemList }
     *     
     */
    public void setSystemList(NFFIFilterType.SystemList value) {
        this.systemList = value;
    }

    /**
     * Gets the value of the geoFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NFFIFilterType.GeoFilter }
     * 
     * 
     */
    public List<NFFIFilterType.GeoFilter> getGeoFilter() {
        if (geoFilter == null) {
            geoFilter = new ArrayList<NFFIFilterType.GeoFilter>();
        }
        return this.geoFilter;
    }

    /**
     * Gets the value of the xPathFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xPathFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXPathFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getXPathFilter() {
        if (xPathFilter == null) {
            xPathFilter = new ArrayList<String>();
        }
        return this.xPathFilter;
    }

    /**
     * Gets the value of the maxFrame property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxFrame() {
        return maxFrame;
    }

    /**
     * Sets the value of the maxFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxFrame(BigInteger value) {
        this.maxFrame = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="rectangular" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="leftTopCorner">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
     *                             &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="rightBottomCorner">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
     *                             &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="closedPolygon" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="point" maxOccurs="unbounded" minOccurs="3">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
     *                             &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="circle" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="center">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
     *                             &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rectangular",
        "closedPolygon",
        "circle"
    })
    public static class GeoFilter {

        protected NFFIFilterType.GeoFilter.Rectangular rectangular;
        protected NFFIFilterType.GeoFilter.ClosedPolygon closedPolygon;
        protected NFFIFilterType.GeoFilter.Circle circle;

        /**
         * Gets the value of the rectangular property.
         * 
         * @return
         *     possible object is
         *     {@link NFFIFilterType.GeoFilter.Rectangular }
         *     
         */
        public NFFIFilterType.GeoFilter.Rectangular getRectangular() {
            return rectangular;
        }

        /**
         * Sets the value of the rectangular property.
         * 
         * @param value
         *     allowed object is
         *     {@link NFFIFilterType.GeoFilter.Rectangular }
         *     
         */
        public void setRectangular(NFFIFilterType.GeoFilter.Rectangular value) {
            this.rectangular = value;
        }

        /**
         * Gets the value of the closedPolygon property.
         * 
         * @return
         *     possible object is
         *     {@link NFFIFilterType.GeoFilter.ClosedPolygon }
         *     
         */
        public NFFIFilterType.GeoFilter.ClosedPolygon getClosedPolygon() {
            return closedPolygon;
        }

        /**
         * Sets the value of the closedPolygon property.
         * 
         * @param value
         *     allowed object is
         *     {@link NFFIFilterType.GeoFilter.ClosedPolygon }
         *     
         */
        public void setClosedPolygon(NFFIFilterType.GeoFilter.ClosedPolygon value) {
            this.closedPolygon = value;
        }

        /**
         * Gets the value of the circle property.
         * 
         * @return
         *     possible object is
         *     {@link NFFIFilterType.GeoFilter.Circle }
         *     
         */
        public NFFIFilterType.GeoFilter.Circle getCircle() {
            return circle;
        }

        /**
         * Sets the value of the circle property.
         * 
         * @param value
         *     allowed object is
         *     {@link NFFIFilterType.GeoFilter.Circle }
         *     
         */
        public void setCircle(NFFIFilterType.GeoFilter.Circle value) {
            this.circle = value;
        }


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
         *         &lt;element name="center">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
         *                   &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
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
            "center",
            "radius"
        })
        public static class Circle {

            @XmlElement(required = true)
            protected NFFIFilterType.GeoFilter.Circle.Center center;
            @XmlElement(required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger radius;

            /**
             * Gets the value of the center property.
             * 
             * @return
             *     possible object is
             *     {@link NFFIFilterType.GeoFilter.Circle.Center }
             *     
             */
            public NFFIFilterType.GeoFilter.Circle.Center getCenter() {
                return center;
            }

            /**
             * Sets the value of the center property.
             * 
             * @param value
             *     allowed object is
             *     {@link NFFIFilterType.GeoFilter.Circle.Center }
             *     
             */
            public void setCenter(NFFIFilterType.GeoFilter.Circle.Center value) {
                this.center = value;
            }

            /**
             * Gets the value of the radius property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRadius() {
                return radius;
            }

            /**
             * Sets the value of the radius property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRadius(BigInteger value) {
                this.radius = value;
            }


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
             *         &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
             *         &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
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
                "longitude",
                "latitude"
            })
            public static class Center {

                protected double longitude;
                protected double latitude;

                /**
                 * Gets the value of the longitude property.
                 * 
                 */
                public double getLongitude() {
                    return longitude;
                }

                /**
                 * Sets the value of the longitude property.
                 * 
                 */
                public void setLongitude(double value) {
                    this.longitude = value;
                }

                /**
                 * Gets the value of the latitude property.
                 * 
                 */
                public double getLatitude() {
                    return latitude;
                }

                /**
                 * Sets the value of the latitude property.
                 * 
                 */
                public void setLatitude(double value) {
                    this.latitude = value;
                }

            }

        }


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
         *         &lt;element name="point" maxOccurs="unbounded" minOccurs="3">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
         *                   &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
        @XmlType(name = "", propOrder = {
            "point"
        })
        public static class ClosedPolygon {

            @XmlElement(required = true)
            protected List<NFFIFilterType.GeoFilter.ClosedPolygon.Point> point;

            /**
             * Gets the value of the point property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the point property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPoint().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NFFIFilterType.GeoFilter.ClosedPolygon.Point }
             * 
             * 
             */
            public List<NFFIFilterType.GeoFilter.ClosedPolygon.Point> getPoint() {
                if (point == null) {
                    point = new ArrayList<NFFIFilterType.GeoFilter.ClosedPolygon.Point>();
                }
                return this.point;
            }


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
             *         &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
             *         &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
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
                "longitude",
                "latitude"
            })
            public static class Point {

                protected double longitude;
                protected double latitude;

                /**
                 * Gets the value of the longitude property.
                 * 
                 */
                public double getLongitude() {
                    return longitude;
                }

                /**
                 * Sets the value of the longitude property.
                 * 
                 */
                public void setLongitude(double value) {
                    this.longitude = value;
                }

                /**
                 * Gets the value of the latitude property.
                 * 
                 */
                public double getLatitude() {
                    return latitude;
                }

                /**
                 * Sets the value of the latitude property.
                 * 
                 */
                public void setLatitude(double value) {
                    this.latitude = value;
                }

            }

        }


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
         *         &lt;element name="leftTopCorner">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
         *                   &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="rightBottomCorner">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
         *                   &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
        @XmlType(name = "", propOrder = {
            "leftTopCorner",
            "rightBottomCorner"
        })
        public static class Rectangular {

            @XmlElement(required = true)
            protected NFFIFilterType.GeoFilter.Rectangular.LeftTopCorner leftTopCorner;
            @XmlElement(required = true)
            protected NFFIFilterType.GeoFilter.Rectangular.RightBottomCorner rightBottomCorner;

            /**
             * Gets the value of the leftTopCorner property.
             * 
             * @return
             *     possible object is
             *     {@link NFFIFilterType.GeoFilter.Rectangular.LeftTopCorner }
             *     
             */
            public NFFIFilterType.GeoFilter.Rectangular.LeftTopCorner getLeftTopCorner() {
                return leftTopCorner;
            }

            /**
             * Sets the value of the leftTopCorner property.
             * 
             * @param value
             *     allowed object is
             *     {@link NFFIFilterType.GeoFilter.Rectangular.LeftTopCorner }
             *     
             */
            public void setLeftTopCorner(NFFIFilterType.GeoFilter.Rectangular.LeftTopCorner value) {
                this.leftTopCorner = value;
            }

            /**
             * Gets the value of the rightBottomCorner property.
             * 
             * @return
             *     possible object is
             *     {@link NFFIFilterType.GeoFilter.Rectangular.RightBottomCorner }
             *     
             */
            public NFFIFilterType.GeoFilter.Rectangular.RightBottomCorner getRightBottomCorner() {
                return rightBottomCorner;
            }

            /**
             * Sets the value of the rightBottomCorner property.
             * 
             * @param value
             *     allowed object is
             *     {@link NFFIFilterType.GeoFilter.Rectangular.RightBottomCorner }
             *     
             */
            public void setRightBottomCorner(NFFIFilterType.GeoFilter.Rectangular.RightBottomCorner value) {
                this.rightBottomCorner = value;
            }


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
             *         &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
             *         &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
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
                "longitude",
                "latitude"
            })
            public static class LeftTopCorner {

                protected double longitude;
                protected double latitude;

                /**
                 * Gets the value of the longitude property.
                 * 
                 */
                public double getLongitude() {
                    return longitude;
                }

                /**
                 * Sets the value of the longitude property.
                 * 
                 */
                public void setLongitude(double value) {
                    this.longitude = value;
                }

                /**
                 * Gets the value of the latitude property.
                 * 
                 */
                public double getLatitude() {
                    return latitude;
                }

                /**
                 * Sets the value of the latitude property.
                 * 
                 */
                public void setLatitude(double value) {
                    this.latitude = value;
                }

            }


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
             *         &lt;element name="longitude" type="{urn:nato:fft:protocols:nffi13}longitudeType"/>
             *         &lt;element name="latitude" type="{urn:nato:fft:protocols:nffi13}latitudeType"/>
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
                "longitude",
                "latitude"
            })
            public static class RightBottomCorner {

                protected double longitude;
                protected double latitude;

                /**
                 * Gets the value of the longitude property.
                 * 
                 */
                public double getLongitude() {
                    return longitude;
                }

                /**
                 * Sets the value of the longitude property.
                 * 
                 */
                public void setLongitude(double value) {
                    this.longitude = value;
                }

                /**
                 * Gets the value of the latitude property.
                 * 
                 */
                public double getLatitude() {
                    return latitude;
                }

                /**
                 * Sets the value of the latitude property.
                 * 
                 */
                public void setLatitude(double value) {
                    this.latitude = value;
                }

            }

        }

    }


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
     *         &lt;element name="incl_excl" type="{urn:nato:fft:protocols:nffi13:query}filterIncl_exclType" minOccurs="0"/>
     *         &lt;element name="trackSource" type="{urn:nato:fft:protocols:nffi13:query}trackSourceType" maxOccurs="unbounded"/>
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
        "inclExcl",
        "trackSource"
    })
    public static class SystemList {

        @XmlElement(name = "incl_excl", defaultValue = "INCLUSIVE")
        protected FilterInclExclType inclExcl;
        @XmlElement(required = true)
        protected List<TrackSourceType> trackSource;

        /**
         * Gets the value of the inclExcl property.
         * 
         * @return
         *     possible object is
         *     {@link FilterInclExclType }
         *     
         */
        public FilterInclExclType getInclExcl() {
            return inclExcl;
        }

        /**
         * Sets the value of the inclExcl property.
         * 
         * @param value
         *     allowed object is
         *     {@link FilterInclExclType }
         *     
         */
        public void setInclExcl(FilterInclExclType value) {
            this.inclExcl = value;
        }

        /**
         * Gets the value of the trackSource property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trackSource property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrackSource().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrackSourceType }
         * 
         * 
         */
        public List<TrackSourceType> getTrackSource() {
            if (trackSource == null) {
                trackSource = new ArrayList<TrackSourceType>();
            }
            return this.trackSource;
        }

    }

}

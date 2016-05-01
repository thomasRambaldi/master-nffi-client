
package nato.fft.protocols.nffi13.query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nato.fft.protocols.nffi13.query package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NFFIFilter_QNAME = new QName("urn:nato:fft:protocols:nffi13:query", "NFFIFilter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nato.fft.protocols.nffi13.query
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NFFIFilterType }
     * 
     */
    public NFFIFilterType createNFFIFilterType() {
        return new NFFIFilterType();
    }

    /**
     * Create an instance of {@link NFFIFilterType.GeoFilter }
     * 
     */
    public NFFIFilterType.GeoFilter createNFFIFilterTypeGeoFilter() {
        return new NFFIFilterType.GeoFilter();
    }

    /**
     * Create an instance of {@link NFFIFilterType.GeoFilter.Circle }
     * 
     */
    public NFFIFilterType.GeoFilter.Circle createNFFIFilterTypeGeoFilterCircle() {
        return new NFFIFilterType.GeoFilter.Circle();
    }

    /**
     * Create an instance of {@link NFFIFilterType.GeoFilter.ClosedPolygon }
     * 
     */
    public NFFIFilterType.GeoFilter.ClosedPolygon createNFFIFilterTypeGeoFilterClosedPolygon() {
        return new NFFIFilterType.GeoFilter.ClosedPolygon();
    }

    /**
     * Create an instance of {@link NFFIFilterType.GeoFilter.Rectangular }
     * 
     */
    public NFFIFilterType.GeoFilter.Rectangular createNFFIFilterTypeGeoFilterRectangular() {
        return new NFFIFilterType.GeoFilter.Rectangular();
    }

    /**
     * Create an instance of {@link SourceSystemType }
     * 
     */
    public SourceSystemType createSourceSystemType() {
        return new SourceSystemType();
    }

    /**
     * Create an instance of {@link TrackSourceType }
     * 
     */
    public TrackSourceType createTrackSourceType() {
        return new TrackSourceType();
    }

    /**
     * Create an instance of {@link NFFIFilterType.SystemList }
     * 
     */
    public NFFIFilterType.SystemList createNFFIFilterTypeSystemList() {
        return new NFFIFilterType.SystemList();
    }

    /**
     * Create an instance of {@link NFFIFilterType.GeoFilter.Circle.Center }
     * 
     */
    public NFFIFilterType.GeoFilter.Circle.Center createNFFIFilterTypeGeoFilterCircleCenter() {
        return new NFFIFilterType.GeoFilter.Circle.Center();
    }

    /**
     * Create an instance of {@link NFFIFilterType.GeoFilter.ClosedPolygon.Point }
     * 
     */
    public NFFIFilterType.GeoFilter.ClosedPolygon.Point createNFFIFilterTypeGeoFilterClosedPolygonPoint() {
        return new NFFIFilterType.GeoFilter.ClosedPolygon.Point();
    }

    /**
     * Create an instance of {@link NFFIFilterType.GeoFilter.Rectangular.LeftTopCorner }
     * 
     */
    public NFFIFilterType.GeoFilter.Rectangular.LeftTopCorner createNFFIFilterTypeGeoFilterRectangularLeftTopCorner() {
        return new NFFIFilterType.GeoFilter.Rectangular.LeftTopCorner();
    }

    /**
     * Create an instance of {@link NFFIFilterType.GeoFilter.Rectangular.RightBottomCorner }
     * 
     */
    public NFFIFilterType.GeoFilter.Rectangular.RightBottomCorner createNFFIFilterTypeGeoFilterRectangularRightBottomCorner() {
        return new NFFIFilterType.GeoFilter.Rectangular.RightBottomCorner();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NFFIFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:nato:fft:protocols:nffi13:query", name = "NFFIFilter")
    public JAXBElement<NFFIFilterType> createNFFIFilter(NFFIFilterType value) {
        return new JAXBElement<NFFIFilterType>(_NFFIFilter_QNAME, NFFIFilterType.class, null, value);
    }

}

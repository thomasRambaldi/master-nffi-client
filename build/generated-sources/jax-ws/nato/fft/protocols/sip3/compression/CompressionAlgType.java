
package nato.fft.protocols.sip3.compression;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for compressionAlgType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="compressionAlgType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GZIP"/>
 *     &lt;enumeration value="EFX"/>
 *     &lt;enumeration value="XMLPPM"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "compressionAlgType")
@XmlEnum
public enum CompressionAlgType {

    GZIP,
    EFX,
    XMLPPM,
    NONE;

    public String value() {
        return name();
    }

    public static CompressionAlgType fromValue(String v) {
        return valueOf(v);
    }

}

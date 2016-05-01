
package nato.fft.protocols.nffi13;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for credibilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="credibilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFIRMED BY OTHER SOURCES"/>
 *     &lt;enumeration value="PROBABLY TRUE"/>
 *     &lt;enumeration value="POSSIBLY TRUE"/>
 *     &lt;enumeration value="DOUBTFULLY TRUE"/>
 *     &lt;enumeration value="IMPROBABLE"/>
 *     &lt;enumeration value="TRUTH CANNOT BE JUDGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "credibilityType")
@XmlEnum
public enum CredibilityType {

    @XmlEnumValue("CONFIRMED BY OTHER SOURCES")
    CONFIRMED_BY_OTHER_SOURCES("CONFIRMED BY OTHER SOURCES"),
    @XmlEnumValue("PROBABLY TRUE")
    PROBABLY_TRUE("PROBABLY TRUE"),
    @XmlEnumValue("POSSIBLY TRUE")
    POSSIBLY_TRUE("POSSIBLY TRUE"),
    @XmlEnumValue("DOUBTFULLY TRUE")
    DOUBTFULLY_TRUE("DOUBTFULLY TRUE"),
    IMPROBABLE("IMPROBABLE"),
    @XmlEnumValue("TRUTH CANNOT BE JUDGED")
    TRUTH_CANNOT_BE_JUDGED("TRUTH CANNOT BE JUDGED");
    private final String value;

    CredibilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CredibilityType fromValue(String v) {
        for (CredibilityType c: CredibilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

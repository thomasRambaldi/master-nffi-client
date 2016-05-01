
package nato.fft.protocols.nffi13;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reliabilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="reliabilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPLETELY RELIABLE"/>
 *     &lt;enumeration value="USUALLY RELIABLE"/>
 *     &lt;enumeration value="FAIRLY RELIABLE"/>
 *     &lt;enumeration value="NOT USUALLY RELIABLE"/>
 *     &lt;enumeration value="UNRELIABLE"/>
 *     &lt;enumeration value="RELIABILITY CANNOT BE JUDGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "reliabilityType")
@XmlEnum
public enum ReliabilityType {

    @XmlEnumValue("COMPLETELY RELIABLE")
    COMPLETELY_RELIABLE("COMPLETELY RELIABLE"),
    @XmlEnumValue("USUALLY RELIABLE")
    USUALLY_RELIABLE("USUALLY RELIABLE"),
    @XmlEnumValue("FAIRLY RELIABLE")
    FAIRLY_RELIABLE("FAIRLY RELIABLE"),
    @XmlEnumValue("NOT USUALLY RELIABLE")
    NOT_USUALLY_RELIABLE("NOT USUALLY RELIABLE"),
    UNRELIABLE("UNRELIABLE"),
    @XmlEnumValue("RELIABILITY CANNOT BE JUDGED")
    RELIABILITY_CANNOT_BE_JUDGED("RELIABILITY CANNOT BE JUDGED");
    private final String value;

    ReliabilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReliabilityType fromValue(String v) {
        for (ReliabilityType c: ReliabilityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

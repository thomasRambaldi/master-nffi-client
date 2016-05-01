
package nato.fft.protocols.nffi13;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OPERATIONAL"/>
 *     &lt;enumeration value="SUBSTANTIALLY OPERATIONAL"/>
 *     &lt;enumeration value="MARGINALLY OPERATIONAL"/>
 *     &lt;enumeration value="TEMPORARILY NOT OPERATIONAL"/>
 *     &lt;enumeration value="NOT OPERATIONAL"/>
 *     &lt;enumeration value="NOT KNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusCodeType")
@XmlEnum
public enum StatusCodeType {

    OPERATIONAL("OPERATIONAL"),
    @XmlEnumValue("SUBSTANTIALLY OPERATIONAL")
    SUBSTANTIALLY_OPERATIONAL("SUBSTANTIALLY OPERATIONAL"),
    @XmlEnumValue("MARGINALLY OPERATIONAL")
    MARGINALLY_OPERATIONAL("MARGINALLY OPERATIONAL"),
    @XmlEnumValue("TEMPORARILY NOT OPERATIONAL")
    TEMPORARILY_NOT_OPERATIONAL("TEMPORARILY NOT OPERATIONAL"),
    @XmlEnumValue("NOT OPERATIONAL")
    NOT_OPERATIONAL("NOT OPERATIONAL"),
    @XmlEnumValue("NOT KNOWN")
    NOT_KNOWN("NOT KNOWN");
    private final String value;

    StatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusCodeType fromValue(String v) {
        for (StatusCodeType c: StatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

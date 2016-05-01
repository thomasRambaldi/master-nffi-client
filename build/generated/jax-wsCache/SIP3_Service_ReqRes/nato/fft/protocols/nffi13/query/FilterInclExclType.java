
package nato.fft.protocols.nffi13.query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filterIncl_exclType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="filterIncl_exclType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INCLUSIVE"/>
 *     &lt;enumeration value="EXCLUSIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "filterIncl_exclType")
@XmlEnum
public enum FilterInclExclType {

    INCLUSIVE,
    EXCLUSIVE;

    public String value() {
        return name();
    }

    public static FilterInclExclType fromValue(String v) {
        return valueOf(v);
    }

}

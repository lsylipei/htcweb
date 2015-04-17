
package condor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HashType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="HashType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOHASH"/>
 *     &lt;enumeration value="MD5HASH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HashType")
@XmlEnum
public enum HashType {

    NOHASH("NOHASH"),
    @XmlEnumValue("MD5HASH")
    MD_5_HASH("MD5HASH");
    private final String value;

    HashType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HashType fromValue(String v) {
        for (HashType c: HashType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

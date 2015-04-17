
package condor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassAdAttrType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassAdAttrType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTEGER-ATTR"/>
 *     &lt;enumeration value="FLOAT-ATTR"/>
 *     &lt;enumeration value="STRING-ATTR"/>
 *     &lt;enumeration value="EXPRESSION-ATTR"/>
 *     &lt;enumeration value="BOOLEAN-ATTR"/>
 *     &lt;enumeration value="UNDEFINED-ATTR"/>
 *     &lt;enumeration value="ERROR-ATTR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClassAdAttrType")
@XmlEnum
public enum ClassAdAttrType {

    @XmlEnumValue("INTEGER-ATTR")
    INTEGER_ATTR("INTEGER-ATTR"),
    @XmlEnumValue("FLOAT-ATTR")
    FLOAT_ATTR("FLOAT-ATTR"),
    @XmlEnumValue("STRING-ATTR")
    STRING_ATTR("STRING-ATTR"),
    @XmlEnumValue("EXPRESSION-ATTR")
    EXPRESSION_ATTR("EXPRESSION-ATTR"),
    @XmlEnumValue("BOOLEAN-ATTR")
    BOOLEAN_ATTR("BOOLEAN-ATTR"),
    @XmlEnumValue("UNDEFINED-ATTR")
    UNDEFINED_ATTR("UNDEFINED-ATTR"),
    @XmlEnumValue("ERROR-ATTR")
    ERROR_ATTR("ERROR-ATTR");
    private final String value;

    ClassAdAttrType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassAdAttrType fromValue(String v) {
        for (ClassAdAttrType c: ClassAdAttrType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

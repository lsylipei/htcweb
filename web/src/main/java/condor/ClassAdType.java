
package condor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassAdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClassAdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STARTD-AD-TYPE"/>
 *     &lt;enumeration value="QUILL-AD-TYPE"/>
 *     &lt;enumeration value="SCHEDD-AD-TYPE"/>
 *     &lt;enumeration value="SUBMITTOR-AD-TYPE"/>
 *     &lt;enumeration value="LICENSE-AD-TYPE"/>
 *     &lt;enumeration value="MASTER-AD-TYPE"/>
 *     &lt;enumeration value="CKPTSRVR-AD-TYPE"/>
 *     &lt;enumeration value="COLLECTOR-AD-TYPE"/>
 *     &lt;enumeration value="STORAGE-AD-TYPE"/>
 *     &lt;enumeration value="NEGOTIATOR-AD-TYPE"/>
 *     &lt;enumeration value="HAD-AD-TYPE"/>
 *     &lt;enumeration value="GENERIC-AD-TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClassAdType")
@XmlEnum
public enum ClassAdType {

    @XmlEnumValue("STARTD-AD-TYPE")
    STARTD_AD_TYPE("STARTD-AD-TYPE"),
    @XmlEnumValue("QUILL-AD-TYPE")
    QUILL_AD_TYPE("QUILL-AD-TYPE"),
    @XmlEnumValue("SCHEDD-AD-TYPE")
    SCHEDD_AD_TYPE("SCHEDD-AD-TYPE"),
    @XmlEnumValue("SUBMITTOR-AD-TYPE")
    SUBMITTOR_AD_TYPE("SUBMITTOR-AD-TYPE"),
    @XmlEnumValue("LICENSE-AD-TYPE")
    LICENSE_AD_TYPE("LICENSE-AD-TYPE"),
    @XmlEnumValue("MASTER-AD-TYPE")
    MASTER_AD_TYPE("MASTER-AD-TYPE"),
    @XmlEnumValue("CKPTSRVR-AD-TYPE")
    CKPTSRVR_AD_TYPE("CKPTSRVR-AD-TYPE"),
    @XmlEnumValue("COLLECTOR-AD-TYPE")
    COLLECTOR_AD_TYPE("COLLECTOR-AD-TYPE"),
    @XmlEnumValue("STORAGE-AD-TYPE")
    STORAGE_AD_TYPE("STORAGE-AD-TYPE"),
    @XmlEnumValue("NEGOTIATOR-AD-TYPE")
    NEGOTIATOR_AD_TYPE("NEGOTIATOR-AD-TYPE"),
    @XmlEnumValue("HAD-AD-TYPE")
    HAD_AD_TYPE("HAD-AD-TYPE"),
    @XmlEnumValue("GENERIC-AD-TYPE")
    GENERIC_AD_TYPE("GENERIC-AD-TYPE");
    private final String value;

    ClassAdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClassAdType fromValue(String v) {
        for (ClassAdType c: ClassAdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package condor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="FAIL"/>
 *     &lt;enumeration value="INVALIDTRANSACTION"/>
 *     &lt;enumeration value="UNKNOWNCLUSTER"/>
 *     &lt;enumeration value="UNKNOWNJOB"/>
 *     &lt;enumeration value="UNKNOWNFILE"/>
 *     &lt;enumeration value="INCOMPLETE"/>
 *     &lt;enumeration value="INVALIDOFFSET"/>
 *     &lt;enumeration value="ALREADYEXISTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusCode")
@XmlEnum
public enum StatusCode {

    SUCCESS,
    FAIL,
    INVALIDTRANSACTION,
    UNKNOWNCLUSTER,
    UNKNOWNJOB,
    UNKNOWNFILE,
    INCOMPLETE,
    INVALIDOFFSET,
    ALREADYEXISTS;

    public String value() {
        return name();
    }

    public static StatusCode fromValue(String v) {
        return valueOf(v);
    }

}

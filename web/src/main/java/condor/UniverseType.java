
package condor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniverseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UniverseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="VANILLA"/>
 *     &lt;enumeration value="SCHEDULER"/>
 *     &lt;enumeration value="MPI"/>
 *     &lt;enumeration value="GRID"/>
 *     &lt;enumeration value="JAVA"/>
 *     &lt;enumeration value="PARALLEL"/>
 *     &lt;enumeration value="LOCAL"/>
 *     &lt;enumeration value="VM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UniverseType")
@XmlEnum
public enum UniverseType {

    STANDARD,
    VANILLA,
    SCHEDULER,
    MPI,
    GRID,
    JAVA,
    PARALLEL,
    LOCAL,
    VM;

    public String value() {
        return name();
    }

    public static UniverseType fromValue(String v) {
        return valueOf(v);
    }

}

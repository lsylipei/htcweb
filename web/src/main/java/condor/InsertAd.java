
package condor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{urn:condor}ClassAdType"/>
 *         &lt;element name="ad" type="{urn:condor}ClassAdStruct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "type",
    "ad"
})
@XmlRootElement(name = "insertAd")
public class InsertAd {

    @XmlElement(required = true)
    protected ClassAdType type;
    @XmlElement(required = true)
    protected ClassAdStruct ad;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ClassAdType }
     *     
     */
    public ClassAdType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassAdType }
     *     
     */
    public void setType(ClassAdType value) {
        this.type = value;
    }

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link ClassAdStruct }
     *     
     */
    public ClassAdStruct getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassAdStruct }
     *     
     */
    public void setAd(ClassAdStruct value) {
        this.ad = value;
    }

}

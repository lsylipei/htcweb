
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
 *         &lt;element name="response" type="{urn:condor}ClassAdStructArrayAndStatus"/>
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
    "response"
})
@XmlRootElement(name = "getJobAdsResponse")
public class GetJobAdsResponse {

    @XmlElement(required = true)
    protected ClassAdStructArrayAndStatus response;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ClassAdStructArrayAndStatus }
     *     
     */
    public ClassAdStructArrayAndStatus getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassAdStructArrayAndStatus }
     *     
     */
    public void setResponse(ClassAdStructArrayAndStatus value) {
        this.response = value;
    }

}

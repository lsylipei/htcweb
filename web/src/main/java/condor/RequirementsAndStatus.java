
package condor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequirementsAndStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequirementsAndStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{urn:condor}Status"/>
 *         &lt;element name="requirements" type="{urn:condor}Requirements" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequirementsAndStatus", propOrder = {
    "status",
    "requirements"
})
public class RequirementsAndStatus {

    @XmlElement(required = true)
    protected Status status;
    @XmlElementRef(name = "requirements", type = JAXBElement.class, required = false)
    protected JAXBElement<Requirements> requirements;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Requirements }{@code >}
     *     
     */
    public JAXBElement<Requirements> getRequirements() {
        return requirements;
    }

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Requirements }{@code >}
     *     
     */
    public void setRequirements(JAXBElement<Requirements> value) {
        this.requirements = value;
    }

}

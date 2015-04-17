
package condor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassAdStructArrayAndStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassAdStructArrayAndStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{urn:condor}Status"/>
 *         &lt;element name="classAdArray" type="{urn:condor}ClassAdStructArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassAdStructArrayAndStatus", propOrder = {
    "status",
    "classAdArray"
})
public class ClassAdStructArrayAndStatus {

    @XmlElement(required = true)
    protected Status status;
    @XmlElementRef(name = "classAdArray", type = JAXBElement.class, required = false)
    protected JAXBElement<ClassAdStructArray> classAdArray;

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
     * Gets the value of the classAdArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClassAdStructArray }{@code >}
     *     
     */
    public JAXBElement<ClassAdStructArray> getClassAdArray() {
        return classAdArray;
    }

    /**
     * Sets the value of the classAdArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClassAdStructArray }{@code >}
     *     
     */
    public void setClassAdArray(JAXBElement<ClassAdStructArray> value) {
        this.classAdArray = value;
    }

}

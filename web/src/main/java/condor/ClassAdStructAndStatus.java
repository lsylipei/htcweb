
package condor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassAdStructAndStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassAdStructAndStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{urn:condor}Status"/>
 *         &lt;element name="classAd" type="{urn:condor}ClassAdStruct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassAdStructAndStatus", propOrder = {
    "status",
    "classAd"
})
public class ClassAdStructAndStatus {

    @XmlElement(required = true)
    protected Status status;
    @XmlElementRef(name = "classAd", type = JAXBElement.class, required = false)
    protected JAXBElement<ClassAdStruct> classAd;

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
     * Gets the value of the classAd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClassAdStruct }{@code >}
     *     
     */
    public JAXBElement<ClassAdStruct> getClassAd() {
        return classAd;
    }

    /**
     * Sets the value of the classAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClassAdStruct }{@code >}
     *     
     */
    public void setClassAd(JAXBElement<ClassAdStruct> value) {
        this.classAd = value;
    }

}


package condor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileInfoArrayAndStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileInfoArrayAndStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{urn:condor}Status"/>
 *         &lt;element name="info" type="{urn:condor}FileInfoArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileInfoArrayAndStatus", propOrder = {
    "status",
    "info"
})
public class FileInfoArrayAndStatus {

    @XmlElement(required = true)
    protected Status status;
    @XmlElementRef(name = "info", type = JAXBElement.class, required = false)
    protected JAXBElement<FileInfoArray> info;

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
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileInfoArray }{@code >}
     *     
     */
    public JAXBElement<FileInfoArray> getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileInfoArray }{@code >}
     *     
     */
    public void setInfo(JAXBElement<FileInfoArray> value) {
        this.info = value;
    }

}

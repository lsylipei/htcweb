
package condor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="transaction" type="{urn:condor}Transaction" minOccurs="0"/>
 *         &lt;element name="clusterId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "transaction",
    "clusterId",
    "jobId",
    "name",
    "offset",
    "length"
})
@XmlRootElement(name = "getFile")
public class GetFile {

    @XmlElementRef(name = "transaction", type = JAXBElement.class, required = false)
    protected JAXBElement<Transaction> transaction;
    protected int clusterId;
    protected int jobId;
    @XmlElementRef(name = "name", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    protected int offset;
    protected int length;

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Transaction }{@code >}
     *     
     */
    public JAXBElement<Transaction> getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Transaction }{@code >}
     *     
     */
    public void setTransaction(JAXBElement<Transaction> value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the clusterId property.
     * 
     */
    public int getClusterId() {
        return clusterId;
    }

    /**
     * Sets the value of the clusterId property.
     * 
     */
    public void setClusterId(int value) {
        this.clusterId = value;
    }

    /**
     * Gets the value of the jobId property.
     * 
     */
    public int getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     */
    public void setJobId(int value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

}


package condor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="transaction" type="{urn:condor}Transaction"/>
 *         &lt;element name="clusterId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hashType" type="{urn:condor}HashType"/>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "size",
    "hashType",
    "hash"
})
@XmlRootElement(name = "declareFile")
public class DeclareFile {

    @XmlElement(required = true)
    protected Transaction transaction;
    protected int clusterId;
    protected int jobId;
    @XmlElementRef(name = "name", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    protected int size;
    @XmlElement(required = true)
    protected HashType hashType;
    @XmlElementRef(name = "hash", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hash;

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction }
     *     
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction }
     *     
     */
    public void setTransaction(Transaction value) {
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
     * Gets the value of the size property.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

    /**
     * Gets the value of the hashType property.
     * 
     * @return
     *     possible object is
     *     {@link HashType }
     *     
     */
    public HashType getHashType() {
        return hashType;
    }

    /**
     * Sets the value of the hashType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashType }
     *     
     */
    public void setHashType(HashType value) {
        this.hashType = value;
    }

    /**
     * Gets the value of the hash property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHash() {
        return hash;
    }

    /**
     * Sets the value of the hash property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHash(JAXBElement<String> value) {
        this.hash = value;
    }

}

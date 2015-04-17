
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
 *         &lt;element name="jobAd" type="{urn:condor}ClassAdStruct" minOccurs="0"/>
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
    "jobAd"
})
@XmlRootElement(name = "submit")
public class Submit {

    @XmlElement(required = true)
    protected Transaction transaction;
    protected int clusterId;
    protected int jobId;
    @XmlElementRef(name = "jobAd", type = JAXBElement.class, required = false)
    protected JAXBElement<ClassAdStruct> jobAd;

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
     * Gets the value of the jobAd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClassAdStruct }{@code >}
     *     
     */
    public JAXBElement<ClassAdStruct> getJobAd() {
        return jobAd;
    }

    /**
     * Sets the value of the jobAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClassAdStruct }{@code >}
     *     
     */
    public void setJobAd(JAXBElement<ClassAdStruct> value) {
        this.jobAd = value;
    }

}

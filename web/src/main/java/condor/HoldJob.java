
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
 *         &lt;element name="transaction" type="{urn:condor}Transaction" minOccurs="0"/>
 *         &lt;element name="clusterId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email-user" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="email-admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="system-hold" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "reason",
    "emailUser",
    "emailAdmin",
    "systemHold"
})
@XmlRootElement(name = "holdJob")
public class HoldJob {

    @XmlElementRef(name = "transaction", type = JAXBElement.class, required = false)
    protected JAXBElement<Transaction> transaction;
    protected int clusterId;
    protected int jobId;
    @XmlElementRef(name = "reason", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reason;
    @XmlElement(name = "email-user")
    protected boolean emailUser;
    @XmlElement(name = "email-admin")
    protected boolean emailAdmin;
    @XmlElement(name = "system-hold")
    protected boolean systemHold;

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
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReason(JAXBElement<String> value) {
        this.reason = value;
    }

    /**
     * Gets the value of the emailUser property.
     * 
     */
    public boolean isEmailUser() {
        return emailUser;
    }

    /**
     * Sets the value of the emailUser property.
     * 
     */
    public void setEmailUser(boolean value) {
        this.emailUser = value;
    }

    /**
     * Gets the value of the emailAdmin property.
     * 
     */
    public boolean isEmailAdmin() {
        return emailAdmin;
    }

    /**
     * Sets the value of the emailAdmin property.
     * 
     */
    public void setEmailAdmin(boolean value) {
        this.emailAdmin = value;
    }

    /**
     * Gets the value of the systemHold property.
     * 
     */
    public boolean isSystemHold() {
        return systemHold;
    }

    /**
     * Sets the value of the systemHold property.
     * 
     */
    public void setSystemHold(boolean value) {
        this.systemHold = value;
    }

}

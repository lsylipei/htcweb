package condor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Status complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{urn:condor}StatusCode"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="next" type="{urn:condor}Status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", propOrder = { "code", "message", "next" })
public class Status {

	@Override
	public String toString() {
		return "Status [code=" + code + ", message=" + message + ", next=" + next + "]";
	}

	@XmlElement(required = true)
	protected StatusCode code;
	@XmlElementRef(name = "message", type = JAXBElement.class, required = false)
	protected JAXBElement<String> message;
	@XmlElementRef(name = "next", type = JAXBElement.class, required = false)
	protected JAXBElement<Status> next;

	/**
	 * Gets the value of the code property.
	 * 
	 * @return possible object is {@link StatusCode }
	 * 
	 */
	public StatusCode getCode() {
		return code;
	}

	/**
	 * Sets the value of the code property.
	 * 
	 * @param value
	 *            allowed object is {@link StatusCode }
	 * 
	 */
	public void setCode(StatusCode value) {
		this.code = value;
	}

	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getMessage() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setMessage(JAXBElement<String> value) {
		this.message = value;
	}

	/**
	 * Gets the value of the next property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link Status }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<Status> getNext() {
		return next;
	}

	/**
	 * Sets the value of the next property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link Status }
	 *            {@code >}
	 * 
	 */
	public void setNext(JAXBElement<Status> value) {
		this.next = value;
	}

}

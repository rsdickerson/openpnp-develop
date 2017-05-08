//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.10.23 at 08:50:01 AM PDT
//

package org.openpnp.model.eagle.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "description", "gates", "devices" })
@XmlRootElement(name = "deviceset")
public class Deviceset {

	@XmlAttribute(name = "name", required = true)
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String name;
	@XmlAttribute(name = "prefix")
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String prefix;
	@XmlAttribute(name = "uservalue")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String uservalue;
	protected Description description;
	@XmlElement(required = true)
	protected Gates gates;
	@XmlElement(required = true)
	protected Devices devices;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the prefix property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrefix() {
		if (prefix == null) {
			return "";
		} else {
			return prefix;
		}
	}

	/**
	 * Sets the value of the prefix property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrefix(String value) {
		this.prefix = value;
	}

	/**
	 * Gets the value of the uservalue property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUservalue() {
		if (uservalue == null) {
			return "no";
		} else {
			return uservalue;
		}
	}

	/**
	 * Sets the value of the uservalue property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUservalue(String value) {
		this.uservalue = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link Description }
	 * 
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link Description }
	 * 
	 */
	public void setDescription(Description value) {
		this.description = value;
	}

	/**
	 * Gets the value of the gates property.
	 * 
	 * @return possible object is {@link Gates }
	 * 
	 */
	public Gates getGates() {
		return gates;
	}

	/**
	 * Sets the value of the gates property.
	 * 
	 * @param value
	 *            allowed object is {@link Gates }
	 * 
	 */
	public void setGates(Gates value) {
		this.gates = value;
	}

	/**
	 * Gets the value of the devices property.
	 * 
	 * @return possible object is {@link Devices }
	 * 
	 */
	public Devices getDevices() {
		return devices;
	}

	/**
	 * Sets the value of the devices property.
	 * 
	 * @param value
	 *            allowed object is {@link Devices }
	 * 
	 */
	public void setDevices(Devices value) {
		this.devices = value;
	}

}

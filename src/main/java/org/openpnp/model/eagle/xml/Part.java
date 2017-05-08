//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.10.23 at 08:50:01 AM PDT
//

package org.openpnp.model.eagle.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "attribute", "variant" })
@XmlRootElement(name = "part")
public class Part {

	@XmlAttribute(name = "name", required = true)
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String name;
	@XmlAttribute(name = "library", required = true)
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String library;
	@XmlAttribute(name = "deviceset", required = true)
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String deviceset;
	@XmlAttribute(name = "device", required = true)
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String device;
	@XmlAttribute(name = "technology")
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String technology;
	@XmlAttribute(name = "value")
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	protected String value;
	protected List<Attribute> attribute;
	protected List<Variant> variant;

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
	 * Gets the value of the library property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLibrary() {
		return library;
	}

	/**
	 * Sets the value of the library property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLibrary(String value) {
		this.library = value;
	}

	/**
	 * Gets the value of the deviceset property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDeviceset() {
		return deviceset;
	}

	/**
	 * Sets the value of the deviceset property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDeviceset(String value) {
		this.deviceset = value;
	}

	/**
	 * Gets the value of the device property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * Sets the value of the device property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDevice(String value) {
		this.device = value;
	}

	/**
	 * Gets the value of the technology property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTechnology() {
		if (technology == null) {
			return "";
		} else {
			return technology;
		}
	}

	/**
	 * Sets the value of the technology property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTechnology(String value) {
		this.technology = value;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the attribute property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the attribute property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAttribute().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Attribute
	 * }
	 * 
	 * 
	 */
	public List<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new ArrayList<>();
		}
		return this.attribute;
	}

	/**
	 * Gets the value of the variant property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the variant property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getVariant().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Variant }
	 * 
	 * 
	 */
	public List<Variant> getVariant() {
		if (variant == null) {
			variant = new ArrayList<>();
		}
		return this.variant;
	}

}

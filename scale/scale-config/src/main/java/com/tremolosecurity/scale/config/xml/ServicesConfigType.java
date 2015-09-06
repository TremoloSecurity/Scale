//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.28 at 08:54:27 PM EDT 
//


package com.tremolosecurity.scale.config.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides common configuration information to all Scale applications
 * 
 * <p>Java class for ServicesConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicesConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="keyStorePath" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="keyStorePassword" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unisonURL" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lookupAttributeName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicesConfigType")
public class ServicesConfigType {

    @XmlAttribute(name = "keyStorePath", required = true)
    protected String keyStorePath;
    @XmlAttribute(name = "keyStorePassword", required = true)
    protected String keyStorePassword;
    @XmlAttribute(name = "unisonURL", required = true)
    protected String unisonURL;
    @XmlAttribute(name = "lookupAttributeName", required = true)
    protected String lookupAttributeName;

    /**
     * Gets the value of the keyStorePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyStorePath() {
        return keyStorePath;
    }

    /**
     * Sets the value of the keyStorePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyStorePath(String value) {
        this.keyStorePath = value;
    }

    /**
     * Gets the value of the keyStorePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    /**
     * Sets the value of the keyStorePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyStorePassword(String value) {
        this.keyStorePassword = value;
    }

    /**
     * Gets the value of the unisonURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnisonURL() {
        return unisonURL;
    }

    /**
     * Sets the value of the unisonURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnisonURL(String value) {
        this.unisonURL = value;
    }

    /**
     * Gets the value of the lookupAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLookupAttributeName() {
        return lookupAttributeName;
    }

    /**
     * Sets the value of the lookupAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLookupAttributeName(String value) {
        this.lookupAttributeName = value;
    }

}

/*******************************************************************************
 * Copyright 2015 Tremolo Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.28 at 08:54:27 PM EDT 
//


package com.tremolosecurity.scale.config.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines an attribute in Scale providing both rednering details and validation details
 * 
 * <p>Java class for AttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listValue" type="{http://www.tremolosecurity.com/scale}NameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="minSize" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="maxSize" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="regEx" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="regExFailedMsg" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="controlType" default="text">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="text"/>
 *             &lt;enumeration value="list"/>
 *             &lt;enumeration value="checkbox"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", propOrder = {
    "listValue"
})
public class AttributeType {

    protected List<NameValueType> listValue;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "label", required = true)
    protected String label;
    @XmlAttribute(name = "readOnly")
    protected Boolean readOnly;
    @XmlAttribute(name = "required")
    protected Boolean required;
    @XmlAttribute(name = "minSize")
    protected Integer minSize;
    @XmlAttribute(name = "maxSize")
    protected Integer maxSize;
    @XmlAttribute(name = "regEx")
    protected String regEx;
    @XmlAttribute(name = "regExFailedMsg")
    protected String regExFailedMsg;
    @XmlAttribute(name = "controlType")
    protected String controlType;

    /**
     * Gets the value of the listValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValueType }
     * 
     * 
     */
    public List<NameValueType> getListValue() {
        if (listValue == null) {
            listValue = new ArrayList<NameValueType>();
        }
        return this.listValue;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReadOnly() {
        if (readOnly == null) {
            return false;
        } else {
            return readOnly;
        }
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRequired() {
        if (required == null) {
            return true;
        } else {
            return required;
        }
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the minSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMinSize() {
        if (minSize == null) {
            return  0;
        } else {
            return minSize;
        }
    }

    /**
     * Sets the value of the minSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinSize(Integer value) {
        this.minSize = value;
    }

    /**
     * Gets the value of the maxSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxSize() {
        if (maxSize == null) {
            return  0;
        } else {
            return maxSize;
        }
    }

    /**
     * Sets the value of the maxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSize(Integer value) {
        this.maxSize = value;
    }

    /**
     * Gets the value of the regEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegEx() {
        return regEx;
    }

    /**
     * Sets the value of the regEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegEx(String value) {
        this.regEx = value;
    }

    /**
     * Gets the value of the regExFailedMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegExFailedMsg() {
        return regExFailedMsg;
    }

    /**
     * Sets the value of the regExFailedMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegExFailedMsg(String value) {
        this.regExFailedMsg = value;
    }

    /**
     * Gets the value of the controlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlType() {
        if (controlType == null) {
            return "text";
        } else {
            return controlType;
        }
    }

    /**
     * Sets the value of the controlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlType(String value) {
        this.controlType = value;
    }

}

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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Root element for the Scale application
 * 
 * <p>Java class for ScaleConfigType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScaleConfigType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tremolosecurity.com/scale}ScaleCommonConfigType">
 *       &lt;sequence>
 *         &lt;element name="appUiConfig" type="{http://www.tremolosecurity.com/scale}AppUiConfigType"/>
 *         &lt;element name="userAttributesConfig" type="{http://www.tremolosecurity.com/scale}UserAttributesConfigType"/>
 *         &lt;element name="workflows" type="{http://www.tremolosecurity.com/scale}WorkflowsType"/>
 *         &lt;element name="approvals" type="{http://www.tremolosecurity.com/scale}ApprovalsType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScaleConfigType", propOrder = {
    "appUiConfig",
    "userAttributesConfig",
    "workflows",
    "approvals"
})
public class ScaleConfigType
    extends ScaleCommonConfigType
{

    @XmlElement(required = true)
    protected AppUiConfigType appUiConfig;
    @XmlElement(required = true)
    protected UserAttributesConfigType userAttributesConfig;
    @XmlElement(required = true)
    protected WorkflowsType workflows;
    @XmlElement(required = true)
    protected ApprovalsType approvals;

    /**
     * Gets the value of the appUiConfig property.
     * 
     * @return
     *     possible object is
     *     {@link AppUiConfigType }
     *     
     */
    public AppUiConfigType getAppUiConfig() {
        return appUiConfig;
    }

    /**
     * Sets the value of the appUiConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppUiConfigType }
     *     
     */
    public void setAppUiConfig(AppUiConfigType value) {
        this.appUiConfig = value;
    }

    /**
     * Gets the value of the userAttributesConfig property.
     * 
     * @return
     *     possible object is
     *     {@link UserAttributesConfigType }
     *     
     */
    public UserAttributesConfigType getUserAttributesConfig() {
        return userAttributesConfig;
    }

    /**
     * Sets the value of the userAttributesConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAttributesConfigType }
     *     
     */
    public void setUserAttributesConfig(UserAttributesConfigType value) {
        this.userAttributesConfig = value;
    }

    /**
     * Gets the value of the workflows property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowsType }
     *     
     */
    public WorkflowsType getWorkflows() {
        return workflows;
    }

    /**
     * Sets the value of the workflows property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowsType }
     *     
     */
    public void setWorkflows(WorkflowsType value) {
        this.workflows = value;
    }

    /**
     * Gets the value of the approvals property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalsType }
     *     
     */
    public ApprovalsType getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalsType }
     *     
     */
    public void setApprovals(ApprovalsType value) {
        this.approvals = value;
    }

}

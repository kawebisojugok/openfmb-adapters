//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:07:42 PM EDT 
//


package com.greenenergycorp.openfmb.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatteryStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatteryStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Status"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isCharging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isConnected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stateOfCharge" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatteryStatus", namespace = "http://openfmb.org/xsd/2015/12/openfmb/batterymodule", propOrder = {
    "isCharging",
    "isConnected",
    "mode",
    "stateOfCharge"
})
@XmlRootElement(name = "BatteryStatus", namespace = "http://openfmb.org/xsd/2015/12/openfmb/batterymodule")
public class BatteryStatus
    extends Status
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean isCharging;
    protected Boolean isConnected;
    protected String mode;
    protected Float stateOfCharge;

    /**
     * Gets the value of the isCharging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCharging() {
        return isCharging;
    }

    /**
     * Sets the value of the isCharging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCharging(Boolean value) {
        this.isCharging = value;
    }

    /**
     * Gets the value of the isConnected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConnected() {
        return isConnected;
    }

    /**
     * Sets the value of the isConnected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConnected(Boolean value) {
        this.isConnected = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the stateOfCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStateOfCharge() {
        return stateOfCharge;
    }

    /**
     * Sets the value of the stateOfCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStateOfCharge(Float value) {
        this.stateOfCharge = value;
    }

}

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.27 at 02:07:42 PM EDT 
//


package com.greenenergycorp.openfmb.xml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Wind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Wind"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directionUnit" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitSymbolKind" minOccurs="0"/&gt;
 *         &lt;element name="speedUnit" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}UnitSymbolKind" minOccurs="0"/&gt;
 *         &lt;element name="WindData" type="{http://openfmb.org/xsd/2015/12/openfmb/weathermodule}WindData" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wind", namespace = "http://openfmb.org/xsd/2015/12/openfmb/weathermodule", propOrder = {
    "directionUnit",
    "speedUnit",
    "windDatas"
})
@XmlRootElement(name = "Wind", namespace = "http://openfmb.org/xsd/2015/12/openfmb/weathermodule")
public class Wind
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlSchemaType(name = "string")
    protected UnitSymbolKind directionUnit;
    @XmlSchemaType(name = "string")
    protected UnitSymbolKind speedUnit;
    @XmlElement(name = "WindData")
    protected List<WindData> windDatas;

    /**
     * Gets the value of the directionUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSymbolKind }
     *     
     */
    public UnitSymbolKind getDirectionUnit() {
        return directionUnit;
    }

    /**
     * Sets the value of the directionUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSymbolKind }
     *     
     */
    public void setDirectionUnit(UnitSymbolKind value) {
        this.directionUnit = value;
    }

    /**
     * Gets the value of the speedUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSymbolKind }
     *     
     */
    public UnitSymbolKind getSpeedUnit() {
        return speedUnit;
    }

    /**
     * Sets the value of the speedUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSymbolKind }
     *     
     */
    public void setSpeedUnit(UnitSymbolKind value) {
        this.speedUnit = value;
    }

    /**
     * Gets the value of the windDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WindData }
     * 
     * 
     */
    public List<WindData> getWindDatas() {
        if (windDatas == null) {
            windDatas = new ArrayList<WindData>();
        }
        return this.windDatas;
    }

}
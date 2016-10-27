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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadReadingProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadReadingProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnergyConsumer" type="{http://openfmb.org/xsd/2015/12/openfmb/loadmodule}EnergyConsumer"/&gt;
 *         &lt;element name="Readings" type="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Reading" maxOccurs="100"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadReadingProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/loadmodule", propOrder = {
    "energyConsumer",
    "readings"
})
@XmlRootElement(name = "LoadReadingProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/loadmodule")
public class LoadReadingProfile
    extends Container
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EnergyConsumer", required = true)
    protected EnergyConsumer energyConsumer;
    @XmlElement(name = "Readings", required = true)
    protected List<Reading> readings;

    /**
     * Gets the value of the energyConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyConsumer }
     *     
     */
    public EnergyConsumer getEnergyConsumer() {
        return energyConsumer;
    }

    /**
     * Sets the value of the energyConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyConsumer }
     *     
     */
    public void setEnergyConsumer(EnergyConsumer value) {
        this.energyConsumer = value;
    }

    /**
     * Gets the value of the readings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reading }
     * 
     * 
     */
    public List<Reading> getReadings() {
        if (readings == null) {
            readings = new ArrayList<Reading>();
        }
        return this.readings;
    }

}

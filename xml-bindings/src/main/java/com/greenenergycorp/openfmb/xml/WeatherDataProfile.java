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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherDataProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherDataProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://openfmb.org/xsd/2015/12/openfmb/commonmodule}Container"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WeatherData" type="{http://openfmb.org/xsd/2015/12/openfmb/weathermodule}WeatherData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherDataProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/weathermodule", propOrder = {
    "weatherData"
})
@XmlRootElement(name = "WeatherDataProfile", namespace = "http://openfmb.org/xsd/2015/12/openfmb/weathermodule")
public class WeatherDataProfile
    extends Container
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "WeatherData", required = true)
    protected WeatherData weatherData;

    /**
     * Gets the value of the weatherData property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherData }
     *     
     */
    public WeatherData getWeatherData() {
        return weatherData;
    }

    /**
     * Sets the value of the weatherData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherData }
     *     
     */
    public void setWeatherData(WeatherData value) {
        this.weatherData = value;
    }

}

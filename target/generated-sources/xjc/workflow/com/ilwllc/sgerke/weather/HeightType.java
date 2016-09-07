//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.07 at 07:58:40 AM EDT 
//


package com.ilwllc.sgerke.weather;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for heightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="heightType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;nonNegativeInteger"&gt;
 *       &lt;attribute name="datum" use="required" type="{}datumType" /&gt;
 *       &lt;attribute name="height-units" type="{}height-unitsType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heightType", propOrder = {
    "value"
})
public class HeightType
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlValue
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger value;
    @XmlAttribute(name = "datum", required = true)
    protected DatumType datum;
    @XmlAttribute(name = "height-units")
    protected HeightUnitsType heightUnits;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link DatumType }
     *     
     */
    public DatumType getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatumType }
     *     
     */
    public void setDatum(DatumType value) {
        this.datum = value;
    }

    /**
     * Gets the value of the heightUnits property.
     * 
     * @return
     *     possible object is
     *     {@link HeightUnitsType }
     *     
     */
    public HeightUnitsType getHeightUnits() {
        return heightUnits;
    }

    /**
     * Sets the value of the heightUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeightUnitsType }
     *     
     */
    public void setHeightUnits(HeightUnitsType value) {
        this.heightUnits = value;
    }

}
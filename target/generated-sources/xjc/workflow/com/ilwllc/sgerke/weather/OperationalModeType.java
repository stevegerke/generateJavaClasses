//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.07 at 07:58:40 AM EDT 
//


package com.ilwllc.sgerke.weather;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operational-modeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="operational-modeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="official"/&gt;
 *     &lt;enumeration value="developmental"/&gt;
 *     &lt;enumeration value="experimental"/&gt;
 *     &lt;enumeration value="test"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "operational-modeType")
@XmlEnum
public enum OperationalModeType {

    @XmlEnumValue("official")
    OFFICIAL("official"),
    @XmlEnumValue("developmental")
    DEVELOPMENTAL("developmental"),
    @XmlEnumValue("experimental")
    EXPERIMENTAL("experimental"),
    @XmlEnumValue("test")
    TEST("test");
    private final String value;

    OperationalModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperationalModeType fromValue(String v) {
        for (OperationalModeType c: OperationalModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
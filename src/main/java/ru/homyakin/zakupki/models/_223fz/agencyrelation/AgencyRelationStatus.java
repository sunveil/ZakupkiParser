//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:09:24 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.agencyrelation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agencyRelationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="agencyRelationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APPROVAL_REQUESTED"/>
 *     &lt;enumeration value="APPROVED"/>
 *     &lt;enumeration value="BLOCKED"/>
 *     &lt;enumeration value="REVOKED"/>
 *     &lt;enumeration value="REFUSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "agencyRelationStatus")
@XmlEnum
public enum AgencyRelationStatus {


    /**
     * На подтверждении
     * 
     */
    APPROVAL_REQUESTED,

    /**
     * Подтверждена
     * 
     */
    APPROVED,

    /**
     * Заблокирована
     * 
     */
    BLOCKED,

    /**
     * Аннулирована
     * 
     */
    REVOKED,

    /**
     * Отклонена
     * 
     */
    REFUSED;

    public String value() {
        return name();
    }

    public static AgencyRelationStatus fromValue(String v) {
        return valueOf(v);
    }

}
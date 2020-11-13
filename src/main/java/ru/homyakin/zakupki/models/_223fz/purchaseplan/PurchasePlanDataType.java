//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.07 at 02:10:05 PM MSK 
//


package ru.homyakin.zakupki.models._223fz.purchaseplan;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.homyakin.zakupki.models._223fz.types.DocumentListType;
import ru.homyakin.zakupki.models._223fz.types.PurchasePlanStatusType;


/**
 * План закупки
 * 
 * <p>Java class for purchasePlanDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasePlanDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zakupki.gov.ru/223fz/purchasePlan/1}basePurchasePlanDataType">
 *       &lt;sequence>
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="urlEIS" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="urlVSRZ" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="urlKisRmis" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="3000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="registrationNumber" type="{http://zakupki.gov.ru/223fz/types/1}registrationNumberType" minOccurs="0"/>
 *         &lt;element name="name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="additionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="approveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="publicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isDigitForm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="summSizeCh15" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isImportedFromVSRZ" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{http://zakupki.gov.ru/223fz/types/1}purchasePlanStatusType" minOccurs="0"/>
 *         &lt;element name="version" type="{http://zakupki.gov.ru/223fz/types/1}versionType" minOccurs="0"/>
 *         &lt;element name="modificationDescription" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://zakupki.gov.ru/223fz/types/1}nonEmptyString">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="useNewClassifiers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://zakupki.gov.ru/223fz/types/1}documentListType" minOccurs="0"/>
 *         &lt;element name="excludeVolume" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="volumeSMB" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="annualVolume" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="percentSMB" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="smbPartitionChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="annualVolumeSMBLess18Percent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reportingYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="previousYearAnnualVolume" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="previousYearAnnualVolumeHiTech" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="previousYearAnnualVolumeHiTechSMB" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="annualVolumeHiTechSumm" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="annualVolumeHiTechIncrease" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="annualVolumeHiTechPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="annualVolumeHiTechSMBSumm" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="annualVolumeHiTechSMBIncrease" type="{http://zakupki.gov.ru/223fz/types/1}money2" minOccurs="0"/>
 *         &lt;element name="annualVolumeHiTechSMBPercent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasePlanDataType", propOrder = {
    "createDateTime",
    "urlEIS",
    "urlVSRZ",
    "urlKisRmis",
    "registrationNumber",
    "name",
    "additionalInfo",
    "startDate",
    "endDate",
    "approveDate",
    "publicationDateTime",
    "isDigitForm",
    "summSizeCh15",
    "isImportedFromVSRZ",
    "status",
    "version",
    "modificationDescription",
    "useNewClassifiers",
    "attachments",
    "excludeVolume",
    "volumeSMB",
    "annualVolume",
    "percentSMB",
    "smbPartitionChanged",
    "annualVolumeSMBLess18Percent",
    "reportingYear",
    "previousYearAnnualVolume",
    "previousYearAnnualVolumeHiTech",
    "previousYearAnnualVolumeHiTechSMB",
    "annualVolumeHiTechSumm",
    "annualVolumeHiTechIncrease",
    "annualVolumeHiTechPercent",
    "annualVolumeHiTechSMBSumm",
    "annualVolumeHiTechSMBIncrease",
    "annualVolumeHiTechSMBPercent"
})
public class PurchasePlanDataType
    extends BasePurchasePlanDataType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    protected String urlEIS;
    protected String urlVSRZ;
    protected String urlKisRmis;
    protected String registrationNumber;
    protected String name;
    protected String additionalInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar approveDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar publicationDateTime;
    @XmlElement(defaultValue = "false")
    protected Boolean isDigitForm;
    @XmlElement(defaultValue = "false")
    protected Boolean summSizeCh15;
    @XmlElement(defaultValue = "false")
    protected Boolean isImportedFromVSRZ;
    @XmlSchemaType(name = "string")
    protected PurchasePlanStatusType status;
    protected Long version;
    protected String modificationDescription;
    protected Boolean useNewClassifiers;
    protected DocumentListType attachments;
    protected BigDecimal excludeVolume;
    protected BigDecimal volumeSMB;
    protected BigDecimal annualVolume;
    protected BigDecimal percentSMB;
    @XmlElement(defaultValue = "false")
    protected Boolean smbPartitionChanged;
    @XmlElement(defaultValue = "false")
    protected Boolean annualVolumeSMBLess18Percent;
    protected int reportingYear;
    protected BigDecimal previousYearAnnualVolume;
    protected BigDecimal previousYearAnnualVolumeHiTech;
    protected BigDecimal previousYearAnnualVolumeHiTechSMB;
    protected BigDecimal annualVolumeHiTechSumm;
    protected BigDecimal annualVolumeHiTechIncrease;
    protected BigDecimal annualVolumeHiTechPercent;
    protected BigDecimal annualVolumeHiTechSMBSumm;
    protected BigDecimal annualVolumeHiTechSMBIncrease;
    protected BigDecimal annualVolumeHiTechSMBPercent;

    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the urlEIS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlEIS() {
        return urlEIS;
    }

    /**
     * Sets the value of the urlEIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlEIS(String value) {
        this.urlEIS = value;
    }

    /**
     * Gets the value of the urlVSRZ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlVSRZ() {
        return urlVSRZ;
    }

    /**
     * Sets the value of the urlVSRZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlVSRZ(String value) {
        this.urlVSRZ = value;
    }

    /**
     * Gets the value of the urlKisRmis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlKisRmis() {
        return urlKisRmis;
    }

    /**
     * Sets the value of the urlKisRmis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlKisRmis(String value) {
        this.urlKisRmis = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
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
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the approveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApproveDate() {
        return approveDate;
    }

    /**
     * Sets the value of the approveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApproveDate(XMLGregorianCalendar value) {
        this.approveDate = value;
    }

    /**
     * Gets the value of the publicationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDateTime() {
        return publicationDateTime;
    }

    /**
     * Sets the value of the publicationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDateTime(XMLGregorianCalendar value) {
        this.publicationDateTime = value;
    }

    /**
     * Gets the value of the isDigitForm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDigitForm() {
        return isDigitForm;
    }

    /**
     * Sets the value of the isDigitForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDigitForm(Boolean value) {
        this.isDigitForm = value;
    }

    /**
     * Gets the value of the summSizeCh15 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSummSizeCh15() {
        return summSizeCh15;
    }

    /**
     * Sets the value of the summSizeCh15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSummSizeCh15(Boolean value) {
        this.summSizeCh15 = value;
    }

    /**
     * Gets the value of the isImportedFromVSRZ property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsImportedFromVSRZ() {
        return isImportedFromVSRZ;
    }

    /**
     * Sets the value of the isImportedFromVSRZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsImportedFromVSRZ(Boolean value) {
        this.isImportedFromVSRZ = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PurchasePlanStatusType }
     *     
     */
    public PurchasePlanStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchasePlanStatusType }
     *     
     */
    public void setStatus(PurchasePlanStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

    /**
     * Gets the value of the modificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationDescription() {
        return modificationDescription;
    }

    /**
     * Sets the value of the modificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationDescription(String value) {
        this.modificationDescription = value;
    }

    /**
     * Gets the value of the useNewClassifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNewClassifiers() {
        return useNewClassifiers;
    }

    /**
     * Sets the value of the useNewClassifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNewClassifiers(Boolean value) {
        this.useNewClassifiers = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentListType }
     *     
     */
    public DocumentListType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentListType }
     *     
     */
    public void setAttachments(DocumentListType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the excludeVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExcludeVolume() {
        return excludeVolume;
    }

    /**
     * Sets the value of the excludeVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExcludeVolume(BigDecimal value) {
        this.excludeVolume = value;
    }

    /**
     * Gets the value of the volumeSMB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeSMB() {
        return volumeSMB;
    }

    /**
     * Sets the value of the volumeSMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeSMB(BigDecimal value) {
        this.volumeSMB = value;
    }

    /**
     * Gets the value of the annualVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualVolume() {
        return annualVolume;
    }

    /**
     * Sets the value of the annualVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualVolume(BigDecimal value) {
        this.annualVolume = value;
    }

    /**
     * Gets the value of the percentSMB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentSMB() {
        return percentSMB;
    }

    /**
     * Sets the value of the percentSMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentSMB(BigDecimal value) {
        this.percentSMB = value;
    }

    /**
     * Gets the value of the smbPartitionChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmbPartitionChanged() {
        return smbPartitionChanged;
    }

    /**
     * Sets the value of the smbPartitionChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmbPartitionChanged(Boolean value) {
        this.smbPartitionChanged = value;
    }

    /**
     * Gets the value of the annualVolumeSMBLess18Percent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnnualVolumeSMBLess18Percent() {
        return annualVolumeSMBLess18Percent;
    }

    /**
     * Sets the value of the annualVolumeSMBLess18Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnnualVolumeSMBLess18Percent(Boolean value) {
        this.annualVolumeSMBLess18Percent = value;
    }

    /**
     * Gets the value of the reportingYear property.
     * 
     */
    public int getReportingYear() {
        return reportingYear;
    }

    /**
     * Sets the value of the reportingYear property.
     * 
     */
    public void setReportingYear(int value) {
        this.reportingYear = value;
    }

    /**
     * Gets the value of the previousYearAnnualVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousYearAnnualVolume() {
        return previousYearAnnualVolume;
    }

    /**
     * Sets the value of the previousYearAnnualVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousYearAnnualVolume(BigDecimal value) {
        this.previousYearAnnualVolume = value;
    }

    /**
     * Gets the value of the previousYearAnnualVolumeHiTech property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousYearAnnualVolumeHiTech() {
        return previousYearAnnualVolumeHiTech;
    }

    /**
     * Sets the value of the previousYearAnnualVolumeHiTech property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousYearAnnualVolumeHiTech(BigDecimal value) {
        this.previousYearAnnualVolumeHiTech = value;
    }

    /**
     * Gets the value of the previousYearAnnualVolumeHiTechSMB property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreviousYearAnnualVolumeHiTechSMB() {
        return previousYearAnnualVolumeHiTechSMB;
    }

    /**
     * Sets the value of the previousYearAnnualVolumeHiTechSMB property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreviousYearAnnualVolumeHiTechSMB(BigDecimal value) {
        this.previousYearAnnualVolumeHiTechSMB = value;
    }

    /**
     * Gets the value of the annualVolumeHiTechSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualVolumeHiTechSumm() {
        return annualVolumeHiTechSumm;
    }

    /**
     * Sets the value of the annualVolumeHiTechSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualVolumeHiTechSumm(BigDecimal value) {
        this.annualVolumeHiTechSumm = value;
    }

    /**
     * Gets the value of the annualVolumeHiTechIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualVolumeHiTechIncrease() {
        return annualVolumeHiTechIncrease;
    }

    /**
     * Sets the value of the annualVolumeHiTechIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualVolumeHiTechIncrease(BigDecimal value) {
        this.annualVolumeHiTechIncrease = value;
    }

    /**
     * Gets the value of the annualVolumeHiTechPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualVolumeHiTechPercent() {
        return annualVolumeHiTechPercent;
    }

    /**
     * Sets the value of the annualVolumeHiTechPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualVolumeHiTechPercent(BigDecimal value) {
        this.annualVolumeHiTechPercent = value;
    }

    /**
     * Gets the value of the annualVolumeHiTechSMBSumm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualVolumeHiTechSMBSumm() {
        return annualVolumeHiTechSMBSumm;
    }

    /**
     * Sets the value of the annualVolumeHiTechSMBSumm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualVolumeHiTechSMBSumm(BigDecimal value) {
        this.annualVolumeHiTechSMBSumm = value;
    }

    /**
     * Gets the value of the annualVolumeHiTechSMBIncrease property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualVolumeHiTechSMBIncrease() {
        return annualVolumeHiTechSMBIncrease;
    }

    /**
     * Sets the value of the annualVolumeHiTechSMBIncrease property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualVolumeHiTechSMBIncrease(BigDecimal value) {
        this.annualVolumeHiTechSMBIncrease = value;
    }

    /**
     * Gets the value of the annualVolumeHiTechSMBPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAnnualVolumeHiTechSMBPercent() {
        return annualVolumeHiTechSMBPercent;
    }

    /**
     * Sets the value of the annualVolumeHiTechSMBPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAnnualVolumeHiTechSMBPercent(BigDecimal value) {
        this.annualVolumeHiTechSMBPercent = value;
    }

}
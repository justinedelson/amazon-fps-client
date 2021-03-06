package com.amazonaws.fps.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for TransactionPart complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://fps.amazonaws.com/doc/2008-09-17/}TransactionalRole"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeesPaid" type="{http://fps.amazonaws.com/doc/2008-09-17/}Amount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * Generated by AWS Code Generator
 * <p/>
 * Tue Sep 29 03:25:23 PDT 2009
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionPart", propOrder = { "instrumentId", "role", "name", "reference", "description", "feesPaid" })
public class TransactionPart {

    @XmlElement(name = "InstrumentId")
    protected String instrumentId;
    @XmlElement(name = "Role", required = true)
    protected TransactionalRole role;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "FeesPaid")
    protected Amount feesPaid;

    /**
     * Default constructor
     * 
     */
    public TransactionPart() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public TransactionPart(final String instrumentId, final TransactionalRole role, final String name,
            final String reference, final String description, final Amount feesPaid) {
        this.instrumentId = instrumentId;
        this.role = role;
        this.name = name;
        this.reference = reference;
        this.description = description;
        this.feesPaid = feesPaid;
    }

    /**
     * Gets the value of the instrumentId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getInstrumentId() {
        return instrumentId;
    }

    /**
     * Sets the value of the instrumentId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setInstrumentId(String value) {
        this.instrumentId = value;
    }

    public boolean isSetInstrumentId() {
        return (this.instrumentId != null);
    }

    /**
     * Gets the value of the role property.
     * 
     * @return possible object is {@link TransactionalRole }
     * 
     */
    public TransactionalRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value allowed object is {@link TransactionalRole }
     * 
     */
    public void setRole(TransactionalRole value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role != null);
    }

    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name != null);
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setReference(String value) {
        this.reference = value;
    }

    public boolean isSetReference() {
        return (this.reference != null);
    }

    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description != null);
    }

    /**
     * Gets the value of the feesPaid property.
     * 
     * @return possible object is {@link Amount }
     * 
     */
    public Amount getFeesPaid() {
        return feesPaid;
    }

    /**
     * Sets the value of the feesPaid property.
     * 
     * @param value allowed object is {@link Amount }
     * 
     */
    public void setFeesPaid(Amount value) {
        this.feesPaid = value;
    }

    public boolean isSetFeesPaid() {
        return (this.feesPaid != null);
    }

    /**
     * Sets the value of the InstrumentId property.
     * 
     * @param value
     * @return this instance
     */
    public TransactionPart withInstrumentId(String value) {
        setInstrumentId(value);
        return this;
    }

    /**
     * Sets the value of the Role property.
     * 
     * @param value
     * @return this instance
     */
    public TransactionPart withRole(TransactionalRole value) {
        setRole(value);
        return this;
    }

    /**
     * Sets the value of the Name property.
     * 
     * @param value
     * @return this instance
     */
    public TransactionPart withName(String value) {
        setName(value);
        return this;
    }

    /**
     * Sets the value of the Reference property.
     * 
     * @param value
     * @return this instance
     */
    public TransactionPart withReference(String value) {
        setReference(value);
        return this;
    }

    /**
     * Sets the value of the Description property.
     * 
     * @param value
     * @return this instance
     */
    public TransactionPart withDescription(String value) {
        setDescription(value);
        return this;
    }

    /**
     * Sets the value of the FeesPaid property.
     * 
     * @param value
     * @return this instance
     */
    public TransactionPart withFeesPaid(Amount value) {
        setFeesPaid(value);
        return this;
    }

    /**
     * 
     * XML fragment representation of this object
     * 
     * @return XML fragment for this object. Name for outer tag expected to be
     *         set by calling method. This fragment returns inner properties
     *         representation only
     */
    protected String toXMLFragment() {
        StringBuffer xml = new StringBuffer();
        if (isSetInstrumentId()) {
            xml.append("<InstrumentId>");
            xml.append(escapeXML(getInstrumentId()));
            xml.append("</InstrumentId>");
        }
        if (isSetRole()) {
            xml.append("<Role>");
            xml.append(getRole().value());
            xml.append("</Role>");
        }
        if (isSetName()) {
            xml.append("<Name>");
            xml.append(escapeXML(getName()));
            xml.append("</Name>");
        }
        if (isSetReference()) {
            xml.append("<Reference>");
            xml.append(escapeXML(getReference()));
            xml.append("</Reference>");
        }
        if (isSetDescription()) {
            xml.append("<Description>");
            xml.append(escapeXML(getDescription()));
            xml.append("</Description>");
        }
        if (isSetFeesPaid()) {
            Amount feesPaid = getFeesPaid();
            xml.append("<FeesPaid>");
            xml.append(feesPaid.toXMLFragment());
            xml.append("</FeesPaid>");
        }
        return xml.toString();
    }

    /**
     * 
     * Escape XML special characters
     */
    private String escapeXML(String string) {
        StringBuffer sb = new StringBuffer();
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '&':
                sb.append("&amp;");
                break;
            case '<':
                sb.append("&lt;");
                break;
            case '>':
                sb.append("&gt;");
                break;
            case '\'':
                sb.append("&#039;");
                break;
            case '"':
                sb.append("&quot;");
                break;
            default:
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 
     * JSON fragment representation of this object
     * 
     * @return JSON fragment for this object. Name for outer object expected to
     *         be set by calling method. This fragment returns inner properties
     *         representation only
     * 
     */
    protected String toJSONFragment() {
        StringBuffer json = new StringBuffer();
        boolean first = true;
        if (isSetInstrumentId()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("InstrumentId"));
            json.append(" : ");
            json.append(quoteJSON(getInstrumentId()));
            first = false;
        }
        if (isSetRole()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("Role"));
            json.append(" : ");
            json.append(quoteJSON(getRole().value()));
            first = false;
        }
        if (isSetName()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("Name"));
            json.append(" : ");
            json.append(quoteJSON(getName()));
            first = false;
        }
        if (isSetReference()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("Reference"));
            json.append(" : ");
            json.append(quoteJSON(getReference()));
            first = false;
        }
        if (isSetDescription()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("Description"));
            json.append(" : ");
            json.append(quoteJSON(getDescription()));
            first = false;
        }
        if (isSetFeesPaid()) {
            if (!first)
                json.append(", ");
            json.append("\"FeesPaid\" : {");
            Amount feesPaid = getFeesPaid();

            json.append(feesPaid.toJSONFragment());
            json.append("}");
            first = false;
        }
        return json.toString();
    }

    /**
     * 
     * Quote JSON string
     */
    private String quoteJSON(String string) {
        StringBuffer sb = new StringBuffer();
        sb.append("\"");
        int length = string.length();
        for (int i = 0; i < length; ++i) {
            char c = string.charAt(i);
            switch (c) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '/':
                sb.append("\\/");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            default:
                if (c < ' ') {
                    sb.append("\\u" + String.format("%03x", Integer.valueOf(c)));
                } else {
                    sb.append(c);
                }
            }
        }
        sb.append("\"");
        return sb.toString();
    }

}

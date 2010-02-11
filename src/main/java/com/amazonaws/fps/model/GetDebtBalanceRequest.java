package com.amazonaws.fps.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreditInstrumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "creditInstrumentId" })
@XmlRootElement(name = "GetDebtBalanceRequest")
public class GetDebtBalanceRequest {

    @XmlElement(name = "CreditInstrumentId")
    protected String creditInstrumentId;

    /**
     * Default constructor
     * 
     */
    public GetDebtBalanceRequest() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public GetDebtBalanceRequest(final String creditInstrumentId) {
        this.creditInstrumentId = creditInstrumentId;
    }

    /**
     * Gets the value of the creditInstrumentId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreditInstrumentId() {
        return creditInstrumentId;
    }

    /**
     * Sets the value of the creditInstrumentId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCreditInstrumentId(String value) {
        this.creditInstrumentId = value;
    }

    public boolean isSetCreditInstrumentId() {
        return (this.creditInstrumentId != null);
    }

    /**
     * Sets the value of the CreditInstrumentId property.
     * 
     * @param value
     * @return this instance
     */
    public GetDebtBalanceRequest withCreditInstrumentId(String value) {
        setCreditInstrumentId(value);
        return this;
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
        if (isSetCreditInstrumentId()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("CreditInstrumentId"));
            json.append(" : ");
            json.append(quoteJSON(getCreditInstrumentId()));
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

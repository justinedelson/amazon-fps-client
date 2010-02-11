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
 *         &lt;element name="SenderTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditInstrumentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettlementAmount" type="{http://fps.amazonaws.com/doc/2008-09-17/}Amount" minOccurs="0"/>
 *         &lt;element name="CallerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptorPolicy" type="{http://fps.amazonaws.com/doc/2008-09-17/}DescriptorPolicy" minOccurs="0"/>
 *         &lt;element name="TransactionTimeoutInMins" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "senderTokenId", "creditInstrumentId", "settlementAmount", "callerReference",
        "senderDescription", "callerDescription", "descriptorPolicy", "transactionTimeoutInMins" })
@XmlRootElement(name = "SettleDebtRequest")
public class SettleDebtRequest {

    @XmlElement(name = "SenderTokenId")
    protected String senderTokenId;
    @XmlElement(name = "CreditInstrumentId")
    protected String creditInstrumentId;
    @XmlElement(name = "SettlementAmount")
    protected Amount settlementAmount;
    @XmlElement(name = "CallerReference")
    protected String callerReference;
    @XmlElement(name = "SenderDescription")
    protected String senderDescription;
    @XmlElement(name = "CallerDescription")
    protected String callerDescription;
    @XmlElement(name = "DescriptorPolicy")
    protected DescriptorPolicy descriptorPolicy;
    @XmlElement(name = "TransactionTimeoutInMins")
    protected Integer transactionTimeoutInMins;

    /**
     * Default constructor
     * 
     */
    public SettleDebtRequest() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public SettleDebtRequest(final String senderTokenId, final String creditInstrumentId,
            final Amount settlementAmount, final String callerReference, final String senderDescription,
            final String callerDescription, final DescriptorPolicy descriptorPolicy,
            final Integer transactionTimeoutInMins) {
        this.senderTokenId = senderTokenId;
        this.creditInstrumentId = creditInstrumentId;
        this.settlementAmount = settlementAmount;
        this.callerReference = callerReference;
        this.senderDescription = senderDescription;
        this.callerDescription = callerDescription;
        this.descriptorPolicy = descriptorPolicy;
        this.transactionTimeoutInMins = transactionTimeoutInMins;
    }

    /**
     * Gets the value of the senderTokenId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSenderTokenId() {
        return senderTokenId;
    }

    /**
     * Sets the value of the senderTokenId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSenderTokenId(String value) {
        this.senderTokenId = value;
    }

    public boolean isSetSenderTokenId() {
        return (this.senderTokenId != null);
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
     * Gets the value of the settlementAmount property.
     * 
     * @return possible object is {@link Amount }
     * 
     */
    public Amount getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * Sets the value of the settlementAmount property.
     * 
     * @param value allowed object is {@link Amount }
     * 
     */
    public void setSettlementAmount(Amount value) {
        this.settlementAmount = value;
    }

    public boolean isSetSettlementAmount() {
        return (this.settlementAmount != null);
    }

    /**
     * Gets the value of the callerReference property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCallerReference() {
        return callerReference;
    }

    /**
     * Sets the value of the callerReference property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCallerReference(String value) {
        this.callerReference = value;
    }

    public boolean isSetCallerReference() {
        return (this.callerReference != null);
    }

    /**
     * Gets the value of the senderDescription property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSenderDescription() {
        return senderDescription;
    }

    /**
     * Sets the value of the senderDescription property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSenderDescription(String value) {
        this.senderDescription = value;
    }

    public boolean isSetSenderDescription() {
        return (this.senderDescription != null);
    }

    /**
     * Gets the value of the callerDescription property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCallerDescription() {
        return callerDescription;
    }

    /**
     * Sets the value of the callerDescription property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCallerDescription(String value) {
        this.callerDescription = value;
    }

    public boolean isSetCallerDescription() {
        return (this.callerDescription != null);
    }

    /**
     * Gets the value of the descriptorPolicy property.
     * 
     * @return possible object is {@link DescriptorPolicy }
     * 
     */
    public DescriptorPolicy getDescriptorPolicy() {
        return descriptorPolicy;
    }

    /**
     * Sets the value of the descriptorPolicy property.
     * 
     * @param value allowed object is {@link DescriptorPolicy }
     * 
     */
    public void setDescriptorPolicy(DescriptorPolicy value) {
        this.descriptorPolicy = value;
    }

    public boolean isSetDescriptorPolicy() {
        return (this.descriptorPolicy != null);
    }

    /**
     * Gets the value of the transactionTimeoutInMins property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getTransactionTimeoutInMins() {
        return transactionTimeoutInMins;
    }

    /**
     * Sets the value of the transactionTimeoutInMins property.
     * 
     * @param value allowed object is {@link Integer }
     * 
     */
    public void setTransactionTimeoutInMins(Integer value) {
        this.transactionTimeoutInMins = value;
    }

    public boolean isSetTransactionTimeoutInMins() {
        return (this.transactionTimeoutInMins != null);
    }

    /**
     * Sets the value of the SenderTokenId property.
     * 
     * @param value
     * @return this instance
     */
    public SettleDebtRequest withSenderTokenId(String value) {
        setSenderTokenId(value);
        return this;
    }

    /**
     * Sets the value of the CreditInstrumentId property.
     * 
     * @param value
     * @return this instance
     */
    public SettleDebtRequest withCreditInstrumentId(String value) {
        setCreditInstrumentId(value);
        return this;
    }

    /**
     * Sets the value of the SettlementAmount property.
     * 
     * @param value
     * @return this instance
     */
    public SettleDebtRequest withSettlementAmount(Amount value) {
        setSettlementAmount(value);
        return this;
    }

    /**
     * Sets the value of the CallerReference property.
     * 
     * @param value
     * @return this instance
     */
    public SettleDebtRequest withCallerReference(String value) {
        setCallerReference(value);
        return this;
    }

    /**
     * Sets the value of the SenderDescription property.
     * 
     * @param value
     * @return this instance
     */
    public SettleDebtRequest withSenderDescription(String value) {
        setSenderDescription(value);
        return this;
    }

    /**
     * Sets the value of the CallerDescription property.
     * 
     * @param value
     * @return this instance
     */
    public SettleDebtRequest withCallerDescription(String value) {
        setCallerDescription(value);
        return this;
    }

    /**
     * Sets the value of the DescriptorPolicy property.
     * 
     * @param value
     * @return this instance
     */
    public SettleDebtRequest withDescriptorPolicy(DescriptorPolicy value) {
        setDescriptorPolicy(value);
        return this;
    }

    /**
     * Sets the value of the TransactionTimeoutInMins property.
     * 
     * @param value
     * @return this instance
     */
    public SettleDebtRequest withTransactionTimeoutInMins(Integer value) {
        setTransactionTimeoutInMins(value);
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
        if (isSetSenderTokenId()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("SenderTokenId"));
            json.append(" : ");
            json.append(quoteJSON(getSenderTokenId()));
            first = false;
        }
        if (isSetCreditInstrumentId()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("CreditInstrumentId"));
            json.append(" : ");
            json.append(quoteJSON(getCreditInstrumentId()));
            first = false;
        }
        if (isSetSettlementAmount()) {
            if (!first)
                json.append(", ");
            json.append("\"SettlementAmount\" : {");
            Amount settlementAmount = getSettlementAmount();

            json.append(settlementAmount.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetCallerReference()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("CallerReference"));
            json.append(" : ");
            json.append(quoteJSON(getCallerReference()));
            first = false;
        }
        if (isSetSenderDescription()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("SenderDescription"));
            json.append(" : ");
            json.append(quoteJSON(getSenderDescription()));
            first = false;
        }
        if (isSetCallerDescription()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("CallerDescription"));
            json.append(" : ");
            json.append(quoteJSON(getCallerDescription()));
            first = false;
        }
        if (isSetDescriptorPolicy()) {
            if (!first)
                json.append(", ");
            json.append("\"DescriptorPolicy\" : {");
            DescriptorPolicy descriptorPolicy = getDescriptorPolicy();

            json.append(descriptorPolicy.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetTransactionTimeoutInMins()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("TransactionTimeoutInMins"));
            json.append(" : ");
            json.append(quoteJSON(getTransactionTimeoutInMins() + ""));
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

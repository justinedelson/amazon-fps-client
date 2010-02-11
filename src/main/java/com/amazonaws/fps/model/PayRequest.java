package com.amazonaws.fps.model;

import java.math.BigDecimal;
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
 *         &lt;element name="RecipientTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionAmount" type="{http://fps.amazonaws.com/doc/2008-09-17/}Amount" minOccurs="0"/>
 *         &lt;element name="ChargeFeeTo" type="{http://fps.amazonaws.com/doc/2008-09-17/}ChargeFeeTo" minOccurs="0"/>
 *         &lt;element name="CallerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptorPolicy" type="{http://fps.amazonaws.com/doc/2008-09-17/}DescriptorPolicy" minOccurs="0"/>
 *         &lt;element name="TransactionTimeoutInMins" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MarketplaceFixedFee" type="{http://fps.amazonaws.com/doc/2008-09-17/}Amount" minOccurs="0"/>
 *         &lt;element name="MarketplaceVariableFee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "senderTokenId", "recipientTokenId", "transactionAmount", "chargeFeeTo",
        "callerReference", "callerDescription", "senderDescription", "descriptorPolicy", "transactionTimeoutInMins",
        "marketplaceFixedFee", "marketplaceVariableFee" })
@XmlRootElement(name = "PayRequest")
public class PayRequest {

    @XmlElement(name = "SenderTokenId")
    protected String senderTokenId;
    @XmlElement(name = "RecipientTokenId")
    protected String recipientTokenId;
    @XmlElement(name = "TransactionAmount")
    protected Amount transactionAmount;
    @XmlElement(name = "ChargeFeeTo")
    protected ChargeFeeTo chargeFeeTo;
    @XmlElement(name = "CallerReference")
    protected String callerReference;
    @XmlElement(name = "CallerDescription")
    protected String callerDescription;
    @XmlElement(name = "SenderDescription")
    protected String senderDescription;
    @XmlElement(name = "DescriptorPolicy")
    protected DescriptorPolicy descriptorPolicy;
    @XmlElement(name = "TransactionTimeoutInMins")
    protected Integer transactionTimeoutInMins;
    @XmlElement(name = "MarketplaceFixedFee")
    protected Amount marketplaceFixedFee;
    @XmlElement(name = "MarketplaceVariableFee")
    protected BigDecimal marketplaceVariableFee;

    /**
     * Default constructor
     * 
     */
    public PayRequest() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public PayRequest(final String senderTokenId, final String recipientTokenId, final Amount transactionAmount,
            final ChargeFeeTo chargeFeeTo, final String callerReference, final String callerDescription,
            final String senderDescription, final DescriptorPolicy descriptorPolicy,
            final Integer transactionTimeoutInMins, final Amount marketplaceFixedFee,
            final BigDecimal marketplaceVariableFee) {
        this.senderTokenId = senderTokenId;
        this.recipientTokenId = recipientTokenId;
        this.transactionAmount = transactionAmount;
        this.chargeFeeTo = chargeFeeTo;
        this.callerReference = callerReference;
        this.callerDescription = callerDescription;
        this.senderDescription = senderDescription;
        this.descriptorPolicy = descriptorPolicy;
        this.transactionTimeoutInMins = transactionTimeoutInMins;
        this.marketplaceFixedFee = marketplaceFixedFee;
        this.marketplaceVariableFee = marketplaceVariableFee;
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
     * Gets the value of the recipientTokenId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRecipientTokenId() {
        return recipientTokenId;
    }

    /**
     * Sets the value of the recipientTokenId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setRecipientTokenId(String value) {
        this.recipientTokenId = value;
    }

    public boolean isSetRecipientTokenId() {
        return (this.recipientTokenId != null);
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return possible object is {@link Amount }
     * 
     */
    public Amount getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value allowed object is {@link Amount }
     * 
     */
    public void setTransactionAmount(Amount value) {
        this.transactionAmount = value;
    }

    public boolean isSetTransactionAmount() {
        return (this.transactionAmount != null);
    }

    /**
     * Gets the value of the chargeFeeTo property.
     * 
     * @return possible object is {@link ChargeFeeTo }
     * 
     */
    public ChargeFeeTo getChargeFeeTo() {
        return chargeFeeTo;
    }

    /**
     * Sets the value of the chargeFeeTo property.
     * 
     * @param value allowed object is {@link ChargeFeeTo }
     * 
     */
    public void setChargeFeeTo(ChargeFeeTo value) {
        this.chargeFeeTo = value;
    }

    public boolean isSetChargeFeeTo() {
        return (this.chargeFeeTo != null);
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
     * Gets the value of the marketplaceFixedFee property.
     * 
     * @return possible object is {@link Amount }
     * 
     */
    public Amount getMarketplaceFixedFee() {
        return marketplaceFixedFee;
    }

    /**
     * Sets the value of the marketplaceFixedFee property.
     * 
     * @param value allowed object is {@link Amount }
     * 
     */
    public void setMarketplaceFixedFee(Amount value) {
        this.marketplaceFixedFee = value;
    }

    public boolean isSetMarketplaceFixedFee() {
        return (this.marketplaceFixedFee != null);
    }

    /**
     * Gets the value of the marketplaceVariableFee property.
     * 
     * @return possible object is {@link BigDecimal }
     * 
     */
    public BigDecimal getMarketplaceVariableFee() {
        return marketplaceVariableFee;
    }

    /**
     * Sets the value of the marketplaceVariableFee property.
     * 
     * @param value allowed object is {@link BigDecimal }
     * 
     */
    public void setMarketplaceVariableFee(BigDecimal value) {
        this.marketplaceVariableFee = value;
    }

    public boolean isSetMarketplaceVariableFee() {
        return (this.marketplaceVariableFee != null);
    }

    /**
     * Sets the value of the SenderTokenId property.
     * 
     * @param value
     * @return this instance
     */
    public PayRequest withSenderTokenId(String value) {
        setSenderTokenId(value);
        return this;
    }

    /**
     * Sets the value of the RecipientTokenId property.
     * 
     * @param value
     * @return this instance
     */
    public PayRequest withRecipientTokenId(String value) {
        setRecipientTokenId(value);
        return this;
    }

    /**
     * Sets the value of the TransactionAmount property.
     * 
     * @param value
     * @return this instance
     */
    public PayRequest withTransactionAmount(Amount value) {
        setTransactionAmount(value);
        return this;
    }

    /**
     * Sets the value of the ChargeFeeTo property.
     * 
     * @param value
     * @return this instance
     */
    public PayRequest withChargeFeeTo(ChargeFeeTo value) {
        setChargeFeeTo(value);
        return this;
    }

    /**
     * Sets the value of the CallerReference property.
     * 
     * @param value
     * @return this instance
     */
    public PayRequest withCallerReference(String value) {
        setCallerReference(value);
        return this;
    }

    /**
     * Sets the value of the CallerDescription property.
     * 
     * @param value
     * @return this instance
     */
    public PayRequest withCallerDescription(String value) {
        setCallerDescription(value);
        return this;
    }

    /**
     * Sets the value of the SenderDescription property.
     * 
     * @param value
     * @return this instance
     */
    public PayRequest withSenderDescription(String value) {
        setSenderDescription(value);
        return this;
    }

    /**
     * Sets the value of the DescriptorPolicy property.
     * 
     * @param value
     * @return this instance
     */
    public PayRequest withDescriptorPolicy(DescriptorPolicy value) {
        setDescriptorPolicy(value);
        return this;
    }

    /**
     * Sets the value of the TransactionTimeoutInMins property.
     * 
     * @param value
     * @return this instance
     */
    public PayRequest withTransactionTimeoutInMins(Integer value) {
        setTransactionTimeoutInMins(value);
        return this;
    }

    /**
     * Sets the value of the MarketplaceFixedFee property.
     * 
     * @param value
     * @return this instance
     */
    public PayRequest withMarketplaceFixedFee(Amount value) {
        setMarketplaceFixedFee(value);
        return this;
    }

    /**
     * Sets the value of the MarketplaceVariableFee property.
     * 
     * @param value
     * @return this instance
     */
    public PayRequest withMarketplaceVariableFee(BigDecimal value) {
        setMarketplaceVariableFee(value);
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
        if (isSetRecipientTokenId()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("RecipientTokenId"));
            json.append(" : ");
            json.append(quoteJSON(getRecipientTokenId()));
            first = false;
        }
        if (isSetTransactionAmount()) {
            if (!first)
                json.append(", ");
            json.append("\"TransactionAmount\" : {");
            Amount transactionAmount = getTransactionAmount();

            json.append(transactionAmount.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetChargeFeeTo()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("ChargeFeeTo"));
            json.append(" : ");
            json.append(quoteJSON(getChargeFeeTo().value()));
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
        if (isSetCallerDescription()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("CallerDescription"));
            json.append(" : ");
            json.append(quoteJSON(getCallerDescription()));
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
        if (isSetMarketplaceFixedFee()) {
            if (!first)
                json.append(", ");
            json.append("\"MarketplaceFixedFee\" : {");
            Amount marketplaceFixedFee = getMarketplaceFixedFee();

            json.append(marketplaceFixedFee.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetMarketplaceVariableFee()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("MarketplaceVariableFee"));
            json.append(" : ");
            json.append(quoteJSON(getMarketplaceVariableFee() + ""));
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

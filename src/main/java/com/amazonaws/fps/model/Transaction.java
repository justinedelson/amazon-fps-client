package com.amazonaws.fps.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for Transaction complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CallerTransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateReceived" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateCompleted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TransactionAmount" type="{http://fps.amazonaws.com/doc/2008-09-17/}Amount"/>
 *         &lt;element name="FPSOperation" type="{http://fps.amazonaws.com/doc/2008-09-17/}FPSOperation"/>
 *         &lt;element name="TransactionStatus" type="{http://fps.amazonaws.com/doc/2008-09-17/}TransactionStatus"/>
 *         &lt;element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionPart" type="{http://fps.amazonaws.com/doc/2008-09-17/}TransactionPart" maxOccurs="unbounded"/>
 *         &lt;element name="PaymentMethod" type="{http://fps.amazonaws.com/doc/2008-09-17/}PaymentMethod"/>
 *         &lt;element name="SenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecipientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FPSFees" type="{http://fps.amazonaws.com/doc/2008-09-17/}Amount"/>
 *         &lt;element name="Balance" type="{http://fps.amazonaws.com/doc/2008-09-17/}Amount"/>
 *         &lt;element name="SenderTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "Transaction", propOrder = { "transactionId", "callerTransactionDate", "dateReceived", "dateCompleted",
        "transactionAmount", "fpsOperation", "transactionStatus", "statusMessage", "statusCode",
        "originalTransactionId", "transactionPart", "paymentMethod", "senderName", "callerName", "recipientName",
        "fpsFees", "balance", "senderTokenId", "recipientTokenId" })
public class Transaction {

    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "CallerTransactionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callerTransactionDate;
    @XmlElement(name = "DateReceived", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReceived;
    @XmlElement(name = "DateCompleted")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCompleted;
    @XmlElement(name = "TransactionAmount", required = true)
    protected Amount transactionAmount;
    @XmlElement(name = "FPSOperation", required = true)
    protected FPSOperation fpsOperation;
    @XmlElement(name = "TransactionStatus", required = true)
    protected TransactionStatus transactionStatus;
    @XmlElement(name = "StatusMessage")
    protected String statusMessage;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "OriginalTransactionId")
    protected String originalTransactionId;
    @XmlElement(name = "TransactionPart", required = true)
    protected List<TransactionPart> transactionPart;
    @XmlElement(name = "PaymentMethod", required = true)
    protected PaymentMethod paymentMethod;
    @XmlElement(name = "SenderName")
    protected String senderName;
    @XmlElement(name = "CallerName", required = true)
    protected String callerName;
    @XmlElement(name = "RecipientName")
    protected String recipientName;
    @XmlElement(name = "FPSFees", required = true)
    protected Amount fpsFees;
    @XmlElement(name = "Balance", required = true)
    protected Amount balance;
    @XmlElement(name = "SenderTokenId")
    protected String senderTokenId;
    @XmlElement(name = "RecipientTokenId")
    protected String recipientTokenId;

    /**
     * Default constructor
     * 
     */
    public Transaction() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public Transaction(final String transactionId, final XMLGregorianCalendar callerTransactionDate,
            final XMLGregorianCalendar dateReceived, final XMLGregorianCalendar dateCompleted,
            final Amount transactionAmount, final FPSOperation fpsOperation, final TransactionStatus transactionStatus,
            final String statusMessage, final String statusCode, final String originalTransactionId,
            final List<TransactionPart> transactionPart, final PaymentMethod paymentMethod, final String senderName,
            final String callerName, final String recipientName, final Amount fpsFees, final Amount balance,
            final String senderTokenId, final String recipientTokenId) {
        this.transactionId = transactionId;
        this.callerTransactionDate = callerTransactionDate;
        this.dateReceived = dateReceived;
        this.dateCompleted = dateCompleted;
        this.transactionAmount = transactionAmount;
        this.fpsOperation = fpsOperation;
        this.transactionStatus = transactionStatus;
        this.statusMessage = statusMessage;
        this.statusCode = statusCode;
        this.originalTransactionId = originalTransactionId;
        this.transactionPart = transactionPart;
        this.paymentMethod = paymentMethod;
        this.senderName = senderName;
        this.callerName = callerName;
        this.recipientName = recipientName;
        this.fpsFees = fpsFees;
        this.balance = balance;
        this.senderTokenId = senderTokenId;
        this.recipientTokenId = recipientTokenId;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    public boolean isSetTransactionId() {
        return (this.transactionId != null);
    }

    /**
     * Gets the value of the callerTransactionDate property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getCallerTransactionDate() {
        return callerTransactionDate;
    }

    /**
     * Sets the value of the callerTransactionDate property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setCallerTransactionDate(XMLGregorianCalendar value) {
        this.callerTransactionDate = value;
    }

    public boolean isSetCallerTransactionDate() {
        return (this.callerTransactionDate != null);
    }

    /**
     * Gets the value of the dateReceived property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDateReceived() {
        return dateReceived;
    }

    /**
     * Sets the value of the dateReceived property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDateReceived(XMLGregorianCalendar value) {
        this.dateReceived = value;
    }

    public boolean isSetDateReceived() {
        return (this.dateReceived != null);
    }

    /**
     * Gets the value of the dateCompleted property.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDateCompleted() {
        return dateCompleted;
    }

    /**
     * Sets the value of the dateCompleted property.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setDateCompleted(XMLGregorianCalendar value) {
        this.dateCompleted = value;
    }

    public boolean isSetDateCompleted() {
        return (this.dateCompleted != null);
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
     * Gets the value of the fpsOperation property.
     * 
     * @return possible object is {@link FPSOperation }
     * 
     */
    public FPSOperation getFPSOperation() {
        return fpsOperation;
    }

    /**
     * Sets the value of the fpsOperation property.
     * 
     * @param value allowed object is {@link FPSOperation }
     * 
     */
    public void setFPSOperation(FPSOperation value) {
        this.fpsOperation = value;
    }

    public boolean isSetFPSOperation() {
        return (this.fpsOperation != null);
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return possible object is {@link TransactionStatus }
     * 
     */
    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value allowed object is {@link TransactionStatus }
     * 
     */
    public void setTransactionStatus(TransactionStatus value) {
        this.transactionStatus = value;
    }

    public boolean isSetTransactionStatus() {
        return (this.transactionStatus != null);
    }

    /**
     * Gets the value of the statusMessage property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

    public boolean isSetStatusMessage() {
        return (this.statusMessage != null);
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    public boolean isSetStatusCode() {
        return (this.statusCode != null);
    }

    /**
     * Gets the value of the originalTransactionId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getOriginalTransactionId() {
        return originalTransactionId;
    }

    /**
     * Sets the value of the originalTransactionId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setOriginalTransactionId(String value) {
        this.originalTransactionId = value;
    }

    public boolean isSetOriginalTransactionId() {
        return (this.originalTransactionId != null);
    }

    /**
     * Gets the value of the transactionPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the transactionPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTransactionPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionPart }
     * 
     * 
     */
    public List<TransactionPart> getTransactionPart() {
        if (transactionPart == null) {
            transactionPart = new ArrayList<TransactionPart>();
        }
        return this.transactionPart;
    }

    public boolean isSetTransactionPart() {
        return ((this.transactionPart != null) && (!this.transactionPart.isEmpty()));
    }

    public void unsetTransactionPart() {
        this.transactionPart = null;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return possible object is {@link PaymentMethod }
     * 
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value allowed object is {@link PaymentMethod }
     * 
     */
    public void setPaymentMethod(PaymentMethod value) {
        this.paymentMethod = value;
    }

    public boolean isSetPaymentMethod() {
        return (this.paymentMethod != null);
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    public boolean isSetSenderName() {
        return (this.senderName != null);
    }

    /**
     * Gets the value of the callerName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCallerName() {
        return callerName;
    }

    /**
     * Sets the value of the callerName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCallerName(String value) {
        this.callerName = value;
    }

    public boolean isSetCallerName() {
        return (this.callerName != null);
    }

    /**
     * Gets the value of the recipientName property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setRecipientName(String value) {
        this.recipientName = value;
    }

    public boolean isSetRecipientName() {
        return (this.recipientName != null);
    }

    /**
     * Gets the value of the fpsFees property.
     * 
     * @return possible object is {@link Amount }
     * 
     */
    public Amount getFPSFees() {
        return fpsFees;
    }

    /**
     * Sets the value of the fpsFees property.
     * 
     * @param value allowed object is {@link Amount }
     * 
     */
    public void setFPSFees(Amount value) {
        this.fpsFees = value;
    }

    public boolean isSetFPSFees() {
        return (this.fpsFees != null);
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return possible object is {@link Amount }
     * 
     */
    public Amount getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value allowed object is {@link Amount }
     * 
     */
    public void setBalance(Amount value) {
        this.balance = value;
    }

    public boolean isSetBalance() {
        return (this.balance != null);
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
     * Sets the value of the TransactionId property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withTransactionId(String value) {
        setTransactionId(value);
        return this;
    }

    /**
     * Sets the value of the CallerTransactionDate property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withCallerTransactionDate(XMLGregorianCalendar value) {
        setCallerTransactionDate(value);
        return this;
    }

    /**
     * Sets the value of the DateReceived property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withDateReceived(XMLGregorianCalendar value) {
        setDateReceived(value);
        return this;
    }

    /**
     * Sets the value of the DateCompleted property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withDateCompleted(XMLGregorianCalendar value) {
        setDateCompleted(value);
        return this;
    }

    /**
     * Sets the value of the TransactionAmount property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withTransactionAmount(Amount value) {
        setTransactionAmount(value);
        return this;
    }

    /**
     * Sets the value of the FPSOperation property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withFPSOperation(FPSOperation value) {
        setFPSOperation(value);
        return this;
    }

    /**
     * Sets the value of the TransactionStatus property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withTransactionStatus(TransactionStatus value) {
        setTransactionStatus(value);
        return this;
    }

    /**
     * Sets the value of the StatusMessage property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withStatusMessage(String value) {
        setStatusMessage(value);
        return this;
    }

    /**
     * Sets the value of the StatusCode property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withStatusCode(String value) {
        setStatusCode(value);
        return this;
    }

    /**
     * Sets the value of the OriginalTransactionId property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withOriginalTransactionId(String value) {
        setOriginalTransactionId(value);
        return this;
    }

    /**
     * Sets the value of the TransactionPart property.
     * 
     * @param values
     * @return this instance
     */
    public Transaction withTransactionPart(TransactionPart... values) {
        for (TransactionPart value : values) {
            getTransactionPart().add(value);
        }
        return this;
    }

    /**
     * Sets the value of the PaymentMethod property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withPaymentMethod(PaymentMethod value) {
        setPaymentMethod(value);
        return this;
    }

    /**
     * Sets the value of the SenderName property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withSenderName(String value) {
        setSenderName(value);
        return this;
    }

    /**
     * Sets the value of the CallerName property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withCallerName(String value) {
        setCallerName(value);
        return this;
    }

    /**
     * Sets the value of the RecipientName property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withRecipientName(String value) {
        setRecipientName(value);
        return this;
    }

    /**
     * Sets the value of the FPSFees property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withFPSFees(Amount value) {
        setFPSFees(value);
        return this;
    }

    /**
     * Sets the value of the Balance property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withBalance(Amount value) {
        setBalance(value);
        return this;
    }

    /**
     * Sets the value of the SenderTokenId property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withSenderTokenId(String value) {
        setSenderTokenId(value);
        return this;
    }

    /**
     * Sets the value of the RecipientTokenId property.
     * 
     * @param value
     * @return this instance
     */
    public Transaction withRecipientTokenId(String value) {
        setRecipientTokenId(value);
        return this;
    }

    /**
     * Sets the value of the transactionPart property.
     * 
     * @param transactionPart allowed object is {@link TransactionPart }
     * 
     */
    public void setTransactionPart(List<TransactionPart> transactionPart) {
        this.transactionPart = transactionPart;
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
        if (isSetTransactionId()) {
            xml.append("<TransactionId>");
            xml.append(escapeXML(getTransactionId()));
            xml.append("</TransactionId>");
        }
        if (isSetCallerTransactionDate()) {
            xml.append("<CallerTransactionDate>");
            xml.append(getCallerTransactionDate() + "");
            xml.append("</CallerTransactionDate>");
        }
        if (isSetDateReceived()) {
            xml.append("<DateReceived>");
            xml.append(getDateReceived() + "");
            xml.append("</DateReceived>");
        }
        if (isSetDateCompleted()) {
            xml.append("<DateCompleted>");
            xml.append(getDateCompleted() + "");
            xml.append("</DateCompleted>");
        }
        if (isSetTransactionAmount()) {
            Amount transactionAmount = getTransactionAmount();
            xml.append("<TransactionAmount>");
            xml.append(transactionAmount.toXMLFragment());
            xml.append("</TransactionAmount>");
        }
        if (isSetFPSOperation()) {
            xml.append("<FPSOperation>");
            xml.append(getFPSOperation().value());
            xml.append("</FPSOperation>");
        }
        if (isSetTransactionStatus()) {
            xml.append("<TransactionStatus>");
            xml.append(getTransactionStatus().value());
            xml.append("</TransactionStatus>");
        }
        if (isSetStatusMessage()) {
            xml.append("<StatusMessage>");
            xml.append(escapeXML(getStatusMessage()));
            xml.append("</StatusMessage>");
        }
        if (isSetStatusCode()) {
            xml.append("<StatusCode>");
            xml.append(escapeXML(getStatusCode()));
            xml.append("</StatusCode>");
        }
        if (isSetOriginalTransactionId()) {
            xml.append("<OriginalTransactionId>");
            xml.append(escapeXML(getOriginalTransactionId()));
            xml.append("</OriginalTransactionId>");
        }
        java.util.List<TransactionPart> transactionPartList = getTransactionPart();
        for (TransactionPart transactionPart : transactionPartList) {
            xml.append("<TransactionPart>");
            xml.append(transactionPart.toXMLFragment());
            xml.append("</TransactionPart>");
        }
        if (isSetPaymentMethod()) {
            xml.append("<PaymentMethod>");
            xml.append(getPaymentMethod().value());
            xml.append("</PaymentMethod>");
        }
        if (isSetSenderName()) {
            xml.append("<SenderName>");
            xml.append(escapeXML(getSenderName()));
            xml.append("</SenderName>");
        }
        if (isSetCallerName()) {
            xml.append("<CallerName>");
            xml.append(escapeXML(getCallerName()));
            xml.append("</CallerName>");
        }
        if (isSetRecipientName()) {
            xml.append("<RecipientName>");
            xml.append(escapeXML(getRecipientName()));
            xml.append("</RecipientName>");
        }
        if (isSetFPSFees()) {
            Amount FPSFees = getFPSFees();
            xml.append("<FPSFees>");
            xml.append(FPSFees.toXMLFragment());
            xml.append("</FPSFees>");
        }
        if (isSetBalance()) {
            Amount balance = getBalance();
            xml.append("<Balance>");
            xml.append(balance.toXMLFragment());
            xml.append("</Balance>");
        }
        if (isSetSenderTokenId()) {
            xml.append("<SenderTokenId>");
            xml.append(escapeXML(getSenderTokenId()));
            xml.append("</SenderTokenId>");
        }
        if (isSetRecipientTokenId()) {
            xml.append("<RecipientTokenId>");
            xml.append(escapeXML(getRecipientTokenId()));
            xml.append("</RecipientTokenId>");
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
        if (isSetTransactionId()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("TransactionId"));
            json.append(" : ");
            json.append(quoteJSON(getTransactionId()));
            first = false;
        }
        if (isSetCallerTransactionDate()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("CallerTransactionDate"));
            json.append(" : ");
            json.append(quoteJSON(getCallerTransactionDate() + ""));
            first = false;
        }
        if (isSetDateReceived()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("DateReceived"));
            json.append(" : ");
            json.append(quoteJSON(getDateReceived() + ""));
            first = false;
        }
        if (isSetDateCompleted()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("DateCompleted"));
            json.append(" : ");
            json.append(quoteJSON(getDateCompleted() + ""));
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
        if (isSetFPSOperation()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("FPSOperation"));
            json.append(" : ");
            json.append(quoteJSON(getFPSOperation().value()));
            first = false;
        }
        if (isSetTransactionStatus()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("TransactionStatus"));
            json.append(" : ");
            json.append(quoteJSON(getTransactionStatus().value()));
            first = false;
        }
        if (isSetStatusMessage()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("StatusMessage"));
            json.append(" : ");
            json.append(quoteJSON(getStatusMessage()));
            first = false;
        }
        if (isSetStatusCode()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("StatusCode"));
            json.append(" : ");
            json.append(quoteJSON(getStatusCode()));
            first = false;
        }
        if (isSetOriginalTransactionId()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("OriginalTransactionId"));
            json.append(" : ");
            json.append(quoteJSON(getOriginalTransactionId()));
            first = false;
        }
        if (isSetTransactionPart()) {
            if (!first)
                json.append(", ");
            json.append("\"TransactionPart\" : [");
            java.util.List<TransactionPart> transactionPartList = getTransactionPart();
            int transactionPartListIndex = 0;
            for (TransactionPart transactionPart : transactionPartList) {
                if (transactionPartListIndex > 0)
                    json.append(", ");
                json.append("{");
                json.append("");
                json.append(transactionPart.toJSONFragment());
                json.append("}");
                first = false;
                ++transactionPartListIndex;
            }
            json.append("]");
        }
        if (isSetPaymentMethod()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("PaymentMethod"));
            json.append(" : ");
            json.append(quoteJSON(getPaymentMethod().value()));
            first = false;
        }
        if (isSetSenderName()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("SenderName"));
            json.append(" : ");
            json.append(quoteJSON(getSenderName()));
            first = false;
        }
        if (isSetCallerName()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("CallerName"));
            json.append(" : ");
            json.append(quoteJSON(getCallerName()));
            first = false;
        }
        if (isSetRecipientName()) {
            if (!first)
                json.append(", ");
            json.append(quoteJSON("RecipientName"));
            json.append(" : ");
            json.append(quoteJSON(getRecipientName()));
            first = false;
        }
        if (isSetFPSFees()) {
            if (!first)
                json.append(", ");
            json.append("\"FPSFees\" : {");
            Amount FPSFees = getFPSFees();

            json.append(FPSFees.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetBalance()) {
            if (!first)
                json.append(", ");
            json.append("\"Balance\" : {");
            Amount balance = getBalance();

            json.append(balance.toJSONFragment());
            json.append("}");
            first = false;
        }
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

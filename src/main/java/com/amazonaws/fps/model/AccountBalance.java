package com.amazonaws.fps.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AccountBalance complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AccountBalance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalBalance" type="{http://fps.amazonaws.com/doc/2008-09-17/}Amount"/>
 *         &lt;element name="PendingInBalance" type="{http://fps.amazonaws.com/doc/2008-09-17/}Amount"/>
 *         &lt;element name="PendingOutBalance" type="{http://fps.amazonaws.com/doc/2008-09-17/}Amount"/>
 *         &lt;element name="AvailableBalances" type="{http://fps.amazonaws.com/doc/2008-09-17/}AvailableBalances"/>
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
@XmlType(name = "AccountBalance", propOrder = { "totalBalance", "pendingInBalance", "pendingOutBalance",
        "availableBalances" })
public class AccountBalance {

    @XmlElement(name = "TotalBalance", required = true)
    protected Amount totalBalance;
    @XmlElement(name = "PendingInBalance", required = true)
    protected Amount pendingInBalance;
    @XmlElement(name = "PendingOutBalance", required = true)
    protected Amount pendingOutBalance;
    @XmlElement(name = "AvailableBalances", required = true)
    protected AvailableBalances availableBalances;

    /**
     * Default constructor
     * 
     */
    public AccountBalance() {
        super();
    }

    /**
     * Value constructor
     * 
     */
    public AccountBalance(final Amount totalBalance, final Amount pendingInBalance, final Amount pendingOutBalance,
            final AvailableBalances availableBalances) {
        this.totalBalance = totalBalance;
        this.pendingInBalance = pendingInBalance;
        this.pendingOutBalance = pendingOutBalance;
        this.availableBalances = availableBalances;
    }

    /**
     * Gets the value of the totalBalance property.
     * 
     * @return possible object is {@link Amount }
     * 
     */
    public Amount getTotalBalance() {
        return totalBalance;
    }

    /**
     * Sets the value of the totalBalance property.
     * 
     * @param value allowed object is {@link Amount }
     * 
     */
    public void setTotalBalance(Amount value) {
        this.totalBalance = value;
    }

    public boolean isSetTotalBalance() {
        return (this.totalBalance != null);
    }

    /**
     * Gets the value of the pendingInBalance property.
     * 
     * @return possible object is {@link Amount }
     * 
     */
    public Amount getPendingInBalance() {
        return pendingInBalance;
    }

    /**
     * Sets the value of the pendingInBalance property.
     * 
     * @param value allowed object is {@link Amount }
     * 
     */
    public void setPendingInBalance(Amount value) {
        this.pendingInBalance = value;
    }

    public boolean isSetPendingInBalance() {
        return (this.pendingInBalance != null);
    }

    /**
     * Gets the value of the pendingOutBalance property.
     * 
     * @return possible object is {@link Amount }
     * 
     */
    public Amount getPendingOutBalance() {
        return pendingOutBalance;
    }

    /**
     * Sets the value of the pendingOutBalance property.
     * 
     * @param value allowed object is {@link Amount }
     * 
     */
    public void setPendingOutBalance(Amount value) {
        this.pendingOutBalance = value;
    }

    public boolean isSetPendingOutBalance() {
        return (this.pendingOutBalance != null);
    }

    /**
     * Gets the value of the availableBalances property.
     * 
     * @return possible object is {@link AvailableBalances }
     * 
     */
    public AvailableBalances getAvailableBalances() {
        return availableBalances;
    }

    /**
     * Sets the value of the availableBalances property.
     * 
     * @param value allowed object is {@link AvailableBalances }
     * 
     */
    public void setAvailableBalances(AvailableBalances value) {
        this.availableBalances = value;
    }

    public boolean isSetAvailableBalances() {
        return (this.availableBalances != null);
    }

    /**
     * Sets the value of the TotalBalance property.
     * 
     * @param value
     * @return this instance
     */
    public AccountBalance withTotalBalance(Amount value) {
        setTotalBalance(value);
        return this;
    }

    /**
     * Sets the value of the PendingInBalance property.
     * 
     * @param value
     * @return this instance
     */
    public AccountBalance withPendingInBalance(Amount value) {
        setPendingInBalance(value);
        return this;
    }

    /**
     * Sets the value of the PendingOutBalance property.
     * 
     * @param value
     * @return this instance
     */
    public AccountBalance withPendingOutBalance(Amount value) {
        setPendingOutBalance(value);
        return this;
    }

    /**
     * Sets the value of the AvailableBalances property.
     * 
     * @param value
     * @return this instance
     */
    public AccountBalance withAvailableBalances(AvailableBalances value) {
        setAvailableBalances(value);
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
        if (isSetTotalBalance()) {
            Amount totalBalance = getTotalBalance();
            xml.append("<TotalBalance>");
            xml.append(totalBalance.toXMLFragment());
            xml.append("</TotalBalance>");
        }
        if (isSetPendingInBalance()) {
            Amount pendingInBalance = getPendingInBalance();
            xml.append("<PendingInBalance>");
            xml.append(pendingInBalance.toXMLFragment());
            xml.append("</PendingInBalance>");
        }
        if (isSetPendingOutBalance()) {
            Amount pendingOutBalance = getPendingOutBalance();
            xml.append("<PendingOutBalance>");
            xml.append(pendingOutBalance.toXMLFragment());
            xml.append("</PendingOutBalance>");
        }
        if (isSetAvailableBalances()) {
            AvailableBalances availableBalances = getAvailableBalances();
            xml.append("<AvailableBalances>");
            xml.append(availableBalances.toXMLFragment());
            xml.append("</AvailableBalances>");
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
        if (isSetTotalBalance()) {
            if (!first)
                json.append(", ");
            json.append("\"TotalBalance\" : {");
            Amount totalBalance = getTotalBalance();

            json.append(totalBalance.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetPendingInBalance()) {
            if (!first)
                json.append(", ");
            json.append("\"PendingInBalance\" : {");
            Amount pendingInBalance = getPendingInBalance();

            json.append(pendingInBalance.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetPendingOutBalance()) {
            if (!first)
                json.append(", ");
            json.append("\"PendingOutBalance\" : {");
            Amount pendingOutBalance = getPendingOutBalance();

            json.append(pendingOutBalance.toJSONFragment());
            json.append("}");
            first = false;
        }
        if (isSetAvailableBalances()) {
            if (!first)
                json.append(", ");
            json.append("\"AvailableBalances\" : {");
            AvailableBalances availableBalances = getAvailableBalances();

            json.append(availableBalances.toJSONFragment());
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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.17 at 09:04:29 AM CDT 
//


package com.jamfsoftware.research.macingestor.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="value" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="cn"/>
 *             &lt;enumeration value="displayName"/>
 *             &lt;enumeration value="dn"/>
 *             &lt;enumeration value="emailAddress"/>
 *             &lt;enumeration value="emailAddressDomain"/>
 *             &lt;enumeration value="emailAddressLocalPart"/>
 *             &lt;enumeration value="firstName"/>
 *             &lt;enumeration value="lastName"/>
 *             &lt;enumeration value="locale"/>
 *             &lt;enumeration value="ou"/>
 *             &lt;enumeration value="sAMAccountName"/>
 *             &lt;enumeration value="username"/>
 *             &lt;enumeration value="upn"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "userVariable")
public class UserVariable {

    @XmlAttribute(name = "value", required = true)
    protected java.lang.String value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }
    
    public java.lang.String getJSSVariableName(){
    	switch(value){
    		case "cn": return "$USERNAME";
    		case "displayName": return "$FULLNAME";
    		case "dn" : return "$FULLNAME";
    		case "emailAddress": return "$EMAIL";
    		case "emailAddressDomain" : return "$EMAIL";
    		case "emailAddressLocalPart" : return "$EMAIL";
    		case "firstName" : return "$FIRSTNAME";
    		case "lastName": return "$LASTNAME";
    		case "locale" : return "$LOCALE";
    		case "ou" : return "$OU";
    		case "sAMAccountName" : return "$USERNAME";
    		case "username" : return "$USERNAME";
    		case "upn" : return "$USERNAME";
    		default : return null;
    	}
    }

}

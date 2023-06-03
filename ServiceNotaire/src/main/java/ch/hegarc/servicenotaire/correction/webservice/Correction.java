
package ch.hegarc.servicenotaire.correction.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for correction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="correction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textACorriger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "correction", propOrder = {
    "textACorriger"
})
public class Correction {

    protected String textACorriger;

    /**
     * Gets the value of the textACorriger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextACorriger() {
        return textACorriger;
    }

    /**
     * Sets the value of the textACorriger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextACorriger(String value) {
        this.textACorriger = value;
    }

}

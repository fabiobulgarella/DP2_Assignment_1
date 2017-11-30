//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.30 alle 11:16:52 PM CET 
//


package it.polito.dp2.NFV.sol1.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.example.org/nfvInfo}nameType" />
 *       &lt;attribute name="functionalType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="CACHE"/>
 *             &lt;enumeration value="DPI"/>
 *             &lt;enumeration value="FW"/>
 *             &lt;enumeration value="MAIL_CLIENT"/>
 *             &lt;enumeration value="MAIL_SERVER"/>
 *             &lt;enumeration value="NAT"/>
 *             &lt;enumeration value="SPAM"/>
 *             &lt;enumeration value="VPN"/>
 *             &lt;enumeration value="WEB_CLIENT"/>
 *             &lt;enumeration value="WEB_SERVER"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="reqMemory" use="required" type="{http://www.example.org/nfvInfo}nonNegativeInt" />
 *       &lt;attribute name="reqStorage" use="required" type="{http://www.example.org/nfvInfo}nonNegativeInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "vnf")
public class Vnf {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "functionalType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String functionalType;
    @XmlAttribute(name = "reqMemory", required = true)
    protected int reqMemory;
    @XmlAttribute(name = "reqStorage", required = true)
    protected int reqStorage;

    /**
     * Recupera il valore della proprietà name.
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
     * Imposta il valore della proprietà name.
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
     * Recupera il valore della proprietà functionalType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionalType() {
        return functionalType;
    }

    /**
     * Imposta il valore della proprietà functionalType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionalType(String value) {
        this.functionalType = value;
    }

    /**
     * Recupera il valore della proprietà reqMemory.
     * 
     */
    public int getReqMemory() {
        return reqMemory;
    }

    /**
     * Imposta il valore della proprietà reqMemory.
     * 
     */
    public void setReqMemory(int value) {
        this.reqMemory = value;
    }

    /**
     * Recupera il valore della proprietà reqStorage.
     * 
     */
    public int getReqStorage() {
        return reqStorage;
    }

    /**
     * Imposta il valore della proprietà reqStorage.
     * 
     */
    public void setReqStorage(int value) {
        this.reqStorage = value;
    }

}

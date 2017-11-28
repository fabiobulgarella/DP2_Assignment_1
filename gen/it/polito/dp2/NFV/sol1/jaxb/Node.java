//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.28 alle 10:20:38 PM CET 
//


package it.polito.dp2.NFV.sol1.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://tempuri.org/nfvInfo}nameType" />
 *       &lt;attribute name="vnf_type" use="required" type="{http://tempuri.org/nfvInfo}nameType" />
 *       &lt;attribute name="host" use="required" type="{http://tempuri.org/nfvInfo}nameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "node")
public class Node {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "vnf_type", required = true)
    protected String vnfType;
    @XmlAttribute(name = "host", required = true)
    protected String host;

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
     * Recupera il valore della proprietà vnfType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVnfType() {
        return vnfType;
    }

    /**
     * Imposta il valore della proprietà vnfType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVnfType(String value) {
        this.vnfType = value;
    }

    /**
     * Recupera il valore della proprietà host.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Imposta il valore della proprietà host.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

}

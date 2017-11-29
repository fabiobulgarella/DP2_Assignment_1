//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.29 alle 12:37:28 PM CET 
//


package it.polito.dp2.NFV.sol1.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/nfvInfo}max_vnfs"/>
 *         &lt;element ref="{http://www.example.org/nfvInfo}memory"/>
 *         &lt;element ref="{http://www.example.org/nfvInfo}storage"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.example.org/nfvInfo}nameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "maxVnfs",
    "memory",
    "storage"
})
@XmlRootElement(name = "host")
public class Host {

    @XmlElement(name = "max_vnfs", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxVnfs;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger memory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger storage;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Recupera il valore della proprietà maxVnfs.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxVnfs() {
        return maxVnfs;
    }

    /**
     * Imposta il valore della proprietà maxVnfs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxVnfs(BigInteger value) {
        this.maxVnfs = value;
    }

    /**
     * Recupera il valore della proprietà memory.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMemory() {
        return memory;
    }

    /**
     * Imposta il valore della proprietà memory.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMemory(BigInteger value) {
        this.memory = value;
    }

    /**
     * Recupera il valore della proprietà storage.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStorage() {
        return storage;
    }

    /**
     * Imposta il valore della proprietà storage.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStorage(BigInteger value) {
        this.storage = value;
    }

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

}

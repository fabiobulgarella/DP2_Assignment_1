//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.30 alle 11:16:52 PM CET 
//


package it.polito.dp2.NFV.sol1.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.example.org/nfvInfo}catalog"/>
 *         &lt;element ref="{http://www.example.org/nfvInfo}nffgs"/>
 *         &lt;element ref="{http://www.example.org/nfvInfo}hosts"/>
 *         &lt;element ref="{http://www.example.org/nfvInfo}connections"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "catalog",
    "nffgs",
    "hosts",
    "connections"
})
@XmlRootElement(name = "nfv")
public class Nfv {

    @XmlElement(required = true)
    protected Catalog catalog;
    @XmlElement(required = true)
    protected Nffgs nffgs;
    @XmlElement(required = true)
    protected Hosts hosts;
    @XmlElement(required = true)
    protected Connections connections;

    /**
     * Recupera il valore della propriet� catalog.
     * 
     * @return
     *     possible object is
     *     {@link Catalog }
     *     
     */
    public Catalog getCatalog() {
        return catalog;
    }

    /**
     * Imposta il valore della propriet� catalog.
     * 
     * @param value
     *     allowed object is
     *     {@link Catalog }
     *     
     */
    public void setCatalog(Catalog value) {
        this.catalog = value;
    }

    /**
     * Recupera il valore della propriet� nffgs.
     * 
     * @return
     *     possible object is
     *     {@link Nffgs }
     *     
     */
    public Nffgs getNffgs() {
        return nffgs;
    }

    /**
     * Imposta il valore della propriet� nffgs.
     * 
     * @param value
     *     allowed object is
     *     {@link Nffgs }
     *     
     */
    public void setNffgs(Nffgs value) {
        this.nffgs = value;
    }

    /**
     * Recupera il valore della propriet� hosts.
     * 
     * @return
     *     possible object is
     *     {@link Hosts }
     *     
     */
    public Hosts getHosts() {
        return hosts;
    }

    /**
     * Imposta il valore della propriet� hosts.
     * 
     * @param value
     *     allowed object is
     *     {@link Hosts }
     *     
     */
    public void setHosts(Hosts value) {
        this.hosts = value;
    }

    /**
     * Recupera il valore della propriet� connections.
     * 
     * @return
     *     possible object is
     *     {@link Connections }
     *     
     */
    public Connections getConnections() {
        return connections;
    }

    /**
     * Imposta il valore della propriet� connections.
     * 
     * @param value
     *     allowed object is
     *     {@link Connections }
     *     
     */
    public void setConnections(Connections value) {
        this.connections = value;
    }

}

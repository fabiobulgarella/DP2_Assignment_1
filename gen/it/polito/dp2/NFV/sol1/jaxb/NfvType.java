//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.01 alle 03:31:29 AM CET 
//


package it.polito.dp2.NFV.sol1.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per nfvType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="nfvType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catalog" type="{http://www.example.org/nfvInfo}catalogType"/>
 *         &lt;element name="nffgs" type="{http://www.example.org/nfvInfo}nffgsType"/>
 *         &lt;element name="hosts" type="{http://www.example.org/nfvInfo}hostsType"/>
 *         &lt;element name="connections" type="{http://www.example.org/nfvInfo}connectionsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nfvType", propOrder = {
    "catalog",
    "nffgs",
    "hosts",
    "connections"
})
public class NfvType {

    @XmlElement(required = true)
    protected CatalogType catalog;
    @XmlElement(required = true)
    protected NffgsType nffgs;
    @XmlElement(required = true)
    protected HostsType hosts;
    @XmlElement(required = true)
    protected ConnectionsType connections;

    /**
     * Recupera il valore della proprietà catalog.
     * 
     * @return
     *     possible object is
     *     {@link CatalogType }
     *     
     */
    public CatalogType getCatalog() {
        return catalog;
    }

    /**
     * Imposta il valore della proprietà catalog.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogType }
     *     
     */
    public void setCatalog(CatalogType value) {
        this.catalog = value;
    }

    /**
     * Recupera il valore della proprietà nffgs.
     * 
     * @return
     *     possible object is
     *     {@link NffgsType }
     *     
     */
    public NffgsType getNffgs() {
        return nffgs;
    }

    /**
     * Imposta il valore della proprietà nffgs.
     * 
     * @param value
     *     allowed object is
     *     {@link NffgsType }
     *     
     */
    public void setNffgs(NffgsType value) {
        this.nffgs = value;
    }

    /**
     * Recupera il valore della proprietà hosts.
     * 
     * @return
     *     possible object is
     *     {@link HostsType }
     *     
     */
    public HostsType getHosts() {
        return hosts;
    }

    /**
     * Imposta il valore della proprietà hosts.
     * 
     * @param value
     *     allowed object is
     *     {@link HostsType }
     *     
     */
    public void setHosts(HostsType value) {
        this.hosts = value;
    }

    /**
     * Recupera il valore della proprietà connections.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionsType }
     *     
     */
    public ConnectionsType getConnections() {
        return connections;
    }

    /**
     * Imposta il valore della proprietà connections.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionsType }
     *     
     */
    public void setConnections(ConnectionsType value) {
        this.connections = value;
    }

}

//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.28 alle 10:20:38 PM CET 
//


package it.polito.dp2.NFV.sol1.jaxb;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://tempuri.org/nfvInfo}min_throughput"/>
 *         &lt;element ref="{http://tempuri.org/nfvInfo}max_latency"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://tempuri.org/nfvInfo}nameType" />
 *       &lt;attribute name="src_node" use="required" type="{http://tempuri.org/nfvInfo}nameType" />
 *       &lt;attribute name="dst_node" use="required" type="{http://tempuri.org/nfvInfo}nameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "minThroughput",
    "maxLatency"
})
@XmlRootElement(name = "link")
public class Link {

    @XmlElement(name = "min_throughput")
    protected Float minThroughput;
    @XmlElement(name = "max_latency")
    protected BigInteger maxLatency;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "src_node", required = true)
    protected String srcNode;
    @XmlAttribute(name = "dst_node", required = true)
    protected String dstNode;

    /**
     * Recupera il valore della proprietà minThroughput.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinThroughput() {
        return minThroughput;
    }

    /**
     * Imposta il valore della proprietà minThroughput.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinThroughput(Float value) {
        this.minThroughput = value;
    }

    /**
     * Recupera il valore della proprietà maxLatency.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxLatency() {
        return maxLatency;
    }

    /**
     * Imposta il valore della proprietà maxLatency.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxLatency(BigInteger value) {
        this.maxLatency = value;
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

    /**
     * Recupera il valore della proprietà srcNode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrcNode() {
        return srcNode;
    }

    /**
     * Imposta il valore della proprietà srcNode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrcNode(String value) {
        this.srcNode = value;
    }

    /**
     * Recupera il valore della proprietà dstNode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstNode() {
        return dstNode;
    }

    /**
     * Imposta il valore della proprietà dstNode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstNode(String value) {
        this.dstNode = value;
    }

}

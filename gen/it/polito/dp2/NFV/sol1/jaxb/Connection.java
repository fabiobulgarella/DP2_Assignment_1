//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.29 alle 05:40:22 PM CET 
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
 *         &lt;element name="avg_throughput" type="{http://www.example.org/nfvInfo}nonNegativeFloat"/>
 *         &lt;element name="avg_latency" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *       &lt;/sequence>
 *       &lt;attribute name="host1" use="required" type="{http://www.example.org/nfvInfo}nameType" />
 *       &lt;attribute name="host2" use="required" type="{http://www.example.org/nfvInfo}nameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "avgThroughput",
    "avgLatency"
})
@XmlRootElement(name = "connection")
public class Connection {

    @XmlElement(name = "avg_throughput")
    protected float avgThroughput;
    @XmlElement(name = "avg_latency", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger avgLatency;
    @XmlAttribute(name = "host1", required = true)
    protected String host1;
    @XmlAttribute(name = "host2", required = true)
    protected String host2;

    /**
     * Recupera il valore della proprietà avgThroughput.
     * 
     */
    public float getAvgThroughput() {
        return avgThroughput;
    }

    /**
     * Imposta il valore della proprietà avgThroughput.
     * 
     */
    public void setAvgThroughput(float value) {
        this.avgThroughput = value;
    }

    /**
     * Recupera il valore della proprietà avgLatency.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvgLatency() {
        return avgLatency;
    }

    /**
     * Imposta il valore della proprietà avgLatency.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvgLatency(BigInteger value) {
        this.avgLatency = value;
    }

    /**
     * Recupera il valore della proprietà host1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost1() {
        return host1;
    }

    /**
     * Imposta il valore della proprietà host1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost1(String value) {
        this.host1 = value;
    }

    /**
     * Recupera il valore della proprietà host2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost2() {
        return host2;
    }

    /**
     * Imposta il valore della proprietà host2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost2(String value) {
        this.host2 = value;
    }

}

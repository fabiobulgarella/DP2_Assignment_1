//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.30 alle 11:16:52 PM CET 
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
 *       &lt;attribute name="name" use="required" type="{http://www.example.org/nfvInfo}nameType" />
 *       &lt;attribute name="dstNode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minThroughput" type="{http://www.example.org/nfvInfo}nonNegativeFloat" />
 *       &lt;attribute name="maxLatency" type="{http://www.example.org/nfvInfo}nonNegativeInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "link")
public class Link {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "dstNode", required = true)
    protected String dstNode;
    @XmlAttribute(name = "minThroughput")
    protected Float minThroughput;
    @XmlAttribute(name = "maxLatency")
    protected Integer maxLatency;

    /**
     * Recupera il valore della propriet� name.
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
     * Imposta il valore della propriet� name.
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
     * Recupera il valore della propriet� dstNode.
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
     * Imposta il valore della propriet� dstNode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstNode(String value) {
        this.dstNode = value;
    }

    /**
     * Recupera il valore della propriet� minThroughput.
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
     * Imposta il valore della propriet� minThroughput.
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
     * Recupera il valore della propriet� maxLatency.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLatency() {
        return maxLatency;
    }

    /**
     * Imposta il valore della propriet� maxLatency.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLatency(Integer value) {
        this.maxLatency = value;
    }

}

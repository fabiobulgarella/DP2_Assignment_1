//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.01 alle 03:31:29 AM CET 
//


package it.polito.dp2.NFV.sol1.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per hostType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="hostType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nodeRef" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.example.org/nfvInfo}nameType" />
 *       &lt;attribute name="maxVnfs" use="required" type="{http://www.example.org/nfvInfo}nonNegativeInt" />
 *       &lt;attribute name="memory" use="required" type="{http://www.example.org/nfvInfo}nonNegativeInt" />
 *       &lt;attribute name="storage" use="required" type="{http://www.example.org/nfvInfo}nonNegativeInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostType", propOrder = {
    "nodeRef"
})
public class HostType {

    protected List<String> nodeRef;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "maxVnfs", required = true)
    protected int maxVnfs;
    @XmlAttribute(name = "memory", required = true)
    protected int memory;
    @XmlAttribute(name = "storage", required = true)
    protected int storage;

    /**
     * Gets the value of the nodeRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNodeRef() {
        if (nodeRef == null) {
            nodeRef = new ArrayList<String>();
        }
        return this.nodeRef;
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
     * Recupera il valore della proprietà maxVnfs.
     * 
     */
    public int getMaxVnfs() {
        return maxVnfs;
    }

    /**
     * Imposta il valore della proprietà maxVnfs.
     * 
     */
    public void setMaxVnfs(int value) {
        this.maxVnfs = value;
    }

    /**
     * Recupera il valore della proprietà memory.
     * 
     */
    public int getMemory() {
        return memory;
    }

    /**
     * Imposta il valore della proprietà memory.
     * 
     */
    public void setMemory(int value) {
        this.memory = value;
    }

    /**
     * Recupera il valore della proprietà storage.
     * 
     */
    public int getStorage() {
        return storage;
    }

    /**
     * Imposta il valore della proprietà storage.
     * 
     */
    public void setStorage(int value) {
        this.storage = value;
    }

}

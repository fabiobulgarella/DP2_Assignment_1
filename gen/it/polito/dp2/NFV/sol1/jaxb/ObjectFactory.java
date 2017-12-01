//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.12.01 alle 02:40:37 AM CET 
//


package it.polito.dp2.NFV.sol1.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.polito.dp2.NFV.sol1.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Nfv_QNAME = new QName("http://www.example.org/nfvInfo", "nfv");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polito.dp2.NFV.sol1.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NfvType }
     * 
     */
    public NfvType createNfvType() {
        return new NfvType();
    }

    /**
     * Create an instance of {@link CatalogType }
     * 
     */
    public CatalogType createCatalogType() {
        return new CatalogType();
    }

    /**
     * Create an instance of {@link ConnectionsType }
     * 
     */
    public ConnectionsType createConnectionsType() {
        return new ConnectionsType();
    }

    /**
     * Create an instance of {@link NodeType }
     * 
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link NffgType }
     * 
     */
    public NffgType createNffgType() {
        return new NffgType();
    }

    /**
     * Create an instance of {@link ConnectionType }
     * 
     */
    public ConnectionType createConnectionType() {
        return new ConnectionType();
    }

    /**
     * Create an instance of {@link NffgsType }
     * 
     */
    public NffgsType createNffgsType() {
        return new NffgsType();
    }

    /**
     * Create an instance of {@link HostsType }
     * 
     */
    public HostsType createHostsType() {
        return new HostsType();
    }

    /**
     * Create an instance of {@link VnfType }
     * 
     */
    public VnfType createVnfType() {
        return new VnfType();
    }

    /**
     * Create an instance of {@link HostType }
     * 
     */
    public HostType createHostType() {
        return new HostType();
    }

    /**
     * Create an instance of {@link LinkType }
     * 
     */
    public LinkType createLinkType() {
        return new LinkType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NfvType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/nfvInfo", name = "nfv")
    public JAXBElement<NfvType> createNfv(NfvType value) {
        return new JAXBElement<NfvType>(_Nfv_QNAME, NfvType.class, null, value);
    }

}

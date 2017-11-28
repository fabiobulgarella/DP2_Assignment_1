//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2017.11.28 alle 10:20:38 PM CET 
//


package it.polito.dp2.NFV.sol1.jaxb;

import java.math.BigInteger;
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

    private final static QName _Storage_QNAME = new QName("http://tempuri.org/nfvInfo", "storage");
    private final static QName _ReqMemory_QNAME = new QName("http://tempuri.org/nfvInfo", "req_memory");
    private final static QName _ReqStorage_QNAME = new QName("http://tempuri.org/nfvInfo", "req_storage");
    private final static QName _AvgLatency_QNAME = new QName("http://tempuri.org/nfvInfo", "avg_latency");
    private final static QName _Memory_QNAME = new QName("http://tempuri.org/nfvInfo", "memory");
    private final static QName _MaxLatency_QNAME = new QName("http://tempuri.org/nfvInfo", "max_latency");
    private final static QName _AvgThroughput_QNAME = new QName("http://tempuri.org/nfvInfo", "avg_throughput");
    private final static QName _MinThroughput_QNAME = new QName("http://tempuri.org/nfvInfo", "min_throughput");
    private final static QName _MaxVnfs_QNAME = new QName("http://tempuri.org/nfvInfo", "max_vnfs");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polito.dp2.NFV.sol1.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link In }
     * 
     */
    public In createIn() {
        return new In();
    }

    /**
     * Create an instance of {@link Hosts }
     * 
     */
    public Hosts createHosts() {
        return new Hosts();
    }

    /**
     * Create an instance of {@link Host }
     * 
     */
    public Host createHost() {
        return new Host();
    }

    /**
     * Create an instance of {@link Connections }
     * 
     */
    public Connections createConnections() {
        return new Connections();
    }

    /**
     * Create an instance of {@link Connection }
     * 
     */
    public Connection createConnection() {
        return new Connection();
    }

    /**
     * Create an instance of {@link Catalog }
     * 
     */
    public Catalog createCatalog() {
        return new Catalog();
    }

    /**
     * Create an instance of {@link VnfType }
     * 
     */
    public VnfType createVnfType() {
        return new VnfType();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link Nffg }
     * 
     */
    public Nffg createNffg() {
        return new Nffg();
    }

    /**
     * Create an instance of {@link Node }
     * 
     */
    public Node createNode() {
        return new Node();
    }

    /**
     * Create an instance of {@link Nfv }
     * 
     */
    public Nfv createNfv() {
        return new Nfv();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/nfvInfo", name = "storage")
    public JAXBElement<BigInteger> createStorage(BigInteger value) {
        return new JAXBElement<BigInteger>(_Storage_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/nfvInfo", name = "req_memory")
    public JAXBElement<BigInteger> createReqMemory(BigInteger value) {
        return new JAXBElement<BigInteger>(_ReqMemory_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/nfvInfo", name = "req_storage")
    public JAXBElement<BigInteger> createReqStorage(BigInteger value) {
        return new JAXBElement<BigInteger>(_ReqStorage_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/nfvInfo", name = "avg_latency")
    public JAXBElement<BigInteger> createAvgLatency(BigInteger value) {
        return new JAXBElement<BigInteger>(_AvgLatency_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/nfvInfo", name = "memory")
    public JAXBElement<BigInteger> createMemory(BigInteger value) {
        return new JAXBElement<BigInteger>(_Memory_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/nfvInfo", name = "max_latency")
    public JAXBElement<BigInteger> createMaxLatency(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaxLatency_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/nfvInfo", name = "avg_throughput")
    public JAXBElement<Float> createAvgThroughput(Float value) {
        return new JAXBElement<Float>(_AvgThroughput_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/nfvInfo", name = "min_throughput")
    public JAXBElement<Float> createMinThroughput(Float value) {
        return new JAXBElement<Float>(_MinThroughput_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/nfvInfo", name = "max_vnfs")
    public JAXBElement<BigInteger> createMaxVnfs(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaxVnfs_QNAME, BigInteger.class, null, value);
    }

}

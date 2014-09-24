
package com.handson.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.handson.ws package. 
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

    private final static QName _Exception_QNAME = new QName("http://ws.handson.com/", "Exception");
    private final static QName _HandleInterSeptionResponse_QNAME = new QName("http://ws.handson.com/", "handleInterSeptionResponse");
    private final static QName _HandleInterSeption_QNAME = new QName("http://ws.handson.com/", "handleInterSeption");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.handson.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HandleInterSeption }
     * 
     */
    public HandleInterSeption createHandleInterSeption() {
        return new HandleInterSeption();
    }

    /**
     * Create an instance of {@link HandleInterSeptionResponse }
     * 
     */
    public HandleInterSeptionResponse createHandleInterSeptionResponse() {
        return new HandleInterSeptionResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.handson.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleInterSeptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.handson.com/", name = "handleInterSeptionResponse")
    public JAXBElement<HandleInterSeptionResponse> createHandleInterSeptionResponse(HandleInterSeptionResponse value) {
        return new JAXBElement<HandleInterSeptionResponse>(_HandleInterSeptionResponse_QNAME, HandleInterSeptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandleInterSeption }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.handson.com/", name = "handleInterSeption")
    public JAXBElement<HandleInterSeption> createHandleInterSeption(HandleInterSeption value) {
        return new JAXBElement<HandleInterSeption>(_HandleInterSeption_QNAME, HandleInterSeption.class, null, value);
    }

}

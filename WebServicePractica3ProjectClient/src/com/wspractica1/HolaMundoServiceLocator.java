/**
 * HolaMundoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wspractica1;

public class HolaMundoServiceLocator extends org.apache.axis.client.Service implements com.wspractica1.HolaMundoService {

    public HolaMundoServiceLocator() {
    }


    public HolaMundoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HolaMundoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HolaMundo
    private java.lang.String HolaMundo_address = "http://localhost:8080/WebServiceProject/services/HolaMundo";

    public java.lang.String getHolaMundoAddress() {
        return HolaMundo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HolaMundoWSDDServiceName = "HolaMundo";

    public java.lang.String getHolaMundoWSDDServiceName() {
        return HolaMundoWSDDServiceName;
    }

    public void setHolaMundoWSDDServiceName(java.lang.String name) {
        HolaMundoWSDDServiceName = name;
    }

    public com.wspractica1.HolaMundo getHolaMundo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HolaMundo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHolaMundo(endpoint);
    }

    public com.wspractica1.HolaMundo getHolaMundo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.wspractica1.HolaMundoSoapBindingStub _stub = new com.wspractica1.HolaMundoSoapBindingStub(portAddress, this);
            _stub.setPortName(getHolaMundoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHolaMundoEndpointAddress(java.lang.String address) {
        HolaMundo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.wspractica1.HolaMundo.class.isAssignableFrom(serviceEndpointInterface)) {
                com.wspractica1.HolaMundoSoapBindingStub _stub = new com.wspractica1.HolaMundoSoapBindingStub(new java.net.URL(HolaMundo_address), this);
                _stub.setPortName(getHolaMundoWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HolaMundo".equals(inputPortName)) {
            return getHolaMundo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wspractica1.com", "HolaMundoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wspractica1.com", "HolaMundo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HolaMundo".equals(portName)) {
            setHolaMundoEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

package com.example.soap_service.endpoint;

import com.flydubai.hellosoap.HelloSoap;
import com.flydubai.hellosoap.HelloSoapResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class HelloSoapEndpoint {

    private static final String NAMESPACE_URI = "http://www.flydubai.com/HelloSoap";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "HelloSoap")
    @ResponsePayload
    public HelloSoapResponse handleHelloSoapRequest(@RequestPayload HelloSoap request) {
        HelloSoapResponse response = new HelloSoapResponse();
        response.setResponse("Welcome " + request.getClientName());
        return response;
    }
}
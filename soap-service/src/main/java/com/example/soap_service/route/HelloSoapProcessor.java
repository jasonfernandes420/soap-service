package com.example.soap_service.route;


import com.flydubai.hellosoap.HelloSoap;
import com.flydubai.hellosoap.HelloSoapResponse;
import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

@Component
public class HelloSoapProcessor {

    public void process(Exchange exchange) {
        HelloSoap request = exchange.getIn().getBody(HelloSoap.class);
        HelloSoapResponse response = new HelloSoapResponse();
        response.setResponse("Welcome " + request.getClientName());
    }
}
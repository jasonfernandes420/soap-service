package com.example.soap_service.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloSoapCamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("spring-ws:rootqname:{http://www.flydubai.com/HelloSoap}HelloSoap?endpointMapping=#endpointMapping")
                .bean(HelloSoapProcessor.class, "process");
    }
}

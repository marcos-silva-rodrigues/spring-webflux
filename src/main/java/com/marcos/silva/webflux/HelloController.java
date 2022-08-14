package com.marcos.silva.webflux;

import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Publisher<String> sendHello(){
        return Mono.just("Hello World from Spring WebFlux");
    }
}

package com.thoughtworks.springclouddemo081621;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.Message;

import java.util.function.Function;

@SpringBootApplication
public class SpringCloudDemo081621Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemo081621Application.class, args);
    }

    public Function<Message<String>, String> getMessageStringFunction() {
        return input -> input.getPayload().toUpperCase();
    }

}

package com.example.sample;

import com.example.sample.repository.OktaRepo;
import com.example.sample.service.OktaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /**
     * This example controller has endpoints for displaying the user profile info on {code}/{code} and "you have been
     * logged out page" on {code}/post-logout{code}.
     */
//    @Controller
//    static class ExampleController {
//        @Autowired
//        private OktaService service;
//        @GetMapping("/")
//        String home() {
//            return "home";
//        }
//
//        @GetMapping("/profile")
//        @PreAuthorize("hasAuthority('SCOPE_profile')")
//        ModelAndView userDetails(OAuth2AuthenticationToken authentication) {
//            service.addTask(authentication);
//            System.out.print(authentication.getPrincipal().getAttributes());
//            return new ModelAndView("userProfile", Collections.singletonMap("details", authentication.getPrincipal().getAttributes()));
//        }
//    }

//    @RestController
//    static class ExampleRestController {
//
//        @GetMapping("/hello")
//        String sayHello(@AuthenticationPrincipal Jwt jwt) {
//            return String.format("Hello, %s!", jwt.getSubject());
//        }
//    }
}

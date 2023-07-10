package com.example.DBservice.DBservice;

import com.example.DBservice.DBservice.model.Programme;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DBserviceApplicationProgrammeTest {

    @Test
    void contextLoads() {
    }

    /*
    @Autowired
    WebTestClient webTestClient;


    @Test
    void testProgramme() {
        getProgramme();
        addProgramme();
        getProgramme();
    }

    void getProgramme(){

        // Fetch all programmes
        WebTestClient.ListBodySpec<Programme> programmeList =  this.webTestClient
                .get()
                .uri("/programmes")
                .exchange()
                .expectBodyList(Programme.class);

        // Print The List
        System.out.println("Programmes: "+programmeList.returnResult().getResponseBody());
    }

    void addProgramme(){

        Programme programme = new Programme();
        programme.setCourse_name("B.Tech cse");

        // might be failing

        // Fetch all programmes
        WebTestClient.ListBodySpec<Programme> programmeList =  this.webTestClient
                .post()
                .uri("/programmes")
                .body(Mono.just(programme), Programme.class)
                .exchange()
                .expectBodyList(Programme.class);

        // Print The List
        System.out.println("Programmes: "+programmeList.returnResult().getResponseBody());
    }
     */

}

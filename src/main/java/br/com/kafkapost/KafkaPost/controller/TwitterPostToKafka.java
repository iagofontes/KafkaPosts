package br.com.kafkapost.KafkaPost.controller;

import br.com.kafkapost.KafkaPost.model.Tweet;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TwitterPostToKafka {

    TwitterPostToKafka() {

    }

    @PostMapping(value = "/tweet", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public void tweet(@RequestBody Map<String, Object> payload) {
        System.out.println(payload);
        System.out.println(payload.get("post"));
//        return tweet;
    }

}

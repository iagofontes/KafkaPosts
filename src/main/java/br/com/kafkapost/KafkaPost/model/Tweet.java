package br.com.kafkapost.KafkaPost.model;

public class Tweet {

    private String post;

    public Tweet(String post) {
        this.post = post;
    }

    public String getPost() {
        return this.post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}

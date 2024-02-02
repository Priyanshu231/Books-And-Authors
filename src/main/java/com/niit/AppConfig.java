package com.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("publisher")
    public Publisher getPublisherDetails() {
        Publisher publisher = new Publisher(getAuthorDetails());
        publisher.setPublisherId(1);
        publisher.setPublisherName("ABC");
        return publisher;
    }
    @Bean
    public Author getAuthorDetails() {
        return new Author(1,"DEF");
    }
}

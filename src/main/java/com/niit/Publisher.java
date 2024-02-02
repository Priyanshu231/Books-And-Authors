package com.niit;

import org.springframework.beans.factory.annotation.Autowired;

public class Publisher {
    private int publisherId;
    private String publisherName;
    private Author author;
    @Autowired
    public Publisher(Author author) {
        this.author = author;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Publisher [ "+
                "Publisher Id = "+publisherId+
                ", Publisher Name = "+publisherName+
                ", Author = ["+author+
                " ]";
    }
}

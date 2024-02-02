package com.niit;

public class Author {
    private int authorId;
    private String authorName;

    public Author(int authorId, String authoeName) {
        this.authorId = authorId;
        this.authorName = authoeName;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    @Override
    public String toString() {
        return "AuthorId = "+authorId+
                ", Author Name = "+authorName+
                " ]";
    }
}

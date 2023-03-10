package com.github.nibiroo.library_management.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author_id;

    @Column(name = "edition")
    private String edition;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category_id;

    @Column(name = "available")
    private boolean available;

    public Book() {
    }
    public Book(String title, Author author_id, String edition, Category category_id, boolean available) {
        this.title = title;
        this.author_id = author_id;
        this.edition = edition;
        this.category_id = category_id;
        this.available = available;
    }

    public UUID getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor_id() {
        return author_id;
    }
    public void setAuthor_id(Author author_id) {
        this.author_id = author_id;
    }
    public String getEdition() {
        return edition;
    }
    public void setEdition(String edition) {
        this.edition = edition;
    }
    public Category getCategory_id() {
        return category_id;
    }
    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}

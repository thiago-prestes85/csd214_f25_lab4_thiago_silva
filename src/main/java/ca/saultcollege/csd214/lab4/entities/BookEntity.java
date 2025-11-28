package ca.saultcollege.csd214.lab4.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("BOOK")
public class BookEntity extends PublicationEntity {

    @Column(nullable = true) // ok no SINGLE TABLE
    private String author;

    public BookEntity() {}

    public BookEntity(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", price=" + getPrice() +
                ", copies=" + getCopies() +
                ", author='" + author + '\'' +
                '}';
    }
}

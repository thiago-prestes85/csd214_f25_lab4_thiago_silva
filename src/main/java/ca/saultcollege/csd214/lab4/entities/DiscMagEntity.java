package ca.saultcollege.csd214.lab4.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("DISCMAG")
public class DiscMagEntity extends PublicationEntity {

    @Column(nullable = true) // PRECISA ser nullable em SINGLE_TABLE
    private Integer discCount;

    public DiscMagEntity() {}

    public DiscMagEntity(String title, double price, int copies, int discCount) {
        super(title, price, copies);
        this.discCount = discCount;
    }

    public Integer getDiscCount() {
        return discCount;
    }

    public void setDiscCount(Integer discCount) {
        this.discCount = discCount;
    }

    @Override
    public String toString() {
        return "DiscMagEntity{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", price=" + getPrice() +
                ", copies=" + getCopies() +
                ", discCount=" + discCount +
                '}';
    }
}

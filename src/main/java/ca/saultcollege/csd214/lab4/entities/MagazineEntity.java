package ca.saultcollege.csd214.lab4.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("MAGAZINE")
public class MagazineEntity extends PublicationEntity {

    @Column(nullable = true) // must be nullable in SINGLE_TABLE inheritance
    private Integer issueNumber;

    public MagazineEntity() {}

    public MagazineEntity(String title, double price, int copies, Integer issueNumber) {
        super(title, price, copies);
        this.issueNumber = issueNumber;
    }

    public Integer getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "MagazineEntity{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", price=" + getPrice() +
                ", copies=" + getCopies() +
                ", issueNumber=" + issueNumber +
                '}';
    }
}

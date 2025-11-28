package ca.saultcollege.csd214.lab4.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("TICKET")
public class TicketEntity extends PublicationEntity {

    @Column(nullable = true)
    private String eventName;

    public TicketEntity() {}

    public TicketEntity(String title, double price, int copies, String eventName) {
        super(title, price, copies);
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "TicketEntity{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", price=" + getPrice() +
                ", copies=" + getCopies() +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}

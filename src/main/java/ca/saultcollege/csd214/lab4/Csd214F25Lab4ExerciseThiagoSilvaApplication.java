package ca.saultcollege.csd214.lab4;

import ca.saultcollege.csd214.lab4.entities.*;
import ca.saultcollege.csd214.lab4.repositories.*;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Csd214F25Lab4ExerciseThiagoSilvaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Csd214F25Lab4ExerciseThiagoSilvaApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(
            BookEntityRepository bookRepo,
            MagazineEntityRepository magRepo,
            DiscMagEntityRepository discMagRepo,
            TicketEntityRepository ticketRepo
    ) {
        return (args) -> {

            Faker faker = new Faker();

            System.out.println("\n===== CRUD TESTS STARTING =====");

            // -------------------------------------------------------
            // BOOK CRUD
            // -------------------------------------------------------
            System.out.println("\n--- BOOK CRUD ---");

            BookEntity book = new BookEntity(
                    faker.book().title(),
                    faker.number().randomDouble(2, 10, 50),
                    faker.number().numberBetween(1, 200),
                    faker.book().author()
            );

            book = bookRepo.save(book);
            System.out.println("Created Book: " + book);

            book = bookRepo.findById(book.getId()).orElse(null);
            System.out.println("Read Book: " + book);

            System.out.println("All Books: " + bookRepo.findAll());


            // -------------------------------------------------------
            // MAGAZINE CRUD
            // -------------------------------------------------------
            System.out.println("\n--- MAGAZINE CRUD ---");

            MagazineEntity mag = new MagazineEntity(
                    faker.book().title(),
                    faker.number().randomDouble(2, 10, 50),
                    faker.number().numberBetween(1, 100),
                    faker.number().numberBetween(1, 500)
            );

            mag = magRepo.save(mag);
            System.out.println("Created Magazine: " + mag);

            mag = magRepo.findById(mag.getId()).orElse(null);
            System.out.println("Read Magazine: " + mag);

            System.out.println("All Magazines: " + magRepo.findAll());


            // -------------------------------------------------------
            // DISCMAG CRUD
            // -------------------------------------------------------
            System.out.println("\n--- DISCMAG CRUD ---");

            DiscMagEntity disc = new DiscMagEntity(
                    faker.book().title(),
                    faker.number().randomDouble(2, 10, 200),
                    faker.number().numberBetween(1, 50),
                    faker.number().numberBetween(1, 10)
            );

            disc = discMagRepo.save(disc);
            System.out.println("Created DiscMag: " + disc);

            disc = discMagRepo.findById(disc.getId()).orElse(null);
            System.out.println("Read DiscMag: " + disc);

            System.out.println("All DiscMags: " + discMagRepo.findAll());


            // -------------------------------------------------------
            // TICKET CRUD
            // -------------------------------------------------------
            System.out.println("\n--- TICKET CRUD ---");

            TicketEntity ticket = new TicketEntity(
                    faker.book().title(),                         // title
                    faker.number().randomDouble(2, 20, 200),      // price
                    faker.number().numberBetween(1, 200),         // copies
                    faker.company().name() + " Live"              // eventName
            );

// CREATE
            ticket = ticketRepo.save(ticket);
            System.out.println("Created Ticket: " + ticket);

// READ ONE
            TicketEntity readTicket = ticketRepo.findById(ticket.getId()).orElse(null);
            System.out.println("Read Ticket: " + readTicket);

// READ ALL
            System.out.println("All Tickets: " + ticketRepo.findAll());
        };
    }
}

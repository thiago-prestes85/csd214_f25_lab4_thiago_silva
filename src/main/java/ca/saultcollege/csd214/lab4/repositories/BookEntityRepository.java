package ca.saultcollege.csd214.lab4.repositories;

import ca.saultcollege.csd214.lab4.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookEntityRepository extends JpaRepository<BookEntity, Long> {

    // Derived query example
    List<BookEntity> findByAuthor(String author);
}

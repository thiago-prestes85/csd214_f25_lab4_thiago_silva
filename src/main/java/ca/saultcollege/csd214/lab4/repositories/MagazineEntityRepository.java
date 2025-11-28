package ca.saultcollege.csd214.lab4.repositories;

import ca.saultcollege.csd214.lab4.entities.MagazineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazineEntityRepository extends JpaRepository<MagazineEntity, Long> {

}

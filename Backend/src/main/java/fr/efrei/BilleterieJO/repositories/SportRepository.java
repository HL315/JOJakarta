package fr.efrei.BilleterieJO.repositories;

import fr.efrei.BilleterieJO.models.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepository extends JpaRepository<Sport, Long> {
}

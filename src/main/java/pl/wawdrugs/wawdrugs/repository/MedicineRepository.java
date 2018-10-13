package pl.wawdrugs.wawdrugs.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wawdrugs.wawdrugs.models.dao.Medicine;

import java.util.List;
import java.util.Optional;

@Repository
public interface MedicineRepository  extends JpaRepository<Medicine, Integer> {
    @Override
    List<Medicine> findAll();

}

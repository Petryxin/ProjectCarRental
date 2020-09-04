package by.grickevich.models.interfaces;


import by.grickevich.models.Logbook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogbookRepository extends JpaRepository<Logbook,Integer> {
}

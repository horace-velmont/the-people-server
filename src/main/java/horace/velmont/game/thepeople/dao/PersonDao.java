package horace.velmont.game.thepeople.dao;

import horace.velmont.game.thepeople.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {

}

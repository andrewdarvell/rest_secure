package secure;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by darvell on 07.04.15.
 */
public interface PersonRepository extends CrudRepository<Person, Long>{
    List<Person> findByLogin(String login);
}

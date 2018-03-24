package repositories;

import model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * AuthorRepository
 *
 * @author Draman
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}

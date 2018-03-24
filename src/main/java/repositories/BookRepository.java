package repositories;

import model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * BookRepository
 *
 * @author Draman
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}

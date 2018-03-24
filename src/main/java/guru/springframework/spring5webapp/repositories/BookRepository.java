package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * BookRepository
 *
 * @author Draman
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}

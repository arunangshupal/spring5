package local.arunangshu.spring5Webapp.repositories;

import local.arunangshu.spring5Webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

package local.arunangshu.spring5Webapp.repositories;

import local.arunangshu.spring5Webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

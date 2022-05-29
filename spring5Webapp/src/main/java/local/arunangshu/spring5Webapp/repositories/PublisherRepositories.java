package local.arunangshu.spring5Webapp.repositories;

import local.arunangshu.spring5Webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepositories extends CrudRepository<Publisher, Long> {
}

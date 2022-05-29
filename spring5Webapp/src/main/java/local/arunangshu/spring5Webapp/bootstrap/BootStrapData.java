package local.arunangshu.spring5Webapp.bootstrap;

import local.arunangshu.spring5Webapp.domain.Author;
import local.arunangshu.spring5Webapp.domain.Book;
import local.arunangshu.spring5Webapp.domain.Publisher;
import local.arunangshu.spring5Webapp.repositories.AuthorRepository;
import local.arunangshu.spring5Webapp.repositories.BookRepository;
import local.arunangshu.spring5Webapp.repositories.PublisherRepositories;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@AllArgsConstructor
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepositories publisherRepositories;

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = publisherRepositories.save(Publisher.builder()
                .name("Ananda Pub")
                .addressLine1("Kolkata 1")
                .city("Kolkata")
                .state("WB")
                .zip("700001")
                .build());


        Author  aru = Author.builder()
                .firstName("Arunangshu")
                .lastName("Pal")
                .build();
        Book book = Book.builder()
                .title("Yeh hain meri kahani")
                .isbn("123456")
                .authors(Set.of(aru))
                .publisher(publisher)
                .build();

        authorRepository.save(aru);
        bookRepository.save(book);

        System.out.println("Books added " + bookRepository.count());
        System.out.println("Authors added " + authorRepository.count());


    }
}

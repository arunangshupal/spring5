package local.arunangshu.spring5Webapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Builder
@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String addressLine1;
    private String city;
    private String state;
    private String zip;

    @OneToMany
    private Set<Book> books;
}

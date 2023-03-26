package tn.ey.teammanagement.entities;

import javax.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private String email;
    private String pwd;
    private String fName;
    private String lName;
    @Enumerated(EnumType.STRING)
    private Role role ;

    @ManyToMany
    private List<Project> projectsUser ;

    @OneToMany(
            mappedBy = "User",
            cascade = CascadeType.ALL
    )
    private List<Project> projects;
}

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
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private int id;
    private String title;
    private String description;

    @ManyToMany(mappedBy = "projectsUser")
    private List<User> users;

    @OneToMany(
            mappedBy = "project",
            cascade = CascadeType.PERSIST
    )
    private List<Sprint> sprints;

}

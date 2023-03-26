package tn.ey.teammanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.ey.teammanagement.entities.Project;
import tn.ey.teammanagement.entities.Role;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    List<Project> findAllBySprintsStartDate(LocalDate startDate);
    List<Project> findAllByUsersRoleAndUsersName(Role role, String fName, String lName);
}

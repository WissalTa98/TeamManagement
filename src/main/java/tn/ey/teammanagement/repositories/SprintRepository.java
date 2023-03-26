package tn.ey.teammanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.ey.teammanagement.entities.Sprint;

public interface SprintRepository extends JpaRepository<Sprint, Integer> {
}

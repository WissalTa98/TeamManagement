package tn.ey.teammanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.ey.teammanagement.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
        User findByFnameAndLname(String fName, String lName);
}

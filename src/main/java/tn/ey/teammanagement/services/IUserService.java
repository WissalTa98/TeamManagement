package tn.ey.teammanagement.services;

import org.springframework.stereotype.Service;
import tn.ey.teammanagement.entities.User;

@Service
public interface IUserService {
    User addUser(User user);
}

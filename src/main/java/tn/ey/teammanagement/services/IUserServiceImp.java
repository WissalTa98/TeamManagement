package tn.ey.teammanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.ey.teammanagement.entities.User;
import tn.ey.teammanagement.repositories.UserRepository;

public class IUserServiceImp  implements IUserService{

    @Autowired
    private UserRepository userRepo;
    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }
}

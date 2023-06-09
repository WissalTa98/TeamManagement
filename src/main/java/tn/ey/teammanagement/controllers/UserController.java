package tn.ey.teammanagement.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.ey.teammanagement.entities.User;
import tn.ey.teammanagement.services.IUserService;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {
    private final IUserService iUserService;
    @PostMapping()
    public User addUser(@RequestBody User user){
        return iUserService.addUser(user);
    }
}

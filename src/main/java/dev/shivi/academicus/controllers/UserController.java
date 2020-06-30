package dev.shivi.academicus.controllers;

import dev.shivi.academicus.models.User;
import dev.shivi.academicus.services.UserServices;
import dev.shivi.academicus.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constants.USERS_END_POINT)
public class UserController {

    private UserServices userServices;

    @Autowired
    UserController(UserServices userServices)
    {
        this.userServices = userServices;
    }

    @PostMapping
    public User createUser(@RequestBody User user)
    {
        return userServices.createUser(user);
    }
}

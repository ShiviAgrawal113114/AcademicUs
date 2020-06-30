package dev.shivi.academicus.controllers;

import dev.shivi.academicus.dto.ResponseDto;
import dev.shivi.academicus.models.User;
import dev.shivi.academicus.services.UserServices;
import dev.shivi.academicus.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(Constants.USERS_END_POINT)
public class UserController {

    private UserServices userServices;

    @Autowired
    UserController(UserServices userServices)
    {
        this.userServices = userServices;
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user)
    {
        return userServices.createUser(user);
    }

    @GetMapping("/{id}")
    public ResponseDto<User> getUserById(@PathVariable(name = "id") UUID id)
    {
        User serviceResponse =  userServices.getUserById(id);

        if(serviceResponse == null)
            return new ResponseDto(HttpStatus.NOT_FOUND, serviceResponse);

        return new ResponseDto(HttpStatus.FOUND, serviceResponse);
    }
}

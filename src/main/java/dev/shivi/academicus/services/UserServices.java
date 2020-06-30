package dev.shivi.academicus.services;

import dev.shivi.academicus.models.User;
import dev.shivi.academicus.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServices {

    private UserRepository userRepository;

    @Autowired
    UserServices(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }


    public User createUser(User user)
    {
        return userRepository.createUser(user);
    }
}

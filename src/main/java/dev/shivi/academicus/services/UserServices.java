package dev.shivi.academicus.services;

import dev.shivi.academicus.models.User;
import dev.shivi.academicus.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServices {

    private UserRepository userRepository;

    @Value("${userRepository.type}")
    private String userRepoType;

    @Autowired
    UserServices(@Qualifier("postgres") UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }


    public User createUser(User user)
    {
        return userRepository.createUser(user);
    }

    public User getUserById(UUID uuid)
    {
        Optional<User> foundUser = userRepository.getUserById(uuid);
        if(foundUser.isEmpty())
            return null;
        return foundUser.get();
    }
}

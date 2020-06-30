package dev.shivi.academicus.repositories;


import dev.shivi.academicus.models.User;
import dev.shivi.academicus.utils.Constants;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    private List<User>  userDatabase = new ArrayList<>();

    @Override
    public User createUser(User user)
    {
        //User createdUser = new User("shivi", Constants.Gender.FEMALE);
        User createdUser = new User(user.getName(), user.getGender());
        userDatabase.add(createdUser);
        return createdUser;
    }
}

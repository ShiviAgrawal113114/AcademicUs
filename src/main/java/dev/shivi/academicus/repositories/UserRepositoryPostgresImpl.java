package dev.shivi.academicus.repositories;


import dev.shivi.academicus.models.User;
import dev.shivi.academicus.utils.Constants;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UserRepositoryPostgresImpl implements UserRepository{

    private List<User>  userDatabase = new ArrayList<>();

    @Override
    public User createUser(User user)
    {
        //User createdUser = new User("shivi", Constants.Gender.FEMALE);
        User createdUser = new User(user.getName(), user.getGender());
        userDatabase.add(createdUser);
        return createdUser;
    }

    @Override
    public Optional<User> getUserById(UUID uuid) {
//        for( User u : userDatabase )
//        {
//            if(u.getUuid() == uuid)
//                return u;
//        }
//        return null;

        Optional<User> foundUser = userDatabase
                .stream()
                .filter(
                        user -> user.getUuid().equals(uuid)
                ).findFirst();
        return foundUser;
    }
}

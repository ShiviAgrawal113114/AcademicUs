package dev.shivi.academicus.repositories;

import dev.shivi.academicus.models.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    User createUser(User user);

    Optional<User> getUserById(UUID uuid);

}

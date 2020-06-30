package dev.shivi.academicus.repositories;

import dev.shivi.academicus.models.User;
import org.springframework.stereotype.Repository;

public interface UserRepository {

    User createUser(User user);

}

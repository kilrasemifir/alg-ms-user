package fr.kira.foramation.alg.msuser.user;

import java.util.List;

public interface UserService {
    User create(User user);

    List<User> findAll();

    User update(User entity);

    User findById(String id);

    void deleteById(String id);
}

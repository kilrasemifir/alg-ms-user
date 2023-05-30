package fr.kira.foramation.alg.msuser.users.impl;

import fr.kira.foramation.alg.msuser.users.CreateUserUseCase;
import fr.kira.foramation.alg.msuser.users.User;
import fr.kira.foramation.alg.msuser.users.UserCreationException;

public class UserServiceImpl implements CreateUserUseCase {


    @Override
    public User create(User user) {
        throw new UserCreationException("User need valid email");
    }
}

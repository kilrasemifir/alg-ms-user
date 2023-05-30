package fr.kira.foramation.alg.msuser.users;

import fr.kira.foramation.alg.msuser.users.impl.UserServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateUserUseCaseTest {

    @Test
    @DisplayName("User need valid email")
    public void userNeedValidEmail() {
        // Given
        User user = new User();
        user.setEmail("test");
        user.setName("test");
        // When
        CreateUserUseCase createUserUseCase = new UserServiceImpl();
        // Then
        assertThrows(UserCreationException.class, () -> createUserUseCase.create(user));
    }

}
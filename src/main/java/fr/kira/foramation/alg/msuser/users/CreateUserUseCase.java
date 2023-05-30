package fr.kira.foramation.alg.msuser.users;

/**
 * This interface is used to represent a user service.
 * Perform CRUD operations on users.
 */
public interface CreateUserUseCase {
    /**
     * This method is used to create a user.
     * throws UserCreationException if the user is not valid.
     * @param user The user to create.
     * @return The created user.
     */
    public User create(User user);
}

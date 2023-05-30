package fr.kira.foramation.alg.msuser.user;

import fr.kira.foramation.alg.msuser.exceptions.BadRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserMongoRepository userMongoRepository;

    public UserServiceImpl(UserMongoRepository userMongoRepository) {
        this.userMongoRepository = userMongoRepository;
    }

    @Override
    public User create(User user) {
        if (user.getId() != null) {
            log.warn("User id must be null");
            throw new BadRequestException("User id must be null");
        }
        user.setCreationDate(LocalDateTime.now());
        user.setLastUpdateDate(LocalDateTime.now());
        return userMongoRepository.insert(user);
    }

    @Override
    public List<User> findAll() {
        return userMongoRepository.findAll();
    }

    @Override
    public User update(User entity) {
        if (entity.getId() == null) {
            log.warn("User id must not be null");
            throw new BadRequestException("User id must not be null");
        }
        return userMongoRepository.save(entity);
    }

    @Override
    public User findById(String id) {
        return userMongoRepository.findById(id).orElseThrow(() -> {
            log.warn("User not found. id={}", id);
            return new BadRequestException("User not found.id="+id);
        });
    }

    @Override
    public void deleteById(String id) {
        if (id == null) {
            log.warn("User id must not be null");
            throw new BadRequestException("User id must not be null");
        }
        if (!userMongoRepository.existsById(id)) {
            log.warn("User not found. id={}", id);
            throw new BadRequestException("User not found.id="+id);
        }
        userMongoRepository.deleteById(id);
    }
}

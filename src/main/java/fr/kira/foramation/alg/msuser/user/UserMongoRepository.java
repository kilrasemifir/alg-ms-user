package fr.kira.foramation.alg.msuser.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<User, String> {
}

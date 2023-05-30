package fr.kira.foramation.alg.msuser.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Document
@NoArgsConstructor
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdateDate;
}

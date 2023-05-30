package fr.kira.foramation.alg.msuser.teams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    private String id;
    private String name;
    private String description;
    @DBRef
    private Set<String> users = new HashSet<>();
}

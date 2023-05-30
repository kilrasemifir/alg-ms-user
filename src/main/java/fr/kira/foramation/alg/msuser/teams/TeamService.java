package fr.kira.foramation.alg.msuser.teams;

import java.util.List;

public interface TeamService {
    Team insert(Team entity);

    List<Team> findAll();

    Team save(Team entity);

    Team findById(String id);

    void deleteById(String id);
}

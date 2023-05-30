package fr.kira.foramation.alg.msuser.teams;

import fr.kira.foramation.alg.msuser.exceptions.BadRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public Team insert(Team entity) {
        if (entity.getId() != null) {
            log.warn("Team id must be null");
            throw new BadRequestException("Team id must be null");
        }
        return teamRepository.insert(entity);
    }

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    @Override
    public Team save(Team entity) {
        if (entity.getId() == null) {
            log.warn("Team id must not be null");
            throw new BadRequestException("Team id must not be null");
        }
        return teamRepository.save(entity);
    }

    @Override
    public Team findById(String id) {
        return teamRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Team not found. id={}", id);
                    return new BadRequestException("Team not found.id="+id);
                });
    }

    @Override
    public void deleteById(String id) {
        if (id == null) {
            log.warn("Team id must not be null");
            throw new BadRequestException("Team id must not be null");
        }
        if (!teamRepository.existsById(id)) {
            log.warn("Team not found. id={}", id);
            throw new BadRequestException("Team not found.id="+id);
        }
        teamRepository.deleteById(id);
    }
}

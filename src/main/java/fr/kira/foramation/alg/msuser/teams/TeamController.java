package fr.kira.foramation.alg.msuser.teams;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
@CrossOrigin("*")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping
    public Team insert(@RequestBody Team entity) {
        return teamService.insert(entity);
    }

    @GetMapping
    public List<Team> findAll() {
        return teamService.findAll();
    }

    @PutMapping
    public Team save(@RequestBody Team entity) {
        return teamService.save(entity);
    }

    @GetMapping("/{id}")
    public Team findById(@PathVariable String id) {
        return teamService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        teamService.deleteById(id);
    }
}

package tn.ey.teammanagement.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.ey.teammanagement.entities.Sprint;
import tn.ey.teammanagement.services.ISprintService;

@RestController
@RequestMapping("sprint")
@RequiredArgsConstructor
public class SprintController {
    private final ISprintService iSpintService;
    @PostMapping("/{idProj}")
    public void addSprintToProject(@RequestBody Sprint sprint, @PathVariable int idProj){
        iSpintService.addSprintToProject(sprint,idProj);
    }
}

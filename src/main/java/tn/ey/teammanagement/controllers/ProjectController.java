package tn.ey.teammanagement.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.ey.teammanagement.entities.Project;
import tn.ey.teammanagement.services.IProjectService;

import java.util.List;

@RestController
@RequestMapping("project")
@RequiredArgsConstructor
public class ProjectController {
    private final IProjectService iProjectService;
    @PostMapping("/add")
    public Project addProject (@RequestBody Project project){
        return iProjectService.addProject(project);
    }

    @PostMapping("/{projectId}/{userId}")
    public void assignProjectToUser (@PathVariable int projectId, @PathVariable int userId){
        iProjectService.assignProjectToUser(projectId,userId);
    }

    @PostMapping("/{projectId}")
    public void assignProjectToClient(@PathVariable int projectId, @RequestBody String firstName, @RequestBody String lastName){
        iProjectService.assignProjectToClient(projectId,firstName,lastName);
    }

    @GetMapping("/allCurrentProject")
    public List<Project> getAllCurrentProject(){
        return iProjectService.getAllCurrentProject();
    }

    @GetMapping("/ProjectByScrumMaster")
    public List<Project> getProjectsByScrumMaster(String fName, String lName){
        return iProjectService.getProjectsByScrumMaster(fName,lName);
    }
}

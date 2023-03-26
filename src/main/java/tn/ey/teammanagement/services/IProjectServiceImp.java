package tn.ey.teammanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import tn.ey.teammanagement.entities.Project;
import tn.ey.teammanagement.entities.Role;
import tn.ey.teammanagement.repositories.ProjectRepository;
import tn.ey.teammanagement.repositories.UserRepository;

import java.time.LocalDate;
import java.util.List;

public class IProjectServiceImp implements IProjectService {

    @Autowired
    private ProjectRepository projectRepo;
    @Autowired
    private UserRepository userRepo;
    @Override
    @Transactional
    public Project addProject(Project project) {
        if(project.getSprints()!=null) {
            projectRepo.saveAndFlush(project);
            project.getSprints().forEach(sprint -> {
                sprint.setProject(project);
            });
        }
        return project;
    }

    @Override
    public void assignProjectToUser(int projectId, int userId) {

    }

    @Override
    public void assignProjectToClient(int projectId, String firstName, String lastName) {

    }

    @Override
    public List<Project> getAllCurrentProject() {
        return projectRepo.findAllBySprintsStartDate(LocalDate.now());
    }

    @Override
    public List<Project> getProjectsByScrumMaster(String fName, String lName) {
        return projectRepo.findAllByUsersRoleAndUsersName(Role.SCRUM_MASTER,fName,lName);
    }
}

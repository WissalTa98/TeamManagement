package tn.ey.teammanagement.services;

import org.springframework.stereotype.Service;
import tn.ey.teammanagement.entities.Project;

import java.util.List;

@Service
public interface IProjectService {
    public Project addProject (Project project);

    public void assignProjectToUser (int projectId, int userId);

    public void assignProjectToClient(int projectId, String firstName, String lastName);

    public List<Project> getAllCurrentProject();

    public List<Project> getProjectsByScrumMaster(String fName, String lName);
}

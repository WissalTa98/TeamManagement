package tn.ey.teammanagement.services;

import org.springframework.stereotype.Service;
import tn.ey.teammanagement.entities.Sprint;

@Service
public interface ISprintService {
    public void addSprintToProject(Sprint sprint, int idProj);

    public void getNbreSprintByCurrentProject();
}

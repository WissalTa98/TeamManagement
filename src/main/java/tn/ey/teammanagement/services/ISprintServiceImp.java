package tn.ey.teammanagement.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import tn.ey.teammanagement.entities.Project;
import tn.ey.teammanagement.entities.Sprint;
import tn.ey.teammanagement.repositories.ProjectRepository;

@Slf4j
public class ISprintServiceImp implements ISprintService{
    @Autowired
    private ProjectRepository projectRepo;
    @Override
    public void addSprintToProject(Sprint sprint, int idProj) {

    }

    @Override
    @Scheduled(cron = "*/30 * * * * *")
    public void getNbreSprintByCurrentProject() {
        for ( Project p : projectRepo.findAll()) {
            log.info("Projet: "+ p.getTitle()+" : "+p.getSprints().size()+" sprints");
        }

    }
}

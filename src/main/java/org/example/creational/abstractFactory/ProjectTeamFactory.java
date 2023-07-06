package org.example.creational.abstractFactory;


public interface ProjectTeamFactory {
    Developer1 getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();

}

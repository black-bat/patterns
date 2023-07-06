package org.example.creational.abstractFactory.firstTeam;


import org.example.creational.abstractFactory.Developer1;
import org.example.creational.abstractFactory.ProjectManager;
import org.example.creational.abstractFactory.ProjectTeamFactory;
import org.example.creational.abstractFactory.Tester;
import org.example.creational.factory.Developer;

public class FirstTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer1 getDeveloper() {
        return  new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new JavaTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new FirstProjectManager();
    }
}

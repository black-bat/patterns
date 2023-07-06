package org.example.creational.abstractFactory.secondTeam;


import org.example.creational.abstractFactory.Developer1;
import org.example.creational.abstractFactory.ProjectManager;
import org.example.creational.abstractFactory.ProjectTeamFactory;
import org.example.creational.abstractFactory.Tester;
import org.example.creational.abstractFactory.firstTeam.JavaDeveloper;

public class SecondTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer1 getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new PhpTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new SecondProjectManager();
    }
}

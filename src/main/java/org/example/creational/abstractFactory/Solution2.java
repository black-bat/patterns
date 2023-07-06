package org.example.creational.abstractFactory;


import org.example.creational.abstractFactory.secondTeam.SecondTeamFactory;

public class Solution2 {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new SecondTeamFactory();
        Developer1 developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        System.out.println("команда начинает работать:");
        developer.writeCode();
        tester.testCode();
        projectManager.manageTeam();
    }
}

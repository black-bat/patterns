package org.example.creational.abstractFactory.firstTeam;

import org.example.creational.abstractFactory.ProjectManager;

public class FirstProjectManager implements ProjectManager {
    @Override
    public void manageTeam() {
        System.out.println("управляю командой java");
    }
}

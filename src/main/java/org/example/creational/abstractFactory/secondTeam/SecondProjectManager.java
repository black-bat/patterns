package org.example.creational.abstractFactory.secondTeam;

import org.example.creational.abstractFactory.ProjectManager;

public class SecondProjectManager implements ProjectManager {
    @Override
    public void manageTeam() {
        System.out.println("управляю второй командой");
    }
}

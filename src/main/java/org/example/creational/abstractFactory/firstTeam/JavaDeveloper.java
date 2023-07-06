package org.example.creational.abstractFactory.firstTeam;

import org.example.creational.abstractFactory.Developer1;
import org.example.creational.factory.Developer;

public class JavaDeveloper implements Developer1 {
    @Override
    public void writeCode() {
        System.out.println("пишу код на java");
    }
}

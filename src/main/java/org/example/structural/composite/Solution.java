package org.example.structural.composite;

public class Solution {
    public static void main(String[] args) {
        Team team = new Team();
        Developer javaDeveloper1 = new JavaDeveloper();
        Developer javaDeveloper2 = new JavaDeveloper();
        Developer phpDeveloper1 = new PhpDeveloper();
        team.addDeveloper(javaDeveloper1);
        team.addDeveloper(javaDeveloper2);
        team.addDeveloper(phpDeveloper1);
        team.createProject();
    }
}

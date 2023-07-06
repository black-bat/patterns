package org.example.behavioral.memento;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitRepository gitRepository = new GitRepository();
        System.out.println("создали проект версии 1.0");
        project.setVersionAndDate("version 1.0");
        System.out.println(project);
        System.out.println("сoхраняем проект");
        gitRepository.setSave(project.save());
        System.out.println("обновляем проект до версии 1.1");
        Thread.sleep(3000);
        project.setVersionAndDate("version 1.1");
        System.out.println(project);
        System.out.println("возвращаемся к первой версии");
        project.load(gitRepository.getSave());
        System.out.println(project);
    }
}

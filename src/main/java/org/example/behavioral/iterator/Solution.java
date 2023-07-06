package org.example.behavioral.iterator;

public class Solution {
    public static void main(String[] args) {
        String[] skills = {"Java", "SQL", "HTML", "JS"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Ktoto", skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("developer: " + javaDeveloper.getName());
        System.out.println("skills: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString().concat(" "));
        }
    }
}

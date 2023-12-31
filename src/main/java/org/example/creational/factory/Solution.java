package org.example.creational.factory;

public class Solution {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("pHp");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " такого специалиста не знаем");
        }
    }
}

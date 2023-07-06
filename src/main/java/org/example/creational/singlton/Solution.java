package org.example.creational.singlton;

public class Solution {
    public static void main(String[] args) {
        //проверяем, что независимо от количество вызовов, мы имеем дело с одним и тем же ProgramLogger
        System.out.println(A.getProgram().toString());
        System.out.println(A.getProgram().toString());
        System.out.println(A.getProgram().toString());
    }
}

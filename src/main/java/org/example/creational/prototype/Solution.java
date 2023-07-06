package org.example.creational.prototype;

public class Solution {
    public static void main(String[] args) {
        Employees employees = new Employees("Петр", "Петров", "petrov@mail.ru", 18);
        System.out.println(employees);
        Employees copyEmployees1 = (Employees) employees.copyObject();
        System.out.println(copyEmployees1);
        EmployeesFactory employeesFactory = new EmployeesFactory(employees);
        Employees copyEmployees2 = employeesFactory.copyEmployees();
        System.out.println(copyEmployees2);
    }
}

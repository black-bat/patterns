package org.example.creational.prototype;

public class EmployeesFactory {
    Employees employees;

    public EmployeesFactory(Employees employees) {
        this.employees = employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    Employees copyEmployees(){
        return (Employees) employees.copyObject();
    }
}

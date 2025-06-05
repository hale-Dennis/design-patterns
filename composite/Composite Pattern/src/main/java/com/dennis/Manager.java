package com.moadams;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    String name;
    double salary;
    List<Employee> teamMembers = new ArrayList<Employee>();

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void addTeamMember(Employee employee) {
        teamMembers.add(employee);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager: " + name + ",Salary: " + salary);
        for(Employee employee : teamMembers){
            employee.displayDetails();
        }
    }
}

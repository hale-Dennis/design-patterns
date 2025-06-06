package com.moadams;

public class Main {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Sudais", 300.42);
        Employee developer2 = new Developer("Baaki", 400.42);
        Employee developer3 = new Developer("Mike", 300.42);
        Manager manager1 = new Manager("Linus", 500.42);
        Manager manager2 = new Manager("Sam", 500.42);

        manager1.addTeamMember(developer1);
        manager1.addTeamMember(developer2);
        manager1.addTeamMember(manager2);
        manager2.addTeamMember(developer3);

        developer1.displayDetails();
        manager1.displayDetails();

    }
}
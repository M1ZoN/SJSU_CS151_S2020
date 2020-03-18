package com.company;

public class Student {
    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private double gpa = 0;
    private String major = "";
    private String department = "";
    private Course cs151;
    private Course cs146;
    private Course ams001a;
    private Course math142;

    Student(String firstName, String lastName, String major, String department, int age, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.department = department;
        this.age = age;
        this.gpa = gpa;
        this.ams001a = new Course("American Cultures to 1877", "American culture examined through political, literary, artistic, economic and social development.", "U.S. History", "10:30-11:45", "Tuesday");
        this.cs151 = new Course("Object-Oriented Design", "Design of classes and interfaces. Object-oriented design methodologies and notations. Design patterns.", "CS", "10:30-11:45", "Monday");
        this.cs146 = new Course("Data Structures and Algorithms", "Implementations of advanced tree structures, priority queues, heaps, directed and undirected graphs.", "CS", "12:00-13:15", "Wednesday");
        this.math142 = new Course("Introduction to Combinatorics", "Sets, permutations, combinations, probability, mathematical induction, counting techniques, generating functions, partitions, recurrence relations, inclusion-exclusion.", "Math", "12:00-13:15", "Thursday");
    }

    //setters
    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMath142(Course math142) {
        this.math142 = math142;
    }

    public void setCs151(Course cs151) {
        this.cs151 = cs151;
    }

    public void setCs146(Course cs146) {
        this.cs146 = cs146;
    }

    public void setAms001a(Course ams001a) {
        this.ams001a = ams001a;
    }

    //getters
    public double getGpa() {
        return gpa;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public Course getMath142() {
        return math142;
    }

    public Course getCs151() {
        return cs151;
    }

    public Course getCs146() {
        return cs146;
    }

    public Course getAms001a() {
        return ams001a;
    }

    public void printInfo() {
        System.out.println("Student's first name: " + firstName);
        System.out.println("Student's last name: " + lastName);
        System.out.println("Student's major: " + major);
        System.out.println("Student's department: " + department);
        System.out.println("Student's gpa: " + gpa);
        System.out.println("Student's age: " + age);
        System.out.println("/*****************\\");
        ams001a.printInfo();
        System.out.println("\\*****************/");
        System.out.println("/*****************\\");
        cs146.printInfo();
        System.out.println("\\*****************/");
        System.out.println("/*****************\\");
        cs151.printInfo();
        System.out.println("\\*****************/");
        System.out.println("/*****************\\");
        math142.printInfo();
        System.out.println("\\*****************/");
    }
}

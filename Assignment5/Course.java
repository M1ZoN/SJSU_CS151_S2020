package com.company;

public class Course {
    private String name = "";
    private String description = "";
    private String department = "";
    private String time = "";
    private String weekday = "";

    Course(String name, String description, String department, String time, String weekday) {
        this.description = description;
        this.department = department;
        this.name = name;
        this.time = time;
        this.weekday = weekday;
    }

    //getters
    public String getWeekday() {
        return weekday;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDepartment() {
        return department;
    }

    //setters

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void printInfo() {
        System.out.println("Course name: " + name);
        System.out.println("Course description: " + description);
        System.out.println("Course department: " + department);
        System.out.println("Course time: " + time);
        System.out.println("Course weekday: " + weekday);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private double gpa = 0;
    private String major = "";
    private String department = "";
    private ArrayList<Course> courses = new ArrayList<>();

    Student(String firstName, String lastName, String major, String department, int age, double gpa, ArrayList<Course>courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.department = department;
        this.age = age;
        this.gpa = gpa;
        this.courses = courses;
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

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
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

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    // Sorts by given number, such that 1: by name of the course
    //                                  2: by description of the course
    //                                  3: by department of the course
    //                                  4: by time of the course
    //                                  5: by weekday of the course
    public void sortCourses(boolean ascending, int attribute) {
        switch (attribute) {
            case 1:
                Collections.sort(courses, new NameComparator(ascending));
                break;
            case 2:
                Collections.sort(courses, new DescriptionComparator(ascending));
                break;
            case 3:
                Collections.sort(courses, new DepartmentComparator(ascending));
                break;
            case 4:
                Collections.sort(courses, new TimeComparator(ascending));
                break;
            case 5:
                Collections.sort(courses, new WeekdayComparator(ascending));
                break;
            default:
                System.out.println("Error! Unknown attribute to sort.");
                break;
        }
    }
}

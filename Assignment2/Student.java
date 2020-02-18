package com.company;

import java.util.Vector;

public class Student {

    Student(String firstName, String lastName, int age, double gpa, String major, String department) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }

    //----------Setters----------------
    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    //---------------------------------


    //----------Getters----------------
    public double getGpa() {
        return gpa;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }
    //-------------------------------------


    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private String major = "";
    private double gpa = 0;
    private String department = "";

    public class Course{
        Course(Vector<Vector<String>>schedule){
            this.schedule = schedule;
        }

        public Vector<Vector<String>> getSchedule() {
            return schedule;
        }

        public void setSchedule(Vector<Vector<String>> schedule) {
            this.schedule = schedule;
        }

        void printSchedule() {
            for (int i = 0; i < schedule.size(); i++) {
                System.out.print(days[i] + ":");
                if (!schedule.elementAt(i).isEmpty())
                    for (int j = 0; j < schedule.elementAt(i).size(); j++) {
                        System.out.print(" " + schedule.elementAt(i).elementAt(j));
                    }
                else
                    System.out.print(" NO CLASSES");
                System.out.println();
            }
        }
        private Vector<Vector<String>>schedule = new Vector<>();
        private String days[] = {"Monday","Tuesday", "Wednesday", "Thursday", "Friday"};

    }
}

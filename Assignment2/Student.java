package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        Course(Map<String, String[]>schedule){
            this.schedule = schedule;
        }

        public Map<String, String[]> getSchedule() {
            return schedule;
        }

        public void setSchedule(Map<String, String[]> schedule) {
            this.schedule = schedule;
        }

        void printSchedule() {
            Set< Map.Entry< String,String[]> > set = this.schedule.entrySet();

            for (Map.Entry< String,String[]> oneDay : set)
            {
                System.out.print(oneDay.getKey()+":");
                for (int i = 0; i < oneDay.getValue().length; i++)
                    System.out.print(" " + oneDay.getValue()[i]);
                System.out.println();
            }
        }

        private Map<String, String[]>schedule = new HashMap<>();
    }
}

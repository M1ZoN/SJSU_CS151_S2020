package com.company;

import java.util.Comparator;

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

class NameComparator implements Comparator {

    private boolean ascending = true;

    public NameComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Course s1 = (Course)o1;
        Course s2 = (Course)o2;
        if (ascending)
            return (s1.getName().compareTo(s2.getName()));
        else
            return (s2.getName().compareTo(s1.getName()));
    }
}
class DescriptionComparator implements Comparator {

    private boolean ascending = true;

    public DescriptionComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Course s1 = (Course)o1;
        Course s2 = (Course)o2;
        if (ascending)
            return (s1.getDescription().compareTo(s2.getDescription()));
        else
            return (s2.getDescription().compareTo(s1.getDescription()));
    }
}
class DepartmentComparator implements Comparator {

    private boolean ascending = true;

    public DepartmentComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Course s1 = (Course)o1;
        Course s2 = (Course)o2;
        if (ascending)
            return (s1.getDepartment().compareTo(s2.getDepartment()));
        else
            return (s2.getDepartment().compareTo(s1.getDepartment()));
    }
}
class TimeComparator implements Comparator {

    private boolean ascending = true;

    public TimeComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Course s1 = (Course)o1;
        Course s2 = (Course)o2;
        if (ascending)
            return (s1.getTime().compareTo(s2.getTime()));
        else
            return (s2.getTime().compareTo(s1.getTime()));
    }
}
class WeekdayComparator implements Comparator {

    private boolean ascending = true;

    public WeekdayComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Course s1 = (Course)o1;
        Course s2 = (Course)o2;
        if (ascending)
            return (s1.getWeekday().compareTo(s2.getWeekday()));
        else
            return (s2.getWeekday().compareTo(s1.getWeekday()));
    }
}

package com.company;

import java.util.Vector;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science department");
        Vector<Vector<String>>schedule = new Vector<>();
        Vector<String>daySchedule = new Vector<>();

        daySchedule.add("CS151");
        daySchedule.add("CS100W");
        schedule.add(daySchedule);
        daySchedule.clear();

        daySchedule.add("CS49J");
        schedule.add(daySchedule);
        daySchedule.clear();


        daySchedule.add("MATH142");
        daySchedule.add("CS123A");
        schedule.add(daySchedule);
        daySchedule.clear();

        daySchedule.add("KIN2A");
        daySchedule.add("PHIL10");
        schedule.add(daySchedule);
        daySchedule.clear();

        Student.Course course = student.new Course(schedule);
        course.printSchedule();
    }
}

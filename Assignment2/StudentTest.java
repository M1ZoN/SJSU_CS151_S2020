package com.company;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science department");

        Map<String, String[]>schedule = new HashMap<>();

        String mon[] = {"CS151", "CS100W"};
        String tue[] = {"CS49J"};
        String wed[] = {"MATH142", "CS123A"};
        String thu[] = {"KIN2A", "PHIL10"};

        schedule.put("Monday", mon);
        schedule.put("Tuesday", tue);
        schedule.put("Wednesday", wed);
        schedule.put("Thursday", thu);



        Student.Course course = student.new Course(schedule);
        course.printSchedule();
    }
}

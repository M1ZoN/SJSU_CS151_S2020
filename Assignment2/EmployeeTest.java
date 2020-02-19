package com.company;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee joe = new Employee("Joe", "Smith", 27, 1332, "San Jose", 'm', 70, 1234, "01.01.2017", 1, 30, 60);
        Employee lisa = new Employee("Lisa", "Gray", 24, 1223, "San Francisco", 'f', 56, 765, "01.03.2019", 3, 2, 110000);
        Employee timothy = new Employee("Timothy", "Briggs", 20, 223, "San Mateo", 'm', 77, 228, "05.03.2018", 3, 4, 80000);
        Employee george = new Employee("George", "Wallace", 38, 98776, "Fremont", 'm', 86, 7654, "01.10.2009", 2, 25, 20);
        Employee amy = new Employee("Amy", "Student", 18, 778668, "Santa Cruz", 'f', 54, 8799, "01.10.2020", 1, 45, 45);

        joe.introduce();
        System.out.println();
        System.out.println("************************************************************************");
        System.out.println();

        lisa.introduce();
        System.out.println();
        System.out.println("************************************************************************");
        System.out.println();

        timothy.introduce();
        System.out.println();
        System.out.println("************************************************************************");
        System.out.println();

        george.introduce();
        System.out.println();
        System.out.println("************************************************************************");
        System.out.println();

        amy.introduce();
    }
}

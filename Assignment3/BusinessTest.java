package com.company;

public class BusinessTest {

    public static void main(String[] args) {
        Contractor jimmy = new Contractor("Jimmy", "Choo", 26, 564646363,  new Address("San Fernando", 123, 94543, "CA"), 123, "needed", 30.5);
        Contractor mike = new Contractor("Mike", "Bron", 28, 564616363,  new Address("3rd", 223, 95553, "CA"), 2353, "not needed", 35.5);
        jimmy.setVisibleSSN(true);
        jimmy.introduce();
        System.out.println();
        mike.introduce();
        System.out.println();
        System.out.println("******************************************************");
        System.out.println();

        Customer jordan = new Customer("Jordan", "Buttler", 20, 87678976,  new Address("San Antonio", 987, 94643, "CA"), 2345,"Deposit" );
        Customer maya = new Customer("Maya", "Beans", 19, 134567873,  new Address("5th", 778, 91345, "MI"), 2234,"Credit" );
        jordan.setVisibleSSN(true);
        jordan.introduce();
        System.out.println();
        maya.introduce();
        System.out.println();
        System.out.println("******************************************************");
        System.out.println();

        Executive jin = new Executive("Jin", "Khan", 30, 987656787, new Address("Mowry", 12, 87784, "AR") , 556, "needed", 120000, 10000);
        Executive cj = new Executive("CJ", "Needham", 37, 2345654, new Address("Golightly", 132, 77667, "SD") , 887, "needed", 100000, 15000);
        jin.introduce();
        System.out.println();
        cj.introduce();
        System.out.println();
        System.out.println("******************************************************");
        System.out.println();


        FullTimeHourlyEmployee stan = new FullTimeHourlyEmployee("Stan", "Blaschikowski", 23, 12345677, new Address("Dortmund", 17, 86766, "MS") , 23, "needed", 30);
        FullTimeHourlyEmployee alison = new FullTimeHourlyEmployee("Alison", "Becker", 22, 234545654, new Address("Grand Vista", 1332, 77633, "CA") , 8827, "not needed", 26.5);
        stan.setVisibleSSN(true);
        stan.introduce();
        System.out.println();
        alison.introduce();
        System.out.println();
        System.out.println("******************************************************");
        System.out.println();


        FullTimeSalaryEmployee beck = new FullTimeSalaryEmployee("Beck", "Biker", 27, 23456354, new Address("University", 112, 94667, "CA") , 817, "not needed", 100000);
        FullTimeSalaryEmployee james =  new FullTimeSalaryEmployee("James", "Will", 39, 231234554, new Address("Auto mall", 9832, 95667, "SD") , 833, "needed", 150000);
        beck.introduce();
        System.out.println();
        james.introduce();
        System.out.println();
        System.out.println("******************************************************");
        System.out.println();

        PartTimeHourlyEmployee leonard = new PartTimeHourlyEmployee("Leonard", "Da Vinci", 18, 1245654, new Address("Italy", 1142, 177667, "CL") , 81487, "needed", 40);
        PartTimeHourlyEmployee luka = new PartTimeHourlyEmployee("Luka", "Doncic", 21, 1575654, new Address("Mavericks", 77, 17667, "DA") , 814387, "not needed", 39.9);
        leonard.introduce();
        System.out.println();
        luka.introduce();
    }
}

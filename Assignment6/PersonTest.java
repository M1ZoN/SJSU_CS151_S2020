package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class PersonTest {
    public static void main(String[] args) {
        Person Joe = new Person("Joe", "Smith", 40);
        Person Amy = new Person("Amy", "Gold", 32);
        Person Tony = new Person("Tony", "Stork", 21);
        Person Sean = new Person("Sean", "Irish", 24);
        Person Tina = new Person("Tina", "Brock", 28);
        Person Lenny = new Person("Lenny", "Hep", 18);

        ArrayList<Person> people = new ArrayList<>();
        people.add(Joe);
        people.add(Amy);
        people.add(Tony);
        people.add(Sean);
        people.add(Tina);
        people.add(Lenny);

        ArrayList<Person> ageA = (ArrayList<Person>) people.clone();
        ArrayList<Person> ageD = (ArrayList<Person>) people.clone();
        ArrayList<Person> firstA = (ArrayList<Person>) people.clone();
        ArrayList<Person> firstD = (ArrayList<Person>) people.clone();
        ArrayList<Person> lastA = (ArrayList<Person>) people.clone();
        ArrayList<Person> lastD = (ArrayList<Person>) people.clone();

        firstA.sort(new FirstNameComparator(true));
        firstD.sort(new FirstNameComparator(false));
        ageA.sort(new AgeComparator(true));
        ageD.sort(new AgeComparator(false));
        lastA.sort(new LastNameComparator(true));
        lastD.sort(new LastNameComparator(false));
        System.out.println("Sorted by First Name (Ascending):");
        display(firstA);
        System.out.println("|********************************************************************|");
        System.out.println("Sorted by First Name (Descending):");
        display(firstD);
        System.out.println("|********************************************************************|");
        System.out.println("Sorted by Age (Ascending):");
        display(ageA);
        System.out.println("|********************************************************************|");
        System.out.println("Sorted by Age (Descending):");
        display(ageD);
        System.out.println("|********************************************************************|");
        System.out.println("Sorted by Last Name (Ascending):");
        display(lastA);
        System.out.println("|********************************************************************|");
        System.out.println("Sorted by Last Name (Descending):");
        display(lastD);
    }

    private static void display(ArrayList<Person> firstA) {
        for (int i = 0; i < firstA.size(); i++) {
            System.out.println(firstA.get(i).getFirstName() + " " + firstA.get(i).getLastName() + ", " + firstA.get(i).getAge());
        }
    }


}

class FirstNameComparator implements Comparator {

    private boolean ascending = true;

    public FirstNameComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Person s1 = (Person)o1;
        Person s2 = (Person)o2;
        if (ascending)
            return (s1.getFirstName().compareTo(s2.getFirstName()));
        else
            return (s2.getFirstName().compareTo(s1.getFirstName()));
    }
}

class LastNameComparator implements Comparator {

    private boolean ascending = true;

    public LastNameComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Person s1 = (Person)o1;
        Person s2 = (Person)o2;
        if (ascending)
            return (s1.getLastName().length() - s2.getLastName().length());
        else
            return (s2.getLastName().length() - s1.getLastName().length());
    }
}

class AgeComparator implements Comparator {

    private boolean ascending = true;

    public AgeComparator(boolean ascending) {
        this.ascending = ascending;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Person s1 = (Person)o1;
        Person s2 = (Person)o2;
        if (ascending)
            return (s1.getAge() - s2.getAge());
        else
            return (s2.getAge() - s1.getAge());
    }
}
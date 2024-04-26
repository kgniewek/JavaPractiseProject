package com.company;

import Clasess.CharactersHelper;
import Clasess.Employee;
import Clasess.EmployeeComparator;

import java.util.*;

public class Main {
public static void zadaniePierwsze(){
    Scanner input = new Scanner(System.in);
    List<String> list = new ArrayList<>();
    for (int i = 0; i < 6; i++) {
        System.out.print("Podaj tytul gry: ");
        list.add(input.nextLine());
    }
    System.out.print("Podaj tytul do sprawdzenia: ");
    if (list.contains(input.next())){
        System.out.println("Podany tytul nalezy do listy ulubionych gier");
    } else  System.out.println("Podany tytul nie nalezy do listy ulubionych gier");
    list.sort(Collections.reverseOrder());
    for (String lista : list) {
        System.out.println("Tytul: "+lista);
    }
}
public static void zadanieDrugie(){
    CharactersHelper ch = new CharactersHelper();
    ch.printStringInfo("kajaK");
}
public static void zadnieTrzecie(){
    Employee pracownikJeden = new Employee("Jakub", "Kaktus", "Student");
    Employee pracownikDrugi = new Employee("Marcin", "Żądło", "Student");
    Employee pracownikTrzeci = new Employee("Jacek", "Placek", "Frontend developer");
    Employee pracownikCzwarty = new Employee("Patryk", "Jaki", "Firefighter");
    Employee pracownikPiaty = new Employee("Dagmara", "Podkowa", "Policeman");
    ArrayList<Employee> list = new ArrayList<>(List.of(pracownikJeden, pracownikDrugi, pracownikTrzeci, pracownikCzwarty, pracownikPiaty));
    list.sort(new EmployeeComparator());
    for (Employee x : list) {
        System.out.println(x.getName()+" "+x.getSurname()+", "+x.getJob());
    }

}
    public static void main(String[] args) {
       // zadaniePierwsze();
       // zadanieDrugie();
        zadnieTrzecie();
}
}

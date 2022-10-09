package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        Person[] vect = new Person[10];

        System.out.println("1) Add Person: ");
        System.out.println("2) Delete Person: ");
        System.out.println("3) Find Person: ");
        System.out.println("4) Show All Registered People: ");
        System.out.println("5) Exit: ");
        System.out.print("Enter Option: ");
        int option = key.nextInt();
        System.out.println();

        while (option != 5) {

            if (option == 1) {
                key.nextLine();
                System.out.println("Add Person: ");
                System.out.print("Enter the name: ");
                String name = key.nextLine();
                System.out.print("Enter age: ");
                int age = key.nextInt();
                System.out.print("Enter height: ");
                double height = key.nextDouble();

                Person person = new Person(name, age, height);

                for (int i = 0; i < vect.length; i++) {
                    if (vect[i] == null) {
                        vect[i] = person;
                        System.out.println();
                        System.out.println("Added Successfully");
                        break;
                    }
                }
            } else if (option == 2) {

                System.out.print("Enter code to delete: ");
                int n = key.nextInt();
                vect[n - 1] = null;
                System.out.println("Deleted Successfully");
            } else if (option == 3) {

                System.out.print("Enter code to find: ");
                int n = key.nextInt();
                System.out.println(vect[n-1]);
            } else if (option == 4) {

                System.out.println("All the registers: ");
                for (int i = 0; i < vect.length; i++) {
                    if (vect[i] != null) {
                        System.out.println(i + 1 + ": " + vect[i]);
                    }
                }

            }
            System.out.println();
            System.out.println("1) Add Person: ");
            System.out.println("2) Delete Person: ");
            System.out.println("3) Find Person: ");
            System.out.println("4) Show All Registered People: ");
            System.out.println("5) Exit: ");
            System.out.print("Enter Option: ");
            option = key.nextInt();
            System.out.println();

        }
    }
}



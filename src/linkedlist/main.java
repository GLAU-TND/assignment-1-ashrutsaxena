package linkedlist;

import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        linkedlist1 linkedlist1 = new linkedlist1();
        Tasks tasks = new Tasks();
        System.out.println("Welcome to Ashrut's Contact List app");
        System.out.println("Press 1 to add new contact");
        System.out.println("Press 2 to view all contact");
        System.out.println("Press 3 to search for a contact");
        System.out.println("Press 4 to delete a contact");
        System.out.println("Press 5 to exit a program");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            tasks.addContact(linkedlist1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 2) {
            tasks.viewContact(linkedlist1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 3) {
            tasks.searchContact(linkedlist1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 4) {
            tasks.deleteContact(linkedlist1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice == 5) {
            System.out.println("App terminate");
        }

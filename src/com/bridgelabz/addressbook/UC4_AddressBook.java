package com.bridgelabz.addressbook;
import java.util.Scanner;

public class UC4_AddressBook extends UC2_AddressBook{
    static Scanner s = new Scanner(System.in);
    public void deleteData() {
        int i;
        System.out.println("\nEnter first name to delete : ");
        String name = s.next();
        for(i = 0 ; i < contactBook.size() ; i++) {
            if(contactBook.get(i).getFirstName().equals(name)) {
                contactBook.removeAll(contactBook);
                System.out.println("deleted");
            }
            else
                System.out.println("not deleted");
        }
    }

    public static void main(String[] args) {
        UC3_AddressBook a = new UC3_AddressBook();
        UC4_AddressBook b = new UC4_AddressBook();
        a.readData();
        a.DisplayContacts();
        a.editData();
        b.DisplayContacts();
        b.deleteData();
    }
}


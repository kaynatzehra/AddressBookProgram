package com.bridgelabz.addressbook;
import java.util.Scanner;

    public class UC3_AddressBook extends UC2_AddressBook {
        static Scanner s = new Scanner(System.in);
        public void editData() {
            int i,ans;
            System.out.println("\nEnter first name to edit :- ");
            String name = s.next();
            for(i = 0 ; i < contactBook.size() ; i++) {
                if(contactBook.get(i).getFirstName().equals(name)) {
                    do {
                        System.out.print("\nSelect option to edit----\n1.First_name \n2.Last_name \n3.Address \n4.City \n5.State \n6.Zip_code \n7.Phone_number \n8.Email :- ");
                        int ch = s.nextInt();
                        switch(ch) {
                            case 1:
                                System.out.print("Enter new first name :- ");
                                contactBook.get(i).setFirstName(s.next());
                                System.out.println("First name is updated.");
                                break;
                            case 2:
                                System.out.print("Enter new last name :- ");
                                contactBook.get(i).setLastName(s.next());
                                System.out.println("Last name is updated.");
                                break;
                            case 3:
                                System.out.print("Enter new address :- ");
                                contactBook.get(i).setAddress(s.next());
                                System.out.println("Address is updated.");
                                break;
                            case 4:
                                System.out.print("Enter new city :- ");
                                contactBook.get(i).setCity(s.next());
                                System.out.println("City is updated.");
                                break;
                            case 5:
                                System.out.print("Enter new state :- ");
                                contactBook.get(i).setState(s.next());
                                System.out.println("State is updated.");
                                break;
                            case 6:
                                System.out.print("Enter new zip code :- ");
                                contactBook.get(i).setZip(s.nextInt());
                                System.out.println("Zip code is updated.");
                                break;
                            case 7:
                                System.out.print("Enter new phone number :- ");
                                contactBook.get(i).setPhoneNo(s.nextLong());
                                System.out.println("Phone number is updated.");
                                break;
                            case 8:
                                System.out.print("Enter new email :- ");
                                contactBook.get(i).setEmail(s.next());
                                System.out.println("Email is updated.");
                                break;
                        }
                        System.out.println("Enter 1 if you want to continue");
                        ans = s.nextInt();
                    }while(ans == 1);
                }
                else
                    System.out.println("Please enter the correct first name");
            }

        }
        public static void main(String[] args) {
            UC3_AddressBook a = new UC3_AddressBook();
            a.readData();
            a.DisplayContacts();
            a.editData();
            a.DisplayContacts();


        }
    }

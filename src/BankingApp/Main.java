package BankingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in); 
    static int Lastaccid = 0;
    private static ArrayList<Account> accounts;

    public static void main(String[] args) {

        // Initialize account list
    	accounts = new ArrayList<>();
    	scanner = new Scanner(System.in);
        Database database = new Database();
        accounts = database.getAccounts();
        Lastaccid = accounts.size(); 
        // Menu loop
            System.out.println("\nWelcome to bank management system");
            System.out.println("1. Create new account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    new CreateAccount(scanner, Lastaccid, accounts, database);
                    break;
                case 2:
                    new Login(scanner, accounts, database);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
    }
}

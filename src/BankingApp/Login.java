package BankingApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

	public Login(Scanner scanner, ArrayList<Account> accounts, Database database) {
        System.out.println("Enter account id:");
        int id = scanner.nextInt();
        System.out.println("Enter passcode:");
        int passcode = scanner.nextInt();
        Account account = new Account();
        boolean exist = false;
        for (Account acc : accounts) {
            if (acc.getAccid() == id && acc.getPasscode() == passcode) {
                exist = true;
                account = acc;
  
            }
        }
        if (exist) {
            new Menu(scanner, account, database, accounts);
        } else {
            System.out.println("Account doesn't exist or incorrect passcode.");
        }
	}
}

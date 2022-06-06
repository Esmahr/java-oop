package AccountEx;

import AccountEx.Account;

import java.util.*;
public class AccountTest {
    public  static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Account account1 = new Account("Esma",50);
        Account account2 = new Account("Leyla",60);

        System.out.printf("%s balance : $%.2f%n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance : $%.2f%n", account2.getName(),account2.getBalance());
/*

        Scanner input = new Scanner(System.in);
        System.out.print("Enter new name: ");
        String name1 = input.nextLine();
        account1.setName(name1);
        System.out.printf("Second name is : %s%n%n", account1.getName());
*/

       /* System.out.print("Enter name: ");
        String theName = in.nextLine();
        AccountEx.Account myAccount = new AccountEx.Account(theName);
        System.out.printf("Innitial name is : %s%n%n", myAccount.getName());*/
    }
}

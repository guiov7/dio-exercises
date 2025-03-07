import java.util.Scanner;

import entities.BankAccount;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account;
        
        System.out.println("Please,\nEnter your ACCOUNT:");
        int acc = sc.nextInt();
        System.out.println("Inform the account AGENCY:");
        int agc = sc.nextInt();
        System.out.println("Insert the account name OWNER:");
        sc.nextLine();
        String owner = sc.nextLine();
        account = new BankAccount(acc, agc, owner, 0.0);
        System.out.printf("----------- // -----------\nACCOUNT INFO:\nacc number: %d\nagency: %d\nowner: %s\nactual amount: %.2f",
        account.getAccNum(),account.getAgency(),account.getOwner(),account.getAmount());
        sc.close();
    }
}
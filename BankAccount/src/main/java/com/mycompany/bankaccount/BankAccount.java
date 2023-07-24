/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

import java.util.Locale;
import java.util.Scanner;
import util.Account;

/**
 *
 * @author debora
 */
public class BankAccount {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account acc;
        
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there a initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        
        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            acc = new Account(accountNumber, name, initialDeposit);
        }else {
            acc = new Account(accountNumber, name);
        }
        
        
        System.out.print("");
        System.out.println("Account data:");
        System.out.println(acc);
        
        System.out.print("");
        System.out.print("Enter a deposit vvalues: ");
        double deposit = sc.nextDouble();
        acc.deposit(deposit);
        
        System.out.println("UPDATED: ");
        System.out.println(acc);

        System.out.print("");
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        acc.withdraw(withdraw);
        
        
        System.out.println("UPDATED: ");
        System.out.println(acc);

        sc.close();
    }
}

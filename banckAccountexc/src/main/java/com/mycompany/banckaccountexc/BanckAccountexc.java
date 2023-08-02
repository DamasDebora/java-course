/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banckaccountexc;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;

/**
 *
 * @author debora
 */
public class BanckAccountexc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Account data: ");
        System.out.print("Number: ");
        int accountNumber = sc.nextInt();
        
        System.out.print("Holder name: ");
        sc.nextLine();
        String holder = sc.nextLine();
        
        System.out.print("Balance:  ");
        double balance = sc.nextDouble();
        
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        
        Account account = new Account(accountNumber, holder, balance, withdrawLimit);
        
        System.out.println("");
        System.out.println("inform the amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
        
        System.out.printf("New balance: %.2f%n ", account.getBalance());
        sc.close();
    } 
}

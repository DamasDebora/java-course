/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author debora
 */
public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int account, String name, double initialDeposit) {
        this.accountNumber = account;
        this.name = name;
        deposit(initialDeposit);
    }

    public Account(int account, String name) {
        this.accountNumber = account;
        this.name = name;
        this.balance = balance;

    }

    public int getAccount() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }       
    
    public void deposit(double amount){
        balance += amount;
        
    }
    
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }
    
    public String toString(){
       return  "Account: " 
               + accountNumber 
               + ", Holder: " 
               + name 
               + ", Balance: " 
               + String.format("%.2f", balance);
    }
}

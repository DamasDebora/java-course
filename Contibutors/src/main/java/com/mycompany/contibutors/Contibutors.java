/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contibutors;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author debora
 */
public class Contibutors {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<TaxPayer> taxPayers = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int q = sc.nextInt();
        
        for(int i = 1; i <= q; i++){
            System.out.println("Tax payer #" + i);
            System.out.print("Individual or company?(i/c) ");
            char c = sc.next().charAt(0);
            
            System.out.print("Name: ");
            String name = sc.next();
            
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            
            if(c == 'i'){
                System.out.print("Healt expenditures: ");
                Double healtExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, anualIncome, healtExpenditures));
            } else if ( c == 'c'){
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        
        System.out.println("");
        System.out.println("TAXES PAID: ");
        for(TaxPayer taxPayer : taxPayers){
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
        }
        
        double sum = 0.0;
        for(TaxPayer taxPayer : taxPayers){
            sum += taxPayer.tax();
        }
        System.out.println("Total: " + String.format("%.2f", sum));
        sc.close();
    }
}

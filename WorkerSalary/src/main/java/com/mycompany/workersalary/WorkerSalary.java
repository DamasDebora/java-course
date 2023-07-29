/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.workersalary;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author debora
 */
public class WorkerSalary {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Enter departments name: ");
        String departmentName = sc.nextLine();
        
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();
        
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
     
        System.out.println("How many contracts to this worker?");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n ; i++){
            System.out.println("Enter contract #" + i + "data: ");
            System.out.print("Date (DD/MM/YYYY): ");   
            Date contractDate = sdf.parse(sc.next());
            
            System.out.print("Value per hour: ");
            double valuePerHous = sc.nextDouble();
            
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            
            HourContract contract = new HourContract(contractDate, valuePerHous, hours);
            worker.addContract(contract);
        }
        
        System.out.println("");
        System.out.println("Enter month nd year to calculate income (MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
        sc.close();
    }
}

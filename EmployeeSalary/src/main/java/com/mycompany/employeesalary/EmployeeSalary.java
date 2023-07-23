/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeesalary;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author debora
 */
public class EmployeeSalary {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        
        
        System.out.println("Emplyee data: ");
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        
        System.out.print("Salary: ");
        employee.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        
        System.out.println("");
        System.out.println("Employee: "+ employee);
        System.out.println("");
        System.out.println("increase salaray in: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        
        System.out.println("");
        System.out.println("Updated: " + employee);
        sc.close();
        
    }
}

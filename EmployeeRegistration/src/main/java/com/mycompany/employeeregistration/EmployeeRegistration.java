/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeregistration;

import entities.Employee;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author debora
 */
public class EmployeeRegistration {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Employee> employees = new LinkedList<>();
        
        System.out.println("How many employees will be registered? ");
        int quant = sc.nextInt();
        
        for(int i = 0; i < quant; i += 1){
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            
            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }
                
        sc.close();
    }
}

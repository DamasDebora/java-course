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
            while(hasId(employees, id)){
                System.out.println("Id already taken! Try another one");
                id = sc.nextInt();
            }
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            
            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }
        
        System.out.println("Enter the employee id that will have salary increase: ");
        int idToIncrease = sc.nextInt();
        //Integer index = position(employees, idToIncrease);
        
        Employee emp = employees.stream().filter(x -> x.getId() == idToIncrease).findFirst().orElse(null);

        if(emp == null){
            System.out.println("Id not found");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }
        
        System.out.println("");
        System.out.println("Employee list");
        for(Employee employee : employees){
            System.out.println(employee);
        }
                 
        sc.close();
    }
    
    public static Integer position(List<Employee> employees, int id){
        for(int i =0; i < employees.size(); i += 1){
            if(employees.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
    
     public static boolean hasId(List<Employee> employees, int id){
        Employee employee = employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}

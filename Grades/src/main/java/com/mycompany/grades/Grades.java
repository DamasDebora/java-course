/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grades;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author debora
 */
public class Grades {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();
        
        System.out.println("Student name: ");
        student.name = sc.nextLine();
        
        System.out.println("Student grades: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        
        if(student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("\"MISSING %.2f POINTS%n", student.missingPoints());
        
        } else {
            System.out.println("PASS");
        }
        sc.close();
           
    }
}

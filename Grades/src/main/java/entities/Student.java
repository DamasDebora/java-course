/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author debora
 */
public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    
    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }
    
    public double missingPoints(){
        if(finalGrade() < 60.0){
            return 60 - finalGrade();
        } else {
            return 0.0;
        }
    }
}

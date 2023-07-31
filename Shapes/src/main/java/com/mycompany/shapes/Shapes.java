/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shapes;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author debora
 */
public class Shapes {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Shape> shapes = new ArrayList<>();
        
        System.out.print("Enter the number of sghpes: ");
        int q = sc.nextInt();
        
        for(int i = 1; i <= q; i ++){
            System.out.println("Shape #" + i + " data: ");
            System.out.print("Rectangle or circle? (r/c) ");
            char type = sc.next().charAt(0);
            
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            
            if(type == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                
                System.out.print("Heigth: ");
                double heigth = sc.nextDouble();
                
                shapes.add(new Rectangle(color, width, heigth));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            }
        }
        
        System.out.println("");
        System.out.println("SHAPE AREAS: ");
        for(Shape shape : shapes){
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }
}

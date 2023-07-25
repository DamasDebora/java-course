/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hostel;

import entities.Rent;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author debora
 */
public class Hostel {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        Rent[] rooms = new Rent[10];
        
        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();
         
        for(int i = 1; i <= n; i += 1){
            System.out.println(""); //line break
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            
            System.out.print("Email: ");
            String email = sc.next();
            
            System.out.print("Rroom: ");
            int room = sc.nextInt();

            rooms[room] = new Rent(name, email);
        }
        
        System.out.println(""); //line break
        System.out.println("Busy rooms: ");
        for(int i =0; i < 10; i ++){
            if(rooms[i] != null){
                System.out.println(i + ": " +rooms[i]);
            }
        }
        
        sc.close();           
    }
}

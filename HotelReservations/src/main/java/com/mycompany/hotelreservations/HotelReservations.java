/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotelreservations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Reservation;
import model.exceptions.DomainException;

/**
 *
 * @author debora
 */
public class HotelReservations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
            System.out.print("Room number: ");
            int room = sc.nextInt();

            System.out.println("Check-in (dd/mm/yyyy): ");
            Date checkIn = sdf.parse(sc.next());

            System.out.println("Check-out (dd/mm/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(room, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("");
            System.out.println("Enter date to update");

            System.out.print("Check-in (dd/mm/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.print("Check-out (dd/mm/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDate(checkIn, checkOut);
            System.out.println(reservation);
            
        } 
        catch (ParseException e){
            System.out.println("Invalid date format");
        } 
        catch(DomainException e){
            System.out.println("error in reservation: " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected error");
        }
        sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carrent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxServices;
import model.services.RentalServices;

/**
 *
 * @author debora
 */
public class CarRent {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.println("Dados do aluguel: ");
        System.out.print("Carro: ");
        String carModel = sc.nextLine();
        
        System.out.print("Retirada (dd/mm/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        
        System.out.print("Retorno (dd/mm/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
        
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
        
        System.out.print("value per hour: ");
        double pricePerHour = sc.nextDouble();
        
        System.out.print("value per day: ");
        double pricePerDay = sc.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay, new BrazilTaxServices());
        rentalServices.process(cr);
        
        System.out.println("Fatura: ");
        System.out.print("Basic payment: "+ cr.getInvoice().getBasicPayment());
        System.out.print("tax: "+ cr.getInvoice().getTax());
        System.out.print("total: "+ cr.getInvoice().totalPayment());

        
        sc.close();
         
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.services;

import java.time.Duration;
import model.entities.CarRental;
import model.entities.Invoice;

/**
 *
 * @author debora
 */
public class RentalServices {
    
    private Double pricePerHor;
    private Double pricePerDay;
    private TaxService taxService;

    public RentalServices(Double pricePerHor, Double pricePerDay, TaxService taxService) {
        this.pricePerHor = pricePerHor;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }
    
    public void process(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        
        double basicPayment;
        if(hours <= 12.0){
            basicPayment = pricePerHor * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }
        
        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}

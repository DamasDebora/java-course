/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

/**
 *
 * @author debora
 */
public class Invoice {
    
    private Double basicPayment;
    private Double tax;

    public Invoice() {
    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    
  public Double totalPayment(){
      return getBasicPayment() + getTax();
  }  
}

//Retirada (dd/mm/yyyy hh:mm): 25/02/2025 10:30
//Retorno (dd/mm/yyyy hh:mm): 27/02/2025 11:40
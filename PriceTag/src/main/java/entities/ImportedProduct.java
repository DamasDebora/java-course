/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author debora
 */
public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    public Double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override 
    public String priceTag(){
        return getName() 
                + " $ "
                + String.format("%.2f", totalPrice())
                + "(Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")" ;             
    }
    
}

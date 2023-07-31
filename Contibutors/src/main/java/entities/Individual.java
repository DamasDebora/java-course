/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author debora
 */
public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual( String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    } 

    @Override
    public Double tax() {
        double basicTax;
        if(getAnualIncome() <20000.0){
            basicTax = getAnualIncome() * 0.15;
        } else {
            basicTax = getAnualIncome() * 0.25;
        }
        basicTax -= getHealthExpenditures() * 0.5;
        
        if(basicTax < 0.0){
            basicTax = 0.0;
        } 
        return basicTax;
    }


}

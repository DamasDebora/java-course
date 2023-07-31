/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author debora
 */
public class Company extends TaxPayer {
    
    private Integer numberOfEmployees;

    public Company() {
    }

    public Company( String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }    
      
    @Override
    public Double tax() {
        if(numberOfEmployees > 10){
           return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }
    
}

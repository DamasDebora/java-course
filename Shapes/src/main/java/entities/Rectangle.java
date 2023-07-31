/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import entities.enums.Color;

/**
 *
 * @author debora
 */
public class Rectangle extends Shape{
    private Double width;   
    private Double height; 

    public Rectangle() {
        super();
    }

    public Rectangle(Double height, Double width, Color color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
    
    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    

    @Override
    public double area() {
        return width * height;
    }
    
}

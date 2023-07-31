/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pricetag;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author debora
 */
public class PriceTag {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Product> products = new ArrayList<>();
        
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            System.out.println("Product #" + i);
            System.out.print("Commom, used or imported (c/i/u)? ");
            char type = sc.next().charAt(0);
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Price: ");
            double price = sc.nextDouble();
            
            if(type == 'c'){
                products.add(new Product(name, price));
            } else if (type == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble(); 
                products.add(new ImportedProduct(name, price, customsFee));
            } else {
                System.out.print("Manufacture date (DD/MM/YYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name, price, date));
            }           
        }
        
        System.out.println("");
        System.out.println("Price Tags:");
        for(Product product : products){
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.program;

import java.util.Scanner;

/**
 *
 * @author debora
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qnt = sc.nextInt();
        
        int[][] matriz = new int[qnt][qnt];
        
        for(int i = 0; i < qnt; i++){
            for(int j = 0; j < qnt; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Main diagonal: ");
        for(int i = 0; i < qnt; i++){
            System.out.print(matriz[i][i]);
        }
        
        System.out.println("");
        int countNegativeNumbers = 0; 
        for(int i= 0; i < qnt; i ++){
            for(int j = 0; j < qnt; j++){
                if(matriz[i][j] < 0){
                    countNegativeNumbers ++;
                }
            }
        }
        System.out.print("Negative numbers: " + countNegativeNumbers);

        sc.close();
    }
}

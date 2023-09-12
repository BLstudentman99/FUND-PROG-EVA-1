/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva_1_8_area_triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base;  //double tipo de dato para numeros con parte decimal
        double altura;
        double area; 
        Scanner cap = new Scanner(System.in); 
        
        System.out.println("introduce la base del triangulo:");
        base = cap.nextDouble(); 
        System.out.println("inserte la altura del triangulo:");
        altura = cap.nextDouble(); 
        area = (base * altura)/2;
        System.out.println("el area del triangulo es:");
        System.out.println(area);
        
    }
    
}

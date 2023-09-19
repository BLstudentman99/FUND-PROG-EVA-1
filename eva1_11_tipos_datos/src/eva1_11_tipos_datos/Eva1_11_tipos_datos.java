/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_tipos_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Eva1_11_tipos_datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte califa; 
        califa = 127; 
        // califa = 200; no se puede en byte
        //califa = -128; 
        //califa = -200; no se puede en byte
        //califa = 127 + 1;
        Scanner input = new Scanner(System.in); 
        System.out.println("Sumar valor;");
        byte captu = input.nextByte();
        System.out.println(califa + captu);
        
        
        int valor;
        valor = Integer.MAX_VALUE;
        System.out.println(valor + 1);
        valor = Integer.MIN_VALUE;
        System.out.println(valor);
        
        
        char caracter = 'A'; 
        System.out.println(caracter);
        System.out.println(caracter + 0); 
     
    }
    
}

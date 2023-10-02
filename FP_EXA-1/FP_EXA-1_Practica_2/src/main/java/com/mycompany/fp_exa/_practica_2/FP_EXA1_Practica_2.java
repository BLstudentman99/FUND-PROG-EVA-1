package com.mycompany.fp_exa._practica_2;

import java.util.Scanner;
public class FP_EXA1_Practica_2 {
    private static final Scanner input = new Scanner (System.in);

    public static void main(String[] args) {
        double Fahrenheit;
        double Centigrados;
        double Kelvin;
        System.out.println("Grados Fahrenheit a Centigrados y Kelvin");
        System.out.println("Introducir Grados Fahrenheit");
        Fahrenheit=input.nextDouble();
        Centigrados=(Fahrenheit-32)/1.8;
        Kelvin=((Fahrenheit-32)*5/9+273.15);
        System.out.println("Convercion a Centigrados:");
        System.out.println(Centigrados);
        System.out.println("Convercion a Kelvin:");
        System.out.println(Kelvin);
        
    }
}

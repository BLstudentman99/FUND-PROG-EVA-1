package com.mycompany.fp_exa._practica_5;

import java.util.Scanner;
public class FP_EXA1_Practica_5 {
    private static final Scanner input = new Scanner (System.in);
    
    public static void main(String[] args) {
        System.out.println("distancia alcanzada por un proyectil");
        System.out.println("ingrese la velociddad inicial del proyectil en m/s");
        double vo;
        double g;
        double d;
        double h;
        
        vo=input.nextDouble();
        g=9.81;
        d=vo*vo*1/g;
        h=vo*vo*0.5/(2*g);
        System.out.println("el alcance maximo en metros es:");
        System.out.println(d);
        System.out.println("La altura maxima en m es:");
        System.out.println(h);
    }
}

package com.mycompany.fp_exa._practica_3;

import java.util.Scanner;
public class FP_EXA1_Practica_3 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double radio;
        int diametro;
        double velocidad;
        System.out.println("Radio de la tuberia");
        System.out.println("Ingrese el diametro:");
        diametro=input.nextInt();
        System.out.println("Ingrese la velocidad del agua:");
        velocidad=input.nextDouble();
        radio=3.1416*diametro*(3.1416*diametro/4)*velocidad/24.5;
        System.out.println(radio);
    }
}

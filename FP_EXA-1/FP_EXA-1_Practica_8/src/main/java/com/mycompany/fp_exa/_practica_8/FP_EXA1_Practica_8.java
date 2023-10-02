package com.mycompany.fp_exa._practica_8;

import java.util.Scanner;
public class FP_EXA1_Practica_8 {
    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
        
        try (input) {
            System.out.println("calculadora de hiperbola");
            System.out.println("Ingresa la  coordenada del x del centro: ");
            double centrox = input.nextDouble();
            System.out.print("Ingresa la coordenada y del centro:");
            double centroY = input.nextDouble();
            System.out.print("Ingresa el valor de a (semiaje mayor): ");
            double a = input.nextDouble();
            System.out.print("Ingresa el valor de b (semiaje menor) ");
            double b = input.nextDouble();
            
            //Calcular la distancia del foco (c)
            double c = Math.sqrt(a * a + b * b);
            
            //Calcular las coordenadas de los vertices
            double vertice1Y = centroY + b;
            double vertice2Y = centroY - b;
            
            //Calcular las coordenadas de los focos
            double foco1Y = centroY + c;
            double foco2Y = centroY - c;
            //Imprimir los resultados
            System.out.println("Resultados:");
            System.out.println("Distancia del centro al foco (c):" + c);
            double Centrox;
            System.out.println("coordenadas de los vertices: V1("+Centrox+","+vertice1Y"), V2("+centrox+","+vertice2Y+")");
            System.out.println("coordenadas de los focos: F1("+centrox+","+foco1Y+"), F2("+centrox+","+foco2Y+")");
        }
    }
}
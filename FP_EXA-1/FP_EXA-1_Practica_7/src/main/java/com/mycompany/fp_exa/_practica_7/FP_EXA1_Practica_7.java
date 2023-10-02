package com.mycompany.fp_exa._practica_7;

import java.util.Scanner;
public class FP_EXA1_Practica_7 {
    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Seleccione una operacion");
        System.out.println("1. calcular pendiente para un valor de x");
        System.out.println("2. calcular area bajo la curva entrre dos valores de x");
        System.out.println("3. salir");
        int opcion = input.nextInt();
        switch (opcion) {
            case 1:
            //calcular pendiente
            System.out.println("ingrese el valor de x:");
            double x = input.nextDouble();
            double pendiente = ccalcularPendiente(x);
            System.out.println("la pendiente de x = " + x + "es" + pendiente);
            break;
            case 2:
            //calcular area bajo la curva
            System.out.println("ingrese el valor de a: ");
            double a = input.nextDouble();
            System.out.println("ingrese el valor de b: ");
            double b = input.nextDouble();
            double area = calcularAreaEntrex(a, b);
            System.out.println("El area bajo la curva " + a + "y" + b + "es" + area);
            break;
            case 3:
            System.out.println("Hasta luego");
            System.exit(0);
            default:
            System.out.println("Opcion no valida. Porfavor, Seleccione una opcion valida.");
            
            
            
            
        }
    }
    
    public static double ccalcularPendiente(double x){
    //calcular la pendiente de la funcion y = x^2 en un punto dado x
    return 2 * x;
    }
    public static double calcularAreaEntrex(double a,double b){
    //calcular el area bajo la curva de y = x^2 entre dos valores de x, a y b
    return Math.abs((Math.pow(b,3)-Math.pow(a,3))/3);
    }
}
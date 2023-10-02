package com.mycompany.fp_exa1_practica_6;

import java.util.Scanner;
public class FP_EXA1_Practica_6 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("movimiento angular de una rueda");
        double w;
        System.out.println("Ingrese la velocidad inicial angular en radianes/s");
        double wo;
        wo=input.nextDouble();
        System.out.println("Ingrese la velocidad angular final en radianes/s");
        double wf;
        wf=input.nextDouble();
        System.out.println("Ingrese  el tiempo de rotación en segundos");
        double t;
        t=input.nextDouble();
        System.out.println("Ingrese  el radio de la rueda en metros");
        double rm;
        rm=input.nextDouble();
        
        double t2;
        double f;
        double sm;
        double a;
        double v;
        double a2;
        double sa;

        v=rm*3.1416*(wf-wo)*t;
        a=wf-wo/t;
        a2=rm*a;
        w=t*a;
        sa=w*t;
        t2=2*3.1416/w;
        f=1/t2;
        sm=rm*3.1416*f;
        
        System.out.println("La distancia angular recorrida es");
        System.out.println(sa);
        System.out.println("La distancia en metros recorrida es");
        System.out.println(sm);
        System.out.println("la velocidad angular promedio en r/s recorrida es");
        System.out.println(w);
        System.out.println("La velocidad en m/s promedio recorrida. es");
        System.out.println(v);
        System.out.println("La aceleración angular en rs² es");
        System.out.println(a);
        System.out.println("La aceleración en m/s² es ");
        System.out.println(a);
        System.out.println("La frecuencia de giro en Hertz es");
        System.out.println(f);
    }
}

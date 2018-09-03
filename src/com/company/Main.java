package com.company;

import com.company.interfaces.ICalculadora;
import com.company.interfaces.IFuncional;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        IFuncional fi = mensaje -> String.format("Hola %s, bienvenido al curso de Java", mensaje);

        String resp2 = fi.test("Gustavo");
        System.out.println(resp2);

        fi = mensaje -> String.format("HOLA %s!!!!", mensaje.toUpperCase());
        resp2 = fi.test("gustavo");
        System.out.println(resp2);

        fi = mensaje -> {
            if(mensaje.contains("@")){
                File file = new File("");
            } else {

            }
            return "";
        };

        //********************************
        // RESOLVIENDO LA CALCULADORA
        //********************************

        ICalculadora ic = (a, b) -> a + b;
        System.out.println("Suma: " + ic.fun(2,4));

        ic = (a, b) -> a - b;
        System.out.println("Resta: " + ic.fun(4,2));

        ic = (a, b) -> a * b;
        System.out.println("Multiplicación: " + ic.fun(2,4));

        ic = (a, b) -> a / b;
        System.out.println("División: " + ic.fun(2,2));


    }
}

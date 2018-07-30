package com.company;

import com.company.interfaces.IFuncional;
import com.company.interfaces.impl.Funcional;

import java.io.File;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Funcional f = new Funcional();
        String resp = f.test("Gustavo");
        System.out.println(resp);


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



    }
}

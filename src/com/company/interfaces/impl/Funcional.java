package com.company.interfaces.impl;

import com.company.interfaces.IFuncional;

public class Funcional implements IFuncional {

    @Override
    public String test(String mensaje) {
        return String.format("Hola %s, bienvenido al curso de Java", mensaje);
    }

}

package com.spring.crud.gestionDePersonal.util;

public class GestorCadena {

    public static String quitarCaracteres(String caracteres, String cadena){
        var result = cadena.split(",");

        var resultFinal = "("+result[1]+result[2];

        return resultFinal;
    }

}

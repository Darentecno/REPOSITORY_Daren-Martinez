package com.semillero.semillero.microservicios.services.impl;

public class validar {
    public static boolean esNumero(String numero){
        boolean esNumero = true;
        int contadorPunto = 0;
        int contadorGuion = 0;
        char[] numArreglo = numero.toCharArray();
        for(char c:numArreglo){
            if(Character.isDigit(c)){
                continue;
            }else if(c == '.'){
                contadorPunto++;
            }else if(c == '-'){
                contadorGuion++;
            }else{
                esNumero = false;
                break;
            }
        }
        if(contadorPunto > 1 || contadorGuion > 1){
            esNumero = false;
        }
        if(numero.startsWith(".")||numero.endsWith(".")){
            esNumero = false;
        }
        if(contadorGuion == 1){
            if(!numero.startsWith("-")){
                esNumero = false;
            }
        }
        return esNumero;
    }

}


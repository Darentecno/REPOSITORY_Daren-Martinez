package com.semillero.semillero.microservicios.services;

import org.springframework.http.ResponseEntity;

public interface ICalculadoraService {


     ResponseEntity getSuma(String numero1, String numero2);




     ResponseEntity getResta(String numero1, String numero2);


    ResponseEntity getSaludo(String hora);

    ResponseEntity getOperaciones();


     ResponseEntity getMultiplicacion(String numero1, String numero2);

      ResponseEntity getDivision(String numero1, String numero2);


    ResponseEntity getFactorial(String numero);

    ResponseEntity getMultiplos(String numero);

    ResponseEntity getCoseno(String numero);

    ResponseEntity getRaizCu(String numero);

    ResponseEntity getAreaCir(String radio);

    ResponseEntity getVolumenEsf(String radio);

    ResponseEntity getEcuacionCuad(String a, String b, String c);
}
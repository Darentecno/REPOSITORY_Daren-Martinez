package com.semillero.app.services;

import org.springframework.http.ResponseEntity;

public interface ISaludoService {

    ResponseEntity getSaludo();

    ResponseEntity getSaludoFullname(String  nombre, String apellido);

    ResponseEntity getSaludoParamName(String nombre);

 ResponseEntity getSaludDosParamName(String nomb);

    ResponseEntity getEmployees();
    // ResponseEntity getEmployees();

}



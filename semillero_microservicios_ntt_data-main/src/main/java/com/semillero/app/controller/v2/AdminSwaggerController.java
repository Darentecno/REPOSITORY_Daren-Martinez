package com.semillero.app.controller.v2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public interface AdminSwaggerController {
    @GetMapping
    ResponseEntity listaAdministradores(String nombre);

    @GetMapping("/{nombre}")
    ResponseEntity obtenerdatosporId(Long ID);

    @PostMapping("/employee-list")
    ResponseEntity guardarAdministrador(String nombre);

    @PutMapping
    ResponseEntity actualizarAdministradores(long id);

    @DeleteMapping("/id")
    ResponseEntity eliminarAdministrador(long id);
}

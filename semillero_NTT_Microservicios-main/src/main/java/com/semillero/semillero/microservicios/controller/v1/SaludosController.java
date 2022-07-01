package com.semillero.semillero.microservicios.controller.v1;


import com.semillero.semillero.microservicios.services.ICalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saludos")
public class SaludosController {

    private final ICalculadoraService iCalculadoraService;

    public SaludosController(ICalculadoraService iCalculadoraService) {
        this.iCalculadoraService = iCalculadoraService;
    }


    @GetMapping("/saludos/{time}")
    public ResponseEntity getSaludo(@PathVariable String hora){
        return iCalculadoraService.getSaludo(hora);
    }

    @GetMapping("/operaciones")
    public ResponseEntity getOperaciones(){
        return iCalculadoraService.getOperaciones();
    }
}

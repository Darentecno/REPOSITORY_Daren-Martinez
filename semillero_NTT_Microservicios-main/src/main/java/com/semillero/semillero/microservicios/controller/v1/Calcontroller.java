package com.semillero.semillero.microservicios.controller.v1;


import com.semillero.semillero.microservicios.services.ICalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/calculadora")
public class Calcontroller {


@Autowired
    private final ICalculadoraService iCalculadoraService;



    public Calcontroller(ICalculadoraService iCalculadoraService) {
        this.iCalculadoraService = iCalculadoraService;
    }

    //Operaciones : Suma
    @GetMapping("/suma/{numero}/{numero1}")
    public ResponseEntity getSuma(@PathVariable String nummero1, @PathVariable String numero2){
        return iCalculadoraService.getSuma(nummero1, numero2);
    }
    //Operaciones : Resta
    @GetMapping("/resta/{numero1}/{numero2}")
    public ResponseEntity getResta(@PathVariable String numero1, @PathVariable String numero2){
        return iCalculadoraService.getResta(numero1, numero2);
    }
    //Operaciones : Multiplicacion
    @GetMapping("/multiplicacion/{numero}/{numero}")
    public ResponseEntity getMultiplicacion(@PathVariable String numero1, @PathVariable String numero2){
        return iCalculadoraService.getMultiplicacion(numero1, numero2);
    }
    //Operaciones : Divicion
    @GetMapping("/division/{numero}/{numero}")
    public ResponseEntity getDivision(@PathVariable String numero1, @PathVariable String numero2){
        return iCalculadoraService.getDivision(numero1, numero2);

    }

    //http://localhost:8080/impar/5
    @GetMapping("/impar/{numero}")
    public ResponseEntity  getValidarImpar(@PathVariable int numero){

        String mensaje = (numero % 2==0)?"el numero es par":"el numero no es par";

        return ResponseEntity.ok(mensaje);
    }

    @GetMapping("/multiplo-dos")
    public ResponseEntity  validateIsMultiploDos(@PathParam("valor1") int valor1){

        String mensaje=mensaje= "no multiplo de dos";



        return ResponseEntity.ok(mensaje);
    }
}

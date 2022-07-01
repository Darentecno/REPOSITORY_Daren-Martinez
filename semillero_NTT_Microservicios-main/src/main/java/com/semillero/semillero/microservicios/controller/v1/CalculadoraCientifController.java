package com.semillero.semillero.microservicios.controller.v1;



import com.semillero.semillero.microservicios.services.ICalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadoracientifica")
public class CalculadoraCientifController {

    private final ICalculadoraService iCalculadoraService;

    public CalculadoraCientifController(ICalculadoraService iCalculadoraService) {
        this.iCalculadoraService = iCalculadoraService;
    }

    //Operaciones : factorial
    @GetMapping("/factorial/{numero}")
    public ResponseEntity getFactorial(@PathVariable String numero){
        return iCalculadoraService.getFactorial(numero);
    }
    //Operaciones : Multiplos
    @GetMapping("/multiplos/{numero}")
    public ResponseEntity getMultiplos(@PathVariable String numero){
        return iCalculadoraService.getMultiplos(numero);
    }

    //Operaciones :coseno de un ángulo en grados
    @GetMapping("/coseno/{numero}")
    public ResponseEntity getCoseno(@PathVariable String numero){
        return iCalculadoraService.getCoseno(numero);
    }
    //Operaciones : Raiz Cuadrada
    @GetMapping("/raiz-cuadrada/{numero}")
    public ResponseEntity getRaizCu(@PathVariable String numero){
        return iCalculadoraService.getRaizCu(numero);
    }
//Operaciones : Radio
    @GetMapping("/area-circulo/{radio}")
    public ResponseEntity getAreaCir(@PathVariable String radio){
        return iCalculadoraService.getAreaCir(radio);
    }

    //Operaciones: volumen de una esfera
    @GetMapping("/volumen-esfera/{radio}")
    public ResponseEntity getVolumenEsf(@PathVariable String radio){
        return iCalculadoraService.getVolumenEsf(radio);
    }

    //Operaciones : ecuación cuadrática
    @GetMapping("/ecuacion-cuadratica/{a}/{b}/{c}")
    public ResponseEntity getEcuacionCuad(@PathVariable String a, @PathVariable String b, @PathVariable String c){
        return iCalculadoraService.getEcuacionCuad(a,b,c);
    }
}

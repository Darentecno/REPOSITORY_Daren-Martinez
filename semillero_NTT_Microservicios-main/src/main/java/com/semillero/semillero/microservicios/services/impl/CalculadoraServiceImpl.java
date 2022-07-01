package com.semillero.semillero.microservicios.services.impl;


import com.semillero.semillero.microservicios.config.ConfigCalculadora;
import com.semillero.semillero.microservicios.services.ICalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {

@Override
    public ResponseEntity getSuma(String numero1, String numero2){
        String mensaje = "";


    validar Validar = new validar();
    if(Validar.esNumero(numero1) && Validar.esNumero(numero2)){
            double resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
            mensaje = numero1+" + "+numero2+" = "+resultado;
        }else{
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }
@Override
    public ResponseEntity getResta(String numero1, String numero2){
        String mensaje = "";
    validar Validar= new validar();
    if(Validar.esNumero(numero1) && Validar.esNumero(numero2)){
            double resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
            mensaje = numero1+" - "+numero2+" = "+resultado;
        }else{
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }




    @Override
    public ResponseEntity getMultiplicacion(String numero1, String numero2){
        String mensaje = "";
        validar Validar = new validar();
        if(Validar.esNumero(numero1) && Validar.esNumero(numero2)){
            double resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
            mensaje = numero1+" * "+numero2+" = "+resultado;
        }else{
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }
@Override
    public ResponseEntity getDivision(String numero1, String numero2){
        String mensaje = "";

    validar Validar =new validar();
    if(Validar.esNumero(numero1) && Validar.esNumero(numero2)){
            if(Double.parseDouble(numero2)==0){
                mensaje = "ERROR! División por cero";
            }else{
                double resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
                mensaje = numero1+" / "+numero2+" = "+resultado;
            }
        }else{
            mensaje = "Entrada no válida";
        }
        return ResponseEntity.ok(mensaje);
    }

    @Override
    public ResponseEntity getFactorial(String numero) {
        return null;
    }

    @Override
    public ResponseEntity getMultiplos(String numero) {
        return null;
    }

    @Override
    public ResponseEntity getCoseno(String numero) {
        return null;
    }

    @Override
    public ResponseEntity getRaizCu(String numero) {
        return null;
    }

    @Override
    public ResponseEntity getAreaCir(String radio) {
        return null;
    }

    @Override
    public ResponseEntity getVolumenEsf(String radio) {
        return null;
    }

    @Override
    public ResponseEntity getEcuacionCuad(String a, String b, String c) {
        return null;
    }

    @Override
    public ResponseEntity getSaludo(String hora) {
        int horaNum = Integer.parseInt(hora);
        String mensaje;

        ConfigCalculadora configCalculadora = new ConfigCalculadora();
        if(horaNum >= 6 && horaNum < 12){
            mensaje = configCalculadora.getValorSaludo(ConfigCalculadora.MANANA);
        }else if(horaNum >= 12 && horaNum < 19){
            mensaje = configCalculadora.getValorSaludo(ConfigCalculadora.TARDE);
        }else if(horaNum >= 19 && horaNum <= 23 || horaNum >= 0 && horaNum < 6){
            mensaje = configCalculadora.getValorSaludo(ConfigCalculadora.NOCHE);
        }else{
            mensaje = "El número ingresado no es válido";
        }
        return ResponseEntity.ok(mensaje);
    }

    @Override
    public ResponseEntity getOperaciones(){
        ConfigCalculadora configCalculadora = new ConfigCalculadora();
        String mensaje = "Las operaciones disponibles son: "+
                "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.SUMA)+
                "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.RESTA)+
                "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.MULTIPLICACION)+
                "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.DIVISION)+
                "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.FACTORIAL)+
                "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.MULTIPLOS)+
                "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.COSENO)+
                "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.RAIZ_CUADRADA)+
                "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.AREA_CIRCULO)+
                "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.VOLUMEN_ESFERA)+
                "\n"+configCalculadora.getValorOperacion(ConfigCalculadora.ECUACION_CUADRATICA);
        return ResponseEntity.ok(mensaje);
    }
}
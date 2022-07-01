package com.semillero.app.Execeptiones;

import org.springframework.http.HttpStatus;

@ResposeStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID =1L;
    private String nombreDelRecurso;
    private String nombreDelCampo;
    private long ValorDelCampo;

    public ResourceNotFoundException(String administador, String id, long id1) {
    }

    public String getNombreDelCampo() {
        return nombreDelCampo;
    }

    public void setNombreDelCampo(String nombreDelCampo) {
        this.nombreDelCampo = nombreDelCampo;
    }

    public String getNombreDelRecurso() {
        return nombreDelRecurso;
    }

    public void setNombreDelRecurso(String nombreDelRecurso) {
        this.nombreDelRecurso = nombreDelRecurso;
    }

    public long getValorDelCampo() {
        return ValorDelCampo;
    }

    public void setValorDelCampo(long valorDelCampo) {
        ValorDelCampo = valorDelCampo;
    }

}


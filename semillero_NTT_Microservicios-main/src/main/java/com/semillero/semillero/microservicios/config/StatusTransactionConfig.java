package com.semillero.semillero.microservicios.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "calculadora.status")
public class StatusTransactionConfig {

    public  static final String SUCCESS="success";

    public  static final String UNSUCCESS="unsuccess";

    //calculadora.status.code=*
    private int code;

    //calculadora.status.transaction.*=*
    private Map<String,String> transaction;

//calculadora.status.transaction.success(successName)=*
    public String getSeccuss(final String successName){
        return transaction.get(successName);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Map<String, String> getTransaction() {
        return transaction;
    }

    public void setTransaction(Map<String, String> transaction) {
        this.transaction = transaction;
    }

}

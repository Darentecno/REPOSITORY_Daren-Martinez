package com.semillero.app.Execeptiones;

import org.springframework.http.HttpStatus;

public @interface ResposeStatus {
    HttpStatus value();
}

package com.semillero.app.dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AdminLombokDTO {

    private long id;
    private String nombre;

    private String apellido;

    private String cargo;
    private String correo;
    private String fecha_creacion;
    private String fecha_eliminacion;


}

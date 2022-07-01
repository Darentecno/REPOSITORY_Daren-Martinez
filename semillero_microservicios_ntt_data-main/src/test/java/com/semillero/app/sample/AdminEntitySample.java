package com.semillero.app.sample;





import com.semillero.app.dto.api.dummy.AdminDTO;
import com.semillero.app.model.Administrador;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminEntitySample {


    public static ResponseEntity getAdminEntity() {
        Administrador administrador = new Administrador(1L, "pedro", "perez", "contador", "correo", "telefono", new Date(), new Date());
        return ResponseEntity.ok(administrador);
    }
    public static AdminDTO getRequestAdminEntity(){
        Administrador administrador = new Administrador();
        administrador.setNombre("Juan");
        administrador.setApellido("perez");
        administrador.setCargo("Jefe");
        administrador.setCorreo("juanperez@gmail.com");
        administrador.setTelefono("3124754879");
        administrador.setFechaCreacion(new Date());
        AdminDTO AdminDTO;
        return  administrador ;

    }

    public static List<Administrador> AdminDTO(){

        List<AdminDTO> adminDTOS = new ArrayList<>();
        adminDTOS.add(getRequestAdminEntity());
        adminDTOS.add(getRequestAdminEntity());
        adminDTOS.add(getRequestAdminEntity());
        adminDTOS.add(getRequestAdminEntity());
        adminDTOS.add(getRequestAdminEntity());
        adminDTOS.add(getRequestAdminEntity());
        return  AdminDTO() ;

    }


}



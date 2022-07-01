package com.semillero.app.controller.v2;

import com.semillero.app.controller.v1.Admincontroller;
import com.semillero.app.services.IAdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/v1")
public class AdminSwaggerControllerDos implements AdminSwaggerController {

    private final IAdminService iAdminService;

    public AdminSwaggerControllerDos(IAdminService iAdminService) {
        this.iAdminService = iAdminService;
    }




    @Override
    @PostMapping
    public ResponseEntity listaAdministradores(String nombre) {
        return iAdminService.obtenerDatosPorId();
    }

    @Override
        @GetMapping("/{nombre}")
        public ResponseEntity obtenerdatosporId(Long ID) {
            return iAdminService.obtenerDatosPorId();
        }

    @Override
    @PostMapping("/employee-list")
    public ResponseEntity guardarAdministrador(String nombre) {
        return iAdminService.CrearAdministrador();
    }




    @Override
    @PutMapping
    public  ResponseEntity actualizarAdministradores(long id){
        return iAdminService.actualizarAdministradores();
    }

    @Override
    @DeleteMapping("/id")
    public ResponseEntity eliminarAdministrador(long Id){
        return iAdminService.eliminarAdministrador();
    }
}

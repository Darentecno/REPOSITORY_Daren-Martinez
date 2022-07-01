package com.semillero.app.controller.v1;

import com.semillero.app.dto.api.dummy.AdminDTO;
import com.semillero.app.providers.EmployeeFeingProvider;
import com.semillero.app.services.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

   @RestController
       @RequestMapping("/admin/v1")
        public class Admincontroller {
          @Autowired
            private final IAdminService iadminService;

                @Autowired
                  private EmployeeFeingProvider employeeFeingProvider;

          public Admincontroller(IAdminService iadminService) {
            this.iadminService = iadminService;
        }

                @GetMapping("/{lista}")
                      public List<AdminDTO> listaAdministradores(@RequestParam(value= "cargo", defaultValue = "0", required = false) String nombresDeCargo,
               @RequestParam(value= "cargo", defaultValue = "10", required = false) Integer  ID){
              return iadminService.obtenerListaDatos(Integer.parseInt(nombresDeCargo), (Integer) ID);

              }
       @GetMapping("/{id}")
        public ResponseEntity<AdminDTO> obtenerdatosporId(@PathVariable (name= "id")long id){
            return  ResponseEntity.ok(iadminService. obtenerDatosPorId(id));
            }

    @PostMapping
        public ResponseEntity<AdminDTO> guardarAdministrador(@RequestBody AdminDTO adminDTO) {
               return new ResponseEntity<>(iadminService.CrearAdministrador(adminDTO), HttpStatus.CREATED);
    }
       @PutMapping ("{id}")
             public ResponseEntity<AdminDTO> actualizarAdministradores(@RequestBody AdminDTO adminDTO,@PathVariable(name="id")long id){
            AdminDTO  tablaActualizada =iadminService.actualizarAdministradores(adminDTO, id);
                 return new ResponseEntity<>(tablaActualizada,HttpStatus.OK);
       }
       @DeleteMapping("/id")
                public ResponseEntity<String> eliminarAdministrador(@PathVariable(name= "id") long id){
              iadminService.eliminarAdministrador(id);
            return new ResponseEntity<>("La tabla se ha eliminado con exito",HttpStatus.OK);
       }
    }

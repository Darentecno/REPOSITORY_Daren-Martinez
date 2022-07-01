package com.semillero.app.providers;

import com.semillero.app.dto.api.dummy.AdminDTO;
import com.semillero.app.dto.api.dummy.ResponseBodyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(
       name = "restapiexample",
       url = "${restapiexample.url}"
)
public interface EmployeeFeingProvider {

    ResponseBodyDTO getListEmployee =new ResponseBodyDTO();

    @GetMapping("/employees")
    AdminDTO getListEmployee();

    // esta es del Administrador
    @GetMapping("/admin/v1/{lista}")
    List<AdminDTO>  listaAdministradores();

    @GetMapping("/admin/v1/{id}")
      AdminDTO obtenerdatosporId(@PathVariable long id);

//esta es de saludos
    @GetMapping("/saludo/v1/full-name")
    String getSaludoFullName(@PathVariable String full);


}

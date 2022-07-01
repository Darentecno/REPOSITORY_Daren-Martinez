package com.semillero.app.providers;

import com.semillero.app.dto.api.dummy.AdminDTO;
import com.semillero.app.services.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

  @Service
  @Primary
   public interface ItemServiceFeing extends IAdminService {

      @Autowired
      EmployeeFeingProvider employeeFeingProvider = new EmployeeFeingProvider() {
          @Override
          public AdminDTO getListEmployee() {
              return employeeFeingProvider.getListEmployee();
          }

          @Override
          public List<AdminDTO> listaAdministradores() {
              return employeeFeingProvider.listaAdministradores();

          }

          @Override
          public AdminDTO obtenerdatosporId(long id) {

              return employeeFeingProvider.obtenerdatosporId(id);
          }

          @Override
          public String getSaludoFullName(String full) {
              return employeeFeingProvider.getSaludoFullName(full);
          }


      };
  }
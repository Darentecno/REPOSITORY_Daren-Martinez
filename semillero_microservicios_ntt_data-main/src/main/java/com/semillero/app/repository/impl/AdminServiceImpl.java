package com.semillero.app.repository.impl;


import com.semillero.app.Execeptiones.ResourceNotFoundException;
import com.semillero.app.dto.api.dummy.AdminDTO;
import com.semillero.app.model.Administrador;
import com.semillero.app.providers.EmployeeFeingProvider;
import com.semillero.app.repository.AdminRepository;
import com.semillero.app.services.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServiceImpl implements IAdminService {
    @Autowired
    private AdminRepository adminRepository;
      @Autowired
    private EmployeeFeingProvider employeeFeingProvider;

    @Override
    public AdminDTO CrearAdministrador(AdminDTO adminDTO) {
        Administrador administrador = mapearEntidaDTO(adminDTO);

        Administrador nuevoAdministrador = adminRepository.save(administrador);
        AdminDTO Respuesta = mapearDTO(nuevoAdministrador);
        return Respuesta;
    }

    @Override
    public  List<AdminDTO>obtenerListaDatos(Integer nombresDeCargo, Integer ID){
        Pageable pegeable = (Pageable) PageRequest.of((Integer) nombresDeCargo,ID);
        Page<Administrador> administradors = adminRepository.findAll((org.springframework.data.domain.Pageable) pegeable);

        List<Administrador> listaDeAdministradores = administradors.getContent();
        return  listaDeAdministradores.stream().map(administrador -> mapearDTO(administrador)).collect(Collectors.toList());
    }


    // convertir  entida a  DTO
    @Override
    public AdminDTO mapearDTO(Administrador administrador) {
        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setId(administrador.getId());
        adminDTO.setNombre(administrador.getNombre());
        adminDTO.setApellido(administrador.getApellido());
        adminDTO.setCargo(administrador.getCargo());
        adminDTO.setCorreo(administrador.getCorreo());
        return adminDTO;
    }
    //Convierte de DTO a Entida

    public Administrador mapearEntidaDTO(AdminDTO adminDTO) {
        Administrador administrador = new Administrador();
        administrador.setNombre(adminDTO.getNombre());
        administrador.setApellido(adminDTO.getApellido());
        administrador.setCargo(adminDTO.getCargo());
        administrador.setCorreo(adminDTO.getCorreo());
        return administrador;
    }

    @Override
    public AdminDTO obtenerDatosPorId(long id) {
        Administrador administrador = adminRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Administador", "id", id));
        return mapearDTO(administrador);
    }

    @Override
    public AdminDTO actualizarAdministradores(AdminDTO adminDTO, long id) {
        Administrador administrador = adminRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Administador", "id", id));
        administrador.setNombre(adminDTO.getNombre());
        administrador.setApellido(adminDTO.getApellido());
        administrador.setCargo(adminDTO.getCargo());
        administrador.setCorreo(adminDTO.getCorreo());

        Administrador actualizarAdministradores = adminRepository.save(administrador);
        return mapearDTO(actualizarAdministradores);
    }

    @Override
    public AdminDTO eliminarAdministrador(long id) {
        Administrador administrador = adminRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Administador", "id", id));
        adminRepository.delete(administrador);
        return null;
    }





}
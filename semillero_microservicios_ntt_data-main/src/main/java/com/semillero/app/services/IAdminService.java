package com.semillero.app.services;


import com.semillero.app.dto.api.dummy.AdminDTO;
import com.semillero.app.model.Administrador;

import java.util.List;

public interface IAdminService {


    AdminDTO CrearAdministrador(AdminDTO adminDTO);


    AdminDTO obtenerDatosPorId(long id);

    AdminDTO actualizarAdministradores(AdminDTO adminDTO, long id);


    List<AdminDTO> obtenerListaDatos(Integer nombresDeCargo, Integer ID);

    // convertir  entida a  DTO
    AdminDTO mapearDTO(Administrador administrador);

    //Convierte de DTO a Entida
    Administrador mapearEntidaDTO(AdminDTO adminDTO);


    AdminDTO eliminarAdministrador(long id);

    void obtenerListaDatos();
}
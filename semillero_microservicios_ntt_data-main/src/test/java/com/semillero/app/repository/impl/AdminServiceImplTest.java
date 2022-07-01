package com.semillero.app.repository.impl;

import com.semillero.app.model.Administrador;
import com.semillero.app.repository.AdminRepository;
import com.semillero.app.sample.AdminEntitySample;
import com.semillero.app.services.IAdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
@SpringBootTest
class AdminServiceImplTest {
    @MockBean
    AdminRepository adminRepository;

    @Autowired
    IAdminService iAdminService;

    @Test
    void crearAdministrador() {

        when(adminRepository.save(any())).thenReturn(AdminEntitySample.getRequestAdminEntity());
        var ResponseEntity = iAdminService.CrearAdministrador(AdminEntitySample.getRequestAdminEntity());
        Administrador administrador = (Administrador) responseEntity.getBody();

        verify(adminRepository, times(1)).save(any());
        assertNotNull(administrador);
        assertEquals("Juan", administrador.getNombre());
        assertInstanceOf(Administrador.class, administrador);



    }

    @Test
    void obtenerListaDatos() {
        when(adminRepository.findAll()).thenReturn(AdminEntitySample.getListAdmint());
        var responseEntity = iAdminService.obtenerListaDatos();
        List<Administrador> administradorList = (List<Administrador>) responseEntity.;
        verify(adminRepository, times(1)).findAll();

        assertNotNull(administradorList);
        assertEquals(3,administradorList.size());
        assertEquals("Juan",administradorList.get(0).getNombre());
        assertEquals(200,responseEntity.getStatuscodeValue());
    }

    @Test
    void mapearDTO() {
    }

    @Test
    void mapearEntidaDTO() {
    }

    @Test
    void obtenerDatosPorId() {
    }

    @Test
    void actualizarAdministradores() {
    }

    @Test
    void eliminarAdministrador() {
    }
}
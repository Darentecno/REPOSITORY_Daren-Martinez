package com.semillero.app.repository;


import com.semillero.app.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface AdminRepository extends JpaRepository<Administrador,Long> {
    @Query(value = "SELECT adm* FROM administrador where adm.apellido = :id",nativeQuery = true)
    List<Administrador> buscarPorIdAdministrador(Long Id);

    @Query(value = "SELECT adm* FROM administrador where adm.nombre = :nombre",nativeQuery = true)
    List<Administrador> buscarPorNombreAdministrador(String nombre);


    @Query(value = "SELECT adm* FROM administrador where adm.apellido = :apellido",nativeQuery = true)
    List<Administrador> buscarPorApellidoAdministrador(String apellido);


    @Query(value = "SELECT adm* FROM administrador where adm.cargo = :cargo",nativeQuery = true)
    List<Administrador> buscarPorCargoAdministrador(String cargo);


    @Query(value = "SELECT adm* FROM administrador where adm.correo = :correo",nativeQuery = true)
    List<Administrador> buscarPorCorreoAdministrador(String correo);

    @Query(value = "SELECT adm FROM  Administrador adm WHERe adm.telefono = :telefono",name= "true")
    List<Administrador> buscarPorTelefonoAdministradorJPQL(String telefono);

    @Query(value = "SELECT adm FROM  Administrador adm WHERe adm.fecha_creacion = :fecha_creacion", name= "true")
    List<Administrador> buscarFecha_CreacionAdministradorJPQL( Date fecha_creacion);

    @Query(value = "SELECT adm FROM  Administrador adm WHERe adm.fecha_eliminacion = :fecha_eliminacion", name = "true")
    List<Administrador> buscarFecha_EliminacionAdministradorJPQL(Date fecha_eliminacion);

}
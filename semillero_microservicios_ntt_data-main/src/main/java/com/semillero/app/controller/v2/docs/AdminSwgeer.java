package com.semillero.app.controller.v2.docs;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
@Tag(name = "Bienvenido")
public interface AdminSwgeer {

        @Operation(summary = "Servicio De listados De Administradores")
        @ApiResponses(
                value = {
                        @ApiResponse(
                                responseCode = "200",
                                description = "retorna la listas de los Administrados Existentes",
                                content = {
                                        @Content(
                                                mediaType = MediaType.APPLICATION_JSON_VALUE
                                        )
                                }
                        )
                }
        )
        ResponseEntity listaAdministradores();


        @Operation(summary = "Servicio para gestionar la informacion del Administrador")
        @ApiResponses(
                value = {
                        @ApiResponse(
                                responseCode = "200",
                                description = "retorna la informacion solicitada",
                                content = {
                                        @Content(
                                                mediaType = MediaType.APPLICATION_JSON_VALUE
                                        )
                                }
                        )
                }
        )
        ResponseEntity obtenerdatosporId( @PathVariable long id);


        @Operation(summary = "Servicio de Creacion de tus Datos")
        @ApiResponses(
                value = {
                        @ApiResponse(
                                responseCode = "200",
                                description = "Se han Guardado con Exito los Datos que Ingresastes",
                                content = {
                                        @Content(
                                                mediaType = MediaType.APPLICATION_JSON_VALUE
                                        )
                                }
                        )
                }
        )
        ResponseEntity guardarAdministrador(@PathVariable String nombre);

    @Operation(summary = "Servicio para traer informacion de Admistradores Actializados")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "El Administrador que Selecionastes se ha Actualizado Con Exito",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE
                                    )
                            }
                    )
            }
    )ResponseEntity actualizarAdministradores(@PathVariable long id);
    @Operation(summary = "informacion de los Uaurios Eliminados")
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "retorna se elimino con exito el Administrador",
                            content = {
                                    @Content(
                                            mediaType = MediaType.APPLICATION_JSON_VALUE
                                    )
                            }
                    )
            }
    )ResponseEntity eliminarAdministrador(@PathVariable long id);
    }



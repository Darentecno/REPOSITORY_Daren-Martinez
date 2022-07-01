create database semillero;

 create table administrador
(
id_administrador int auto_increment not null ,
nombre varchar(65) ,
apellido varchar(65) ,
cargo varchar(65) ,
correo varchar(65) ,
telefono varchar(65) ,
fecha_creacion date ,
fecha_eliminacion date,
 primary key (id_administrador)
);

INSERT INTO administrador
(nombre,
 apellido,
 cargo,
 correo,
 telefono,
 fecha_creacion)
VALUES ('juan',
        'perez',
        'jefe',
        'Juanperez@gmail.com',
        'telefono',
        now());

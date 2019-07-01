-- Para borrar la base de datos
DROP DATABASE banco;

-- Creacion de base de datos
CREATE DATABASE banco;
-- Usar la base de datos
USE banco;

-- Creaciones de Tabla
CREATE TABLE tipoUsuario(
id INT AUTO_INCREMENT,
nombre VARCHAR(50), 
PRIMARY KEY(id)
);

CREATE TABLE usuario(
id INT AUTO_INCREMENT,
rut VARCHAR(15),
nombre VARCHAR(60),
pass VARCHAR(64),
id_tipoUsu_fk INT,

PRIMARY KEY (id),
FOREIGN KEY (id_tipoUsu_fk) REFERENCES tipoUsuario(id)
);

CREATE TABLE formularioCliente(
id INT AUTO_INCREMENT,
rut VARCHAR(15),
nomusuari VARCHAR(60),
apellido VARCHAR(60),
sueldo_liquido INT,

PRIMARY KEY (id)
);

CREATE TABLE tarjeta (
id INT AUTO_INCREMENT,
letra a VARCHAR(60),
letra b VARCHAR(60),
letra c VARCHAR(60),
letra d VARCHAR(60),
letra e VARCHAR(60),
usuario_id_fk INT,
estado BOOLEAN,

PRIMARY KEY(id),
FOREIGN KEY (usuario_id_fk) REFERENCES usuario(id)
);

CREATE TABLE transferencia(
id INT AUTO_INCREMENT,
id_Usuario_fk INT,
id_Usuario2_fk INT,

PRIMARY KEY(id),
FOREIGN KEY (id_Usuario_fk)REFERENCES usuario(id),
FOREIGN KEY (id_Usuario2_fk)REFERENCES usuario(id)
);
-- Fin de creaciones de tabla



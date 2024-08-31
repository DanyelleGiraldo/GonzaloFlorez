create database gonzaloflorez;

use gonzaloflorez;

CREATE TABLE ventas (
    numventa VARCHAR(255) NOT NULL,
    fecha DATE,
    empresa VARCHAR(255),
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    codigoentidad VARCHAR(50),
    nit VARCHAR(20),
    valorprocedimiento INT,
    valorderechosala INT,
    materialeinsumo INT,
    valorlecturas INT,
    valorcopago INT,
    valorfactura INT,
    PRIMARY KEY (numventa)
);
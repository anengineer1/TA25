DROP TABLE IF EXISTS almacenes;
DROP table IF EXISTS cajas;


CREATE TABLE almacenes (
  codigo int NOT NULL AUTO_INCREMENT,
  lugar nvarchar(100) DEFAULT NULL,
  capacidad int DEFAULT NULL,
  PRIMARY KEY (codigo)
);

CREATE TABLE cajas (
  numreferencia char(5) NOT NULL,
  contenido nvarchar(100) DEFAULT NULL,
  valor int DEFAULT NULL,
  almacen int DEFAULT NULL,
  PRIMARY KEY (numreferencia),
  CONSTRAINT cajas_fk FOREIGN KEY (almacen) REFERENCES almacenes (codigo)
);


insert into almacenes (lugar, capacidad) values ('Dalas', 5);
insert into almacenes (lugar, capacidad) values ('Ohio', 50);
insert into almacenes (lugar, capacidad) values ('Mostoles', 40);


insert into cajas (numreferencia, contenido, valor, almacen) values ('12345', 'Carbon', 50, 1);
insert into cajas (numreferencia, contenido, valor, almacen) values ('22222', 'Petroleo', 100, 1);
insert into cajas (numreferencia, contenido, valor, almacen) values ('44444', 'Lavanda', 3000, 1);


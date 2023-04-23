DROP TABLE IF EXISTS fabricantes;
DROP table IF EXISTS articulos;


CREATE TABLE fabricantes (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  PRIMARY KEY (codigo)
);

CREATE TABLE articulos (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  precio int DEFAULT NULL,
  fabricante int,
  PRIMARY KEY (codigo),
  CONSTRAINT articulos_fk FOREIGN KEY (fabricante) REFERENCES fabricantes (codigo)
);


insert into fabricantes (nombre) values ('Alberto');
insert into fabricantes (nombre) values ('Laure');
insert into fabricantes (nombre) values ('Sinclair');

insert into articulos (nombre, precio, fabricante) values ('Camiseta', 22, 1);
insert into articulos (nombre, precio, fabricante) values ('Chaqueta', 20, 1);
insert into articulos (nombre, precio, fabricante) values ('Pescado', 22, 2);

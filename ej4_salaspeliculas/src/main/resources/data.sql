DROP TABLE IF EXISTS peliculas;
DROP table IF EXISTS salas;


CREATE TABLE peliculas (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  calificacionedad int DEFAULT NULL,
  PRIMARY KEY (codigo)
);

CREATE TABLE salas (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  pelicula int DEFAULT NULL,
  PRIMARY KEY (codigo),
  CONSTRAINT salas_fk FOREIGN KEY (pelicula) REFERENCES peliculas (codigo)
);


insert into peliculas (nombre, calificacionedad) values ('La leche rica', 3);
insert into peliculas (nombre, calificacionedad) values ('Rica nata', 18);
insert into peliculas (nombre, calificacionedad) values ('Juguetes chulos', 8);

insert into salas (nombre, pelicula) values ('Manolo', 1);
insert into salas (nombre, pelicula) values ('Tete', 1);
insert into salas (nombre, pelicula) values ('Viste', 3);

DROP TABLE IF EXISTS departamentos;
DROP table IF EXISTS empleados;


CREATE TABLE departamentos (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  presupuesto int DEFAULT NULL,
  PRIMARY KEY (codigo)
);

CREATE TABLE empleados (
  dni varchar(8) NOT NULL,
  nombre nvarchar(100) DEFAULT NULL,
  apellidos nvarchar(255) DEFAULT NULL,
  departamento int,
  PRIMARY KEY (dni),
  CONSTRAINT empleados_fk FOREIGN KEY (departamento) REFERENCES departamentos (codigo)
);


insert into departamentos (nombre, presupuesto) values ('Reverendo', 3000);
insert into departamentos (nombre, presupuesto) values ('EO', 5000);
insert into departamentos (nombre, presupuesto) values ('RRHH', 8000);


insert into empleados (dni, nombre, apellidos, departamento) values ('47758631', 'Garcia', 'Lorca Oviedo', 1);
insert into empleados (dni, nombre, apellidos, departamento) values ('55558631', 'Pedro', 'Lara Oviedo', 1);
insert into empleados (dni, nombre, apellidos, departamento) values ('75889651', 'LiuYang', 'Lorca Meme', 1);


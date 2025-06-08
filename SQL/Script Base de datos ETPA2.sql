create database if not exists etpa2;

use etpa2;

create table if not exists Usuario(
	idUsuario varchar(20) not null,
    contraseña varchar(20) not null,
    puntuación int not null,
    idPersonaje int not null,
    constraint fk_idPersonaje foreign key (idPersonaje) references Personaje(idPersonaje),
    primary key  (idUsuario)
);

create table if not exists Personaje(
	idPersonaje int not null auto_increment,
    nombre varchar(20) not null,
    apellidos varchar(30) not null,
    raza varchar(20) not null,
    edad int not null,
    ataque int not null,
    defensa int not null,
    velocidad int not null,
    idMochila int not null,
    constraint fk_idMochila foreign key (idMochila) references Mochila(idMochila),
    primary key (idPersonaje)
);

create table if not exists Enemigo(
    idEnemigo int not null auto_increment,
    nombre varchar(20) not null,
    apellidos varchar(30) not null,
    raza varchar(20) not null,
    edad int not null,
    ataque int not null,
    defensa int not null,
    velocidad int not null,
    primary key (idEnemigo)
)

create table if not exists Aliado(
    idAliado int not null auto_increment,
    nombre varchar(20) not null,
    apellidos varchar(30) not null,
    raza varchar(20) not null,
    edad int not null,
    ataque int not null,
    defensa int not null,
    velocidad int not null,
    primary key (idAliado)
)

create table if not exists Final(
	idFinal int not null auto_increment,
    descripcion varchar(100) not null,
    idPersonaje int not null,
    constraint fk_idPersonaje foreign key (idPersonaje) references Personaje(idPersonaje),
    primary key (idFinal)
);

create table if not exists Objeto(
	idObjeto int not null auto_increment,
    efecto varchar(20) not null,
    cantidadEfecto int not null,
    primary key (idObjeto)
);

create table if not exists Mochila(
	idMochila int not null auto_increment,
    cantidadObjeto int not null,
    constraint fk_idObjeto foreign key (idObjeto) references Objeto(idObjeto),
    primary key (idMochila)
);

create table if not exists ObjetoMochila(
	idMochila int not null,
    idObjeto int not null,
    constraint fk_idMochila foreign key (idMochila) references Mochila(idMochila),
    constraint fk_idObjeto foreign key (idObjeto) references Objeto(idObjeto),
    primary key (idMochila),
    primary key (idObjeto)
);

insert into Personaje (nombre, apellidos, raza, edad, ataque, defensa, velocidad, idMochila) values
('Carlos', 'Ramirez', 'Humano', 32, 55, 45, 65, 1),
('Lucia', 'Fernandez', 'Humano', 27, 52, 38, 68, 2),
('Miguel', 'Santos', 'Humano', 29, 58, 42, 62, 1);

insert into Enemigo (nombre, apellidos, raza, edad, ataque, defensa, velocidad) values
('Varg', 'Bjornsson', 'Zombie', 40, 45, 25, 30),
('Erik', 'Schneider', 'Zombie', 35, 40, 20, 25);

insert into Aliado (nombre, apellidos, raza, edad, ataque, defensa, velocidad) values
('Albert', 'Einstein', 'Humano', 76, 30, 50, 40),
('Leonardo', 'Da Vinci', 'Humano', 67, 35, 55, 45);

insert into Final (descripcion, idPersonaje) values
('El héroe derrota al enemigo final.', 1),
('El héroe se sacrifica para salvar a su pueblo.', 2);

insert into Objeto (efecto, cantidadEfecto) values
('Curación', 50),
('Ataque', 20);

insert into Mochila (cantidadObjeto) values
(5),
(3);

insert into ObjetoMochila (idMochila, idObjeto) values
(1, 1),
(1, 2),
(2, 1);


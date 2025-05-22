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
    raza varchar(20) not null,
    edad int not null,
    ataque int not null,
    defensa int not null,
    velocidad int not null,
    idMochila int not null,
    constraint fk_idMochila foreign key (idMochila) references Mochila(idMochila),
    primary key (idPersonaje)
);

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


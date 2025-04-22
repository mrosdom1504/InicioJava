drop database if exists Productos;
create database if not exists Productos;
use Productos;

create table if not exists Producto(
    id int auto_increment primary key,
    nombre varchar(50) not null,
    precio decimal(10,2) not null,
    cantidad int not null
);
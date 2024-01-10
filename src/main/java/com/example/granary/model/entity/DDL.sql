CREATE DATABASE granary;

use granary;

create table user
(
    id       bigint primary key auto_increment not null,
    username varchar(20),
    password varchar(20),
    constraint user_pk unique (username)
);

create table granary
(
    id    bigint auto_increment
        primary key,
    name  varchar(20) null,
    stock double      null,
    constraint granary_pk
        unique (name)
);

create table hygrometer
(
    id       bigint auto_increment primary key,
    humidity double      not null,
    seat     varchar(20) not null
);

create table thermometer
(
    id   bigint auto_increment primary key,
    temp double      not null,
    seat varchar(20) not null
);

create table worker
(
    id          bigint auto_increment primary key,
    name        varchar(20) not null,
    position    varchar(20) not null,
    description varchar(20) not null,
    constraint worker_pk unique (name)
)

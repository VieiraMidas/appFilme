create database db_filmes;
use db_filmes;

create table tb_filmes(
id_filme int PRIMARY KEY not null auto_increment, 
titulo varchar (100),
genero varchar (100),
sinopse varchar (100),
ano varchar (4));

insert into tb_filmes values (null, "meu amigo Totoro", "Animaçao", "As irmãs Satsuki e Mei se mudam para o campo para ficar mais perto do hospital onde sua mãe está internada...", "1995");
insert into tb_filmes values (null, "Detona Ralph", "Animaçao", "Ralph está cansado de ser desprezado no seu próprio jogo de fliperama. Para ganhar a atenção do herói Felix e todos os outros...", "2012");

select * from tb_filmes;
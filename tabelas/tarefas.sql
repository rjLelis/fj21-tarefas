<!-- Criação da tabela de tarefas
create table tarefas(
    id serial,
    descricao varchar(255),
    finalizado boolean,
    dataFinalizacao date,
    primary key(id)
);

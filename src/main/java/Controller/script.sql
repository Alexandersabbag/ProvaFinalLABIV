create table tb_usuario(
	id SERIAL,
	usuario varchar(45), 
	senha varchar(32),
	fg_ativo int, --0 inativo na empresa , 1 ativo na empresa (Só pode ser acessado pelo admin (id = 1))
	constraint pk_usuario_id primary key(id)
);

create table tb_endereco(
	nome varchar(225), --nome do cliente ou empresa
	identificacao varchar(14), --cpf caso seja pessoa física ou cnpj para empresas
	endereco varchar (225),
	cidade varchar(225),
	uf varchar(2),
	cep varchar(225),
	constraint pk_identificacao primary key(identificacao)
);

create table tb_veiculo(
	placa varchar(7),
	cor varchar(20),
	modelo varchar(20),
	marca varchar(20),
	motorista varchar (45),
        fg_ativo int,
	
	constraint pk_placa primary key (placa)
);

create table tb_entrega(
	nf varchar(45),
	placa varchar(7),
	id_remetente varchar(14),
	id_destinatario varchar(11),
	status_entrega varchar(20),
	dta_saida varchar(10),
	dta_entrega varchar(10),
	
	constraint pk_entrega_nf primary key (nf),
	
	constraint fk_placa foreign key (placa)
	references tb_veiculo(placa),
	
	constraint fk_remetente foreign key(id_remetente)
	references tb_endereco(identificacao),
	
	constraint fk_destinatario foreign key(id_destinatario)
	references tb_endereco(identificacao)
);

--inserção manual do Admin
insert into tb_usuario (usuario,senha,fg_ativo)
	values
	('admin','123456','1');
	
-- encritografia de senha chamada MD5, não é o mais seguro de se usar(cria um hash de 32 caracteres) 

update tb_usuario set senha=md5('123456')
where id = 1


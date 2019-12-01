
	insert into previsoes (min, max, hum, des, data, hora) values (21.0, 24.0, 73.0, 'possivel pancada de chuva durante a tarde','14/11/2019', 22.00);
	insert into dias (semana) values ('Segunda');
	insert into cidades (nome,latitude, longitude) values ('Osasco', 111.22, 33.44 );	
	
	update previsoes set dia = 1 where id = 1;
	update previsoes set cidade_id = 1 where id = 1;
	update dias set previsao = 1 where id = 1;
	
	--------------------------------------------------------------------------------------------------------------------------------
	insert into previsoes (min, max, hum, des, data, hora) values ( 23.0, 233.0, 30.0, 'Tempo seco','15/11/2019', 10.35);
	insert into dias (semana) values ('Terca');
	insert into cidades (nome,latitude, longitude) values ('São Paulo' , 99.88, 77.66);	
	
	update previsoes set dia = 2 where id = 2;
	update previsoes set cidade_id = 2 where id = 2;
	update dias set previsao = 2 where id = 2;
-----------------------------------------------------------------------------------------------------------------------------------
	insert into previsoes (min, max, hum, des, data, hora) values (10.0, 18.0, 63.0, 'Frio','16/11/2019', 19.15);
	insert into dias (semana) values ('Quarta');
	insert into cidades (nome,latitude, longitude) values ('Barueri', 01.23, 45.67);

	
	update previsoes set dia = 3 where id = 3;
	update previsoes set cidade_id = 3 where id = 3;
	update dias set previsao = 3 where id = 3;

	--adicione um usuário
	insert into usuario (id, login, senha) values (1, 'admin', 'admin');


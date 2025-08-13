# Json para teste do POST
{ 
	"nome": "Fernando Cunha", 
	"email": "fernando.cunha@med.com",
	"telefone":"4399401829",
	"crm": "123458", 
	"especialidade": "ORTOPEDIA", 
	"dadosEndereco": 
		{
			"logradouro": "Rua das Esmeraldas",
			"bairro": "Pedras preciosas", 
			"cep": "12345678",
			"cidade": "Brasília",
			"uf": "DF",
			"numero":"1",
			"complemento":"casa" 
		} 
}

﻿# Json para teste do PUT
 {
	"id":1,
	"nome": "Rodrigo Cunha Ferreira",
	"email": "rodrigo.ferreira@med.com"
}
### Requisição com 5 registros da página 2, ordenados pelo e-mail e de maneira decrescente
http://localhost:8080/medicos?tamanho=5&pagina=1&ordem=email,desc

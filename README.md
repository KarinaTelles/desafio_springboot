# Json para teste do POST
 {
	"nome": "Fernando Cunha",
	"email": "fernando.cunha@med.com",
	"crm": "123458",
	"especialidade": "ORTOPEDIA",
	"dadosEndereco":
	{
		"logradouro": "Rua das Esmeraldas",
		"bairro": "Pedras preciosas",
		"cep": "123456789",
		"cidade": "Brasília",
		"uf": "DF",
		"numero":"1",
		"complemento":"casa"
	}
}
## Requisição com 5 registros da página 2, ordenados pelo e-mail e de maneira decrescente
http://localhost:8080/medicos?tamanho=5&pagina=1&ordem=email,desc

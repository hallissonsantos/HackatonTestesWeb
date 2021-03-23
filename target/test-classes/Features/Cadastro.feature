#language: pt
@Cadastro @E2E
Funcionalidade: Cadastro

  Contexto: 
    Dado que o usuario esteja na pagina inicial do sistema

  Esquema do Cenario: Realizar cadastro com sucesso
    Quando o usuario clicar no botao Cadastre-se
    E preencher o campo nome como "<Nome>"
    E preencher o campo Idade como "<Idade>"
    E informar data de inicio como "<DataInicio>"
    E informar data de Finalizacao como "<DataFinal>"
    E preencher o campo Telefone como "<Telefone>"
    E preencher o campo Sexo como "<sexo>"
    E preencher o campo e-mail como "<email>"
    E selecionar se ja atuou ou atua na area de Ti
    E preencher o campo Usuario como "<Usuario>"
    E preencher o campo senha como "<senha>"
    E clicar no botao Registrar
    Entao sistema deve cadastrar o usuario com sucesso e exibir uma mensagem de confirmacao

    Exemplos: 
      | Nome  | Idade | DataInicio | DataFinal | Telefone | sexo   | email       | Usuario | senha      |
      | joao  |    25 |   26102021 |  10122021 |   123456 | Outros | emai1lteste | jose12  | jose123456 |
      | erick |    25 |   26102021 |  10122021 |   123456 | Outros | emai1lteste | erick10 |     123456 |
      | Hall  |    25 |   26102021 |  10122021 |   123456 | Outros | emai1lteste | Hall    | asdfqwer   |
      | zoro  |    25 |   26102021 |  10122021 |   123456 | Outros | emai1lteste | zoro    | asdfqwer   |

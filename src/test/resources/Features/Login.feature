#language: pt
@E2E @login
Funcionalidade: Login

  Contexto: 
    Dado que o usuario esteja na pagina inicial do sistema

  @loginValido @E2E
  Esquema do Cenario: Realizar Login com credenciais validas
    Quando o usuario preencher o campo usuario com "<usuario>"
    E preencher o campo senha com "<senha>"
    E clicar no botao de Login
    Entao o sistema ira exibir a tela inicial e uma mesnagem de boas vindas

    Exemplos: 
      | usuario | senha      |
      | jose12  | jose123456 |
      | erick10 |     123456 |
      | Hall    | asdfqwer   |
      | zoro    | asdfqwer   |
 

  @loginInvalido
  Esquema do Cenario: Mostrar alerta de erro ao tentar logar com credenciais invalidas
    Quando o usuario preencher o campo usuario como"<usuario>" invalido
    E preencher o campo senha com "<senha>" invalida
    E clicar no botao de Login
    Entao o sistema ira exibir um alerta mostrando uma mesnagem de erro

    Exemplos: 
      | usuario  | senha      |
      | jose1212 | jose123456 |

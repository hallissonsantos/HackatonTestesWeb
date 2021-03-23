#language: pt
@logout @E2E
Funcionalidade: Logout

  Contexto: 
    Dado que o usuario esteja na pagina inicial do sistema
    E que usuario esteja logado

  Cenario: Realizar Logout com sucesso
    Quando o usuario clicar no menu Logout
    Entao o sistema ira deslogar da conta do usuario e reornar a tela de Login

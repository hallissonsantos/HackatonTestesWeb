#language: pt
@Deletar @E2E
Funcionalidade: Deletar

Contexto: 
    Dado que o usuario esteja na pagina inicial do sistema
    E que usuario esteja logado
   
    
    Cenario: Deletar usuario do sistema
    
    Quando o usuario clicar no menu Usuarios
    E clicar no botao delete de um usuario
    E clicar em OK na caixa de confirmacao
    Entao o usuario deletado deve ser apagado da lista de usuarios
    

#language: pt
@Editar @E2E
Funcionalidade: Alterar dados do Usuario

  Contexto: 
    Dado que o usuario esteja na pagina inicial do sistema
    E que usuario esteja logado
    E que esteja na pagina Lista de usuarios

  Cenario: Alterar Nome e Telefone do usuario
    Quando o usuario clicar no botao editar
    E alterar o campo nome
    E alterar o campo telefone
    E marcar se ja atuou em TI
    E e clicar no botao Register
    Entao o sistema exibe um alerte com a mensagem Atualizado com sucesso

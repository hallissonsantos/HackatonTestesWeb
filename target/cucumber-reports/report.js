$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Deletar.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Deletar",
  "description": "",
  "id": "deletar",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@Deletar"
    },
    {
      "line": 2,
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "duration": 3002995900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que o usuario esteja na pagina inicial do sistema",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "que usuario esteja logado",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroSteps.que_o_usuario_esteja_na_pagina_inicial_do_sistema()"
});
formatter.result({
  "duration": 1892495900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.que_usuario_esteja_logado()"
});
formatter.result({
  "duration": 862310000,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Deletar usuario do sistema",
  "description": "",
  "id": "deletar;deletar-usuario-do-sistema",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 12,
  "name": "o usuario clicar no menu Usuarios",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "clicar no botao delete de um usuario",
  "keyword": "E "
});
formatter.step({
  "line": 14,
  "name": "clicar em OK na caixa de confirmacao",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "o usuario deletado deve ser apagado da lista de usuarios",
  "keyword": "Entao "
});
formatter.match({
  "location": "DeletarSteps.o_usuario_clicar_no_menu_Usuarios()"
});
formatter.result({
  "duration": 634966300,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Usuario nao existe}\n  (Session info: chrome\u003d89.0.4389.90): Usuario nao existe\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:48\u0027\nSystem info: host: \u0027LAPTOP-2VUA3DAF\u0027, ip: \u0027192.168.1.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 89.0.4389.90, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\heric\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:55174}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: fc392b64680d803403227eac56a6166c\n*** Element info: {Using\u003dxpath, value\u003d/html/body/app/nav/div[2]/a[2]}\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat utils.Utils.esperarElemento(Utils.java:18)\r\n\tat pageobjects.DeletarPage.listaDeUsuarios(DeletarPage.java:30)\r\n\tat stepdefinitions.DeletarSteps.o_usuario_clicar_no_menu_Usuarios(DeletarSteps.java:16)\r\n\tat ✽.Quando o usuario clicar no menu Usuarios(Features/Deletar.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DeletarSteps.clicar_no_botao_delete_de_um_usuario()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DeletarSteps.clicar_em_OK_na_caixa_de_confirmacao()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DeletarSteps.o_usuario_deletado_deve_ser_apagado_da_lista_de_usuarios()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 686784800,
  "status": "passed"
});
});
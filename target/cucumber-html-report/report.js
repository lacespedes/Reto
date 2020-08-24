$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/TasaInterese.feature");
formatter.feature({
  "name": "Buscar tarifario.",
  "description": "",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@Regresion"
    }
  ]
});
formatter.scenario({
  "name": "Tasas de interés y montos mínimos de apertura de Depósitos.",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@Regresion"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que el Usuario ingreso al portal web",
  "keyword": "Dado "
});
formatter.match({
  "location": "IngresoPortalWebStepDefinition.queElUsuarioIngresoAlPortalWeb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "busca el tarifario",
  "keyword": "Cuando "
});
formatter.match({
  "location": "TasaIntereseMontosMinimosAperturaDepositosStepDefinitions.buscaTarifario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Descarga el documento Tasas de interés y montos mínimos de apertura de Depósitos",
  "keyword": "Entonces "
});
formatter.match({
  "location": "TasaIntereseMontosMinimosAperturaDepositosStepDefinitions.descargaDocumen()"
});
formatter.result({
  "status": "passed"
});
});
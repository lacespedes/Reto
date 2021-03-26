  #language:es
@Regresion
Característica: Conversor de tasas de interes.
  Escenario: Conversor tasa nominal a efectiva.
    Dado que el Usuario ingreso al portal web
    Cuando busca el conversor de tasas de interes para negocios
      Y selecciona tasa nominal a tasa efectiva con tasa de interes 20 periodicidad Semestral y capitalizacion Anual
    Entonces revisa que el valor esperado es 9.54%



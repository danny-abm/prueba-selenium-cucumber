Feature: Busqueda en el sitio google

Background: Navegacion al sitio de  google
    Given Como usuario nabego el sitio web de google

    Scenario: Busqueda de la palabra pinguino con el boton buscar en google
    When como usuario busco la palabra pinguino
    And Como usuario doy click en el boton buscar
    Then Espero que se visualize el elemento con el texto Spheniscidae

    Scenario: Busqueda de la palabra ping pong al dar enter
    When como usuario busco la palabra ping pong
    And Como usuario doy enter
   
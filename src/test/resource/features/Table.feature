@Table
Feature: Vamos a realizar test a una tabla estatica

Background: Como usuaruio navego a la web de la tabla
    Given Navego al sitio web de la tabla estatica

Scenario: Validar el valor que retorna la celda fila 5 columna 2
    Then Retorno el valor de la celda fila 5 columna 2

Scenario: Validar que la tabla se muestre en la pagina
        Then Como usuario valido si la tabla se muestra en la pagina

Scenario: Modificar el valor de la celda fila 4 columna 1
    When Como usuario modifico el valor de la celda
    Then Como usuario valido el nuevo valor de la celda
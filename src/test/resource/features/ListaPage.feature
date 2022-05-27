
@List
Feature: Busqueda una ciudad de acurdo al estato a que pertenece
    Scenario Outline: Testear si se encuentra una ciudad al escribir el estado al que pertenece
    Given Como usuario navego al sitio web de la lista
    When como usuario busco un <estado> en la lista
    Then como usuario encuentro la <ciudad> de la lista

    Examples:
        | estado      | ciudad              | 
        | New York    | Yonkers, New York   | 
        | California  | Oakland, California |
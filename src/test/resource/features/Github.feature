@Git
Feature: Busqueda en el sitio github
    Scenario: Busqueda de la palabra danny-abm con enter en github
    Given Como usuario navego el sitio web de github
    When como usuario busco la palabra danny-abm
    And Como usuario doy enter Git
    Then Espero que se visualize el elemento con el texto danny-abm


    Scenario: Buscar usuarios con danny-abm
    And Como usuario doy click en el users
    Then Espero que se visualize el elemento con el texto Danny Barton

    
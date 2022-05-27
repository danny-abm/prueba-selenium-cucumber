@Login
Feature: Comprobar una autenticacion de login

Background: Como usuaruio navego a la web del login
    Given Como usuario navego el sitio del login

Scenario Outline: Validar el login exitoso
    When Como usuario ingreso un <usuario>
    And Como usuario ingreso una <password>
    And Como usuario doy click en el boton de loguin
    Then Como usuario valido que el login sea exitoso

    Examples:
        | usuario   | password              |
        | tomsmith  | SuperSecretPassword!  | 

Scenario Outline: Validar el login Fallido
    When Como usuario ingreso nuevamente un <usuariof>
    And Como usuario ingreso nuevamente una <passwordf>
    And Como usuario doy click nuevamente en el boton de loguin
    Then Como usuario valido el login 

    Examples:
        | usuario   | password |
        | usuario   | usuario  | 
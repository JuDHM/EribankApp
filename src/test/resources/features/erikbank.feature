
@Regression
Feature: Title of your feature
  I want to use this template for my feature file

  @CasoExitoso
  Scenario Outline: Ejecutar un pago exitoso a traves de la app Eribank
    Given Juan abre la app de eribank
    |<IDCASO>|<USUARIO>|<PASSWORD>|<TELEFONO>|<NOMBRERECAUDADOR>|<VALOR>|<CIUDAD>|
    And Juan se autentica correctamente
    When Juan realiza la ejecucion del pago
    Then Juan verifica el mensaje exitoso de la transaccion
    
    Examples:
    |IDCASO|USUARIO|PASSWORD|TELEFONO|NOMBRERECAUDADOR|VALOR|CIUDAD|
    |1|company|company|36567|JULIO ANDRADE|2350|COLOMBIA|
  
  @CasoAlterno
	Scenario Outline: Ejecutar una autenticacion fallida de la app Eribank
  Given Juan abre la app de eribank
  |<IDCASO>|<USUARIO>|<PASSWORD>|<TELEFONO>|<NOMBRERECAUDADOR>|<VALOR>|<CIUDAD>|
  And Juan se autentica con errores
  Then Juan verifica el mensaje esperado
  
  Examples:
  |IDCASO|USUARIO|PASSWORD|TELEFONO|NOMBRERECAUDADOR|VALOR|CIUDAD|
  |1|company|compuny|36567|JULIO ANDRADE|2350|COLOMBIA|
  
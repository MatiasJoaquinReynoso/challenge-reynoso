#Author: Matias Reynoso
#Date: 07/08/2023
#Description: Funcionalidad Inventario.
#OS: Windows 10
#Browser: Chrome
#ID Caso: 2
#Result: Pass
@SmokeFeature
Feature: Probar la funcionalidad de agregar items al carro de compras.

@smoketest
Scenario: Loguear correctamente y agregar un item al carro de compras.

Given el usuario ingresa al sitio web sauce demo.
When usuario ingresa Usuario y Contraseña correctamente.
When hace click en el boton login.
Then una vez redirigido al sitio correspondiente, el usuario hace click en un item.
Then debe figurar la cantidad seleccionada en el carro de compras.

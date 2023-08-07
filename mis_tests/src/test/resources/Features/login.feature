#Author: Matias Reynoso
#Date: 07/08/2023
#Description: Funcionalidad Login.
#OS: Windows 10
#Browser: Chrome
#ID Caso: 1
#Result: Pass
@SmokeFeature
Feature: Probar la funcionalidad del login.

@smoketest
Scenario: Probar el login sea correcto ingresando las credenciales validas.

Given el usuario se encuentra en la ventana de login del sitio web sauce demo.
When usuario ingresa <Usuario> y <Contraseña>
When hace click en el boton login
Then el usuario es redirigido a la ventana de inventario.


 Examples: 
 	| Usuario         | Contraseña   |
  | standard_user   | secret_sauce |

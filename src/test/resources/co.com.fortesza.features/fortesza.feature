#autor: lizeth

@Hu02
Feature: Verificar login en la pagina de fortesza con el usuario
  yo como usuario
  Quiero ingresar al ambiente de staging de fortesza
  para verificar el inicio de sesion con el  usuario

  @Caso1
  Scenario Outline: Verificar el ingreso correcto del usuario
    Given el usuario ingresa al ambiente de staging
    When digita usuario y contrasena
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |

    Then verifica que ingrese correctamente
    Examples:
      | usuario                 | contrasena |
      | lizeth13@mailinator.com | Liz123456. |



  @Caso2
  Scenario Outline: Verificar que si se ingresa un usuario que no es correcto no permita hacer el login
    Given el usuario ingresa al ambiente de staging
    When digita usuario y contrasena erradas
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |

    Then verifica que no permita el ingreso a la pagina de fortesza
    Examples:
      | usuario                | contrasena |
      | natalia@mailinator.com | 123456789  |



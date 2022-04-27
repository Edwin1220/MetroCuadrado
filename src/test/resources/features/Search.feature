#Busqueda en metro cuadrado con parametros
#25/04/2022
Feature: Search offices with bathroom filters and meters

  Scenario Outline: search offices
    Given open navegator
    When select type property list <typeProperty> business <typeBusiness> search location <location>
    And fill out form filter init mont <initMont> from mont <endPrice> amount bathroom <bathroom> and area <area> end area <areaEnd>
    Then Validate <area> <bathroom>

    Examples: 
      | typeProperty | typeBusiness         | location  | initMont  | endPrice  | bathroom | area  | areaEnd |
      | Oficinas     | Compra Nuevo y Usado | Bogotá D. | 100000000 | 500000000 |        2 | 60 m2 | 200 m2  |

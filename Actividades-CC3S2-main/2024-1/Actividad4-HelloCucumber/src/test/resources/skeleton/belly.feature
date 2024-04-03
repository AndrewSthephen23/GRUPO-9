Feature: BellyFeature

  #Caso de prueba 01 (<10 eatenCucumbers && >=2 timeWaited)
Scenario: eaten many cukes and growl
  Given I have eaten 27 cukes
  When I wait 2 hour
  Then my Belly should Growl

Scenario: eaten many cukes and not growl
  Given I have eaten 27 cukes
  When I wait 1 hour
  Then my belly should not Growl




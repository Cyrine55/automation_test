@Authentification
Feature: Authentification
  En tant quer utilisateur je souhaite m'authentifier

  @login-valid
  Scenario: Je souhaite tester la page LOGIN
    Given Je visite l'application NopCommerce
    When Je saisi l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home

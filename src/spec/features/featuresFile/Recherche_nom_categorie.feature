@categoriename
Feature: Recherche nom categorie
  ETQ utilisateur je souhaite chercher le nom du categorie

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisi l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login

  @categorieName
  Scenario: Je souhaite chercher le nom du categorie
    When Je clique sur Categories
    When Je saisis le nom du categorie "Computers"
    When Je clique sur le bouton search de computer

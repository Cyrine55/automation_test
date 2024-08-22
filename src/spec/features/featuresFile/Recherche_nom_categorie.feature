@categoriename
Feature: Recherche nom categorie
  ETQ utilisateur je souhaite chercher le nom du categorie

  @categorieName
  Scenario: Je souhaite chercher le nom du categorie
    Given Je visite l'application NopCommerce
    When Je saisi l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    When Je clique sur Catalog
    When Je clique sur Categories
    When Je saisis le nom du categorie "Computers"
    When Je clique sur le bouton search de computer
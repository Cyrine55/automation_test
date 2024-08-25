@productname @tnr
Feature: Recherche nom produit
  ETQ utilisateur je souhaite chercher le nom du produit

  Background: 
    Given Je visite l'application NopCommerce
    When Je saisi l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login

  @productName
  Scenario: Je souhaite chercher le nom du produit
    When Je clique sur Catalog
    When Je clique sur Products
    When Je saisis le nom du produit "parfum"
    When Je clique sur le bouton search

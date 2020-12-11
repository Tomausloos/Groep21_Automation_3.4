Feature: View All Meals


    Scenario: All meals are shown
      Given There are meals on the menu
      When “Jan” looks at the menu
      Then All meals that are on the menu are shown.

    Scenario: No meals are shown because no meals are on the menu
      Given There are no meals on the menu
      When “Jan” looks on the menu
      Then “Jan” will get notified there currently are no meals present on the menu


    Scenario: The necessary information about allergies is present
      Given a sandwich brie contains nuts
      When “Jan” looks at the menu
      Then next to the sandwich brie “Jan” will see the meal may contains nuts

    Scenario: The necessary information about whether meals are vegetarian is present
      Given a sandwich ‘Veggielicious’ is vegetarian
      When “Jan” looks at the menu
      Then next to the sandwich “Jan” will see this sandwich is vegetarian.


    Scenario: All prices are present
      Given a sandwich Martino costs three fifty and a Lasagna costs five
      When “Jan” looks at the menu
      Then “Jan” will see: Broodje Martino: two euros Lasagna: five euros


    Scenario: Het menu is opgedeeld in categorieën
      Given de maaltijden zijn gesorteerd per categorie
      When “Jan” het menu bekijkt
      Then “Jan” heeft een duidelijk overzicht per categorie

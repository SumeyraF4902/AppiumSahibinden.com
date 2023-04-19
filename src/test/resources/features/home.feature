@Sahibinden
  Feature: Sahibinden


    @CheckResult
    Scenario:  Check Search Results
      Given user should see the home page
     When  user taps "Emlak" on Home Page
     When  user taps "Konut" on Categories Page
     When  user taps "Satılık" on Categoriess Page
     When  user taps "Daire" on Categories Page
      When taps "Devam Et" button on Popup
      When taps "İZİN VERME" buttonn on Popup
      Then user should see Results on Result Page

#language: en
@withdrawal
  Feature: test part

    Scenario: Transition to the block of information about transmitted data

      Given Users open page "https://www.delivery-club.ru/"
      When Users clicks on a button "Вход"
      And Users clicks on "Передаваемые данные"
      Then A popup opens with information about the transmitted data



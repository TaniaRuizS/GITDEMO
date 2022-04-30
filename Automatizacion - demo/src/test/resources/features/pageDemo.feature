# Autor: Tania Ruiz Sanchez
  @stories
  Feature: pageDemo
    As a user I want to fill in data on the page demo automation testing to register and verify a component

    @scenario1
    Scenario Outline: Enter data to register
      Given tania wants to register in demo automation testing
      When she enters the data in the form
        | firstname   | lastname   | address   | email   | phone   | gender   | hobbies   | selectcountry   | year   | month   | day   | password1   | password2   |
        | <firstname> | <lastname> | <address> | <email> | <phone> | <gender> | <hobbies> | <selectcountry> | <year> | <month> | <day> | <password1> | <password2> |

      Then she loads the information in the Submit button

      Examples:
        | firstname | lastname | address   | email              | phone      | gender | hobbies        | selectcountry | year | month | day | password1  | password2  |
        | Tania     | Ruiz     | Av Japon  | tania@hotmail.com  | 3103900118 | Male   | Cricket-Movies | Japan         | 1995 | April | 10  | Tania123*  | Tania123*  |
        | Patricia  | Sanchez  | Av cuba   | tania1@hotmail.com | 3103900120 | FeMale | Movies-Hockey  | india         | 1966 | April | 30  | Tania1234* | Tania1234* |
        | Dino      | Perez    | Av Dosque | dino1@hotmail.com  | 3103900121 | Male   | Hockey-Movies  | Denmark       | 1966 | April | 21  | Tania1234* | Tania1234* |

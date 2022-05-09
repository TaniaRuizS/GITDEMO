# Autor: Tania Ruiz Sanchez
@stories
Feature: pageDemo
  As a user I want to fill in data on the page demo automation testing to register and verify a component

  Background:
    Given tania wants to register in demo automation testing

  @scenario1
  Scenario Outline: Enter data to register

    When she enters the data in the form
      | firstname   | lastname   | address   | email   | phone   | gender   | hobbies   | languajes   | skills   | country   | selectcountry   | year   | month   | day   | password1   | password2   |
      | <firstname> | <lastname> | <address> | <email> | <phone> | <gender> | <hobbies> | <languajes> | <skills> | <country> | <selectcountry> | <year> | <month> | <day> | <password1> | <password2> |

    Then she loads the information in the Submit button
      | selectcountryR   |
      | <selectcountryR> |

    Examples:
      | firstname | lastname | address   | email              | phone      | gender | hobbies        | languajes      | skills | country        | selectcountry | year | month | day | password1  | password2  | selectcountryR   |
      | Tania     | Ruiz     | Av Japon  | tania@hotmail.com  | 3103900118 | Male   | Cricket-Movies | Japanese-Malay | C      | Select Country | Japan         | 1995 | April | 10  | Tania123*  | Tania123*  | Select Country\n |
      | Patricia  | Sanchez  | Av cuba   | tania1@hotmail.com | 3103900120 | FeMale | Movies-Hockey  | Malay          | C++    | Select Country | india         | 1966 | April | 30  | Tania1234* | Tania1234* | Select Country\n |
      | Dino      | Perez    | Av Dosque | dino1@hotmail.com  | 3103900121 | Male   | Hockey-Movies  | Persian        | Linux  | Select Country | Denmark       | 1966 | April | 21  | Tania1234* | Tania1234* | Select Country\n |

  @scenario2
  Scenario Outline: Verify the creation of a successful Registration only by entering the required fields

    When She enters the data in the required fields
      | firstname   | lastname   | email   | phone   | gender   |country   |
      | <firstname> | <lastname> | <email> | <phone> | <gender> |<country> |

    Then All required fields must be select and completed

      | selectcountryR   |
      | <selectcountryR> |

    Examples:
      | firstname | lastname | email              | phone      | gender | country        | selectcountryR   |
      | Tania     | Ruiz     | tania@hotmail.com  | 3103900118 | Male   | Select Country | Select Country\n |
      | Patricia  | Sanchez  | tania1@hotmail.com | 3103900120 | FeMale | Select Country | Select Country\n |
      | Dino      | Perez    | dino1@hotmail.com  | 3103900121 | Male   | Select Country | Select Country\n |

  @scenario3
  Scenario Outline: Verify that it is not allowed to create the record by entering invalid data

    When She enters invalid data in the form
      | firstname   | lastname   | address   | email   | phone   | gender   | hobbies   | languajes   | skills   | country   | selectcountry   | year   | month   | day   | password1   | password2   |
      | <firstname> | <lastname> | <address> | <email> | <phone> | <gender> | <hobbies> | <languajes> | <skills> | <country> | <selectcountry> | <year> | <month> | <day> | <password1> | <password2> |

    Then She enters the invalid data in all the fields

      | selectcountryR   |
      | <selectcountryR> |

    Examples:
      | firstname | lastname | address   | email              | phone      | gender | hobbies        | languajes      | skills | country        | selectcountry | year | month | day | password1  | password2  | selectcountryR   |
      | Tania     | Ruiz     | Av Japon  | tania@hotmail.com  | 3103900118 | Male   | Cricket-Movies | Japanese-Malay | C      | Select Country | Japan         | 1995 | April | 10  | Tania123*  | Tania123*  | Select Country\n |
      | Patricia  | Sanchez  | Av cuba   | tania1@hotmail.com | 3103900120 | FeMale | Movies-Hockey  | Malay          | C++    | Select Country | india         | 1966 | April | 30  | Tania1234* | Tania1234* | Select Country\n |
      | Dino      | Perez    | Av Dosque | dino1@hotmail.com  | 3103900121 | Male   | Hockey-Movies  | Persian        | Linux  | Select Country | Denmark       | 1966 | April | 21  | Tania1234* | Tania1234* | Select Country\n |


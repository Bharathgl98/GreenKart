Feature: Search and place the order for products
@offersPage
Scenario Outline: Search Experience for product search in both home and offers page

Given User is on GreenKart Landing page
When User searched with shortname <Name> and extracted actual name of product
Then User serached for <Name> shotname in offers page 
And validate product name in offers page match with Landing page  

Examples:
| Name|
| Tom |
| Beet|

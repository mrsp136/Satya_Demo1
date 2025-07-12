Feature: E-commerce Application

 # 🧪 Login scenarios (valid and invalid)
  Scenario Outline: Login scenarios
    Given Landed on Login page
    When Enter valid "<UserId>" and "<Password>" 
    And Click on Login button
    Then User Navigate to next page

 
  
    Examples: 
      |   UserId        | Password    |
      |  srp@gmail.com  | Parida123   | 
      |  srp@gmail1.com | Parida123   |
      
      
      
      
    # 🛒 Add product to cart 
    @smoke
  Scenario Outline: Add Product to the cart
    Given User is logged in with valid credential
    When User add "<Product>" to the cart
    Then Product should appear in the cart
    
    Examples: 
    |Product      |
    |IPHONE 13 PRO|
    
    
    
      
      
      
   
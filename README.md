## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com

#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/

#### Expectations
We will be evaluating
1. Quality of test cases
2. Variety  of testing types (examples: boundary, happy path, negative, etc)
3. Code structure and organization
4. Naming conventions
5. Code readability
6. Code modularity

#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

#### Test Cases

   #### HappyPath:
1. place small 6 slices no topping pizza-quantity 1- PAYMENT INFORMATION- creditcard
2. place Small 6 Slices - 1 topping-quantity 1 - PAYMENT INFORMATION- creditcard
3. place Medium 8 Slices - 2 toppings-quantity 1- PAYMENT INFORMATION- creditcard
4. place Large 10 Slices - no toppings-quantity 1- PAYMENT INFORMATION- creditcard
5. place Large 10 Slices - 2 toppings-quantity 1- PAYMENT INFORMATION- creditcard
6. place small 6 slices no topping pizza-quantity 2- PAYMENT INFORMATION- creditcard
7. place Small 6 Slices - 1 topping-quantity 2- PAYMENT INFORMATION- creditcard
8. place Medium 8 Slices - 2 toppings-quantity 2- PAYMENT INFORMATION- creditcard
9. place Large 10 Slices - no toppings-quantity 2- PAYMENT INFORMATION- creditcard
10. place Large 10 Slices - 2 toppings-quantity 2- PAYMENT INFORMATION- creditcard
11. place small 6 slices no topping pizza-quantity 1- PAYMENT INFORMATION- Cash on Pickup
12. place Small 6 Slices - 1 topping-quantity 1 - PAYMENT INFORMATION- Cash on Pickup
13. place Medium 8 Slices - 2 toppings-quantity 1- PAYMENT INFORMATION- Cash on Pickup
14. place Large 10 Slices - no toppings-quantity 1- PAYMENT INFORMATION- Cash on Pickup
15. place Large 10 Slices - 2 toppings-quantity 1- PAYMENT INFORMATION- Cash on Pickup
16. place small 6 slices no topping pizza-quantity 2- PAYMENT INFORMATION- Cash on Pickup
17. place Small 6 Slices - 1 topping-quantity 2- PAYMENT INFORMATION- Cash on Pickup
18. place Medium 8 Slices - 2 toppings-quantity 2- PAYMENT INFORMATION- Cash on Pickup
19. place Large 10 Slices - no toppings-quantity 2- PAYMENT INFORMATION- Cash on Pickup
20. place Large 10 Slices - 2 toppings-quantity 2- PAYMENT INFORMATION- Cash on Pickup
21.  place small 6 slices no topping pizza-quantity 1- And do a Reset
22. place Small 6 Slices - 1 topping-quantity 1 - And do a Reset
23. place Medium 8 Slices - 2 toppings-quantity 2- And do a Reset
24. place Large 10 Slices - no toppings-quantity 2- And do a Reset
25. place Large 10 Slices - 2 toppings-quantity 15- And do a Reset

  #### Negative:
1. place small 6 slices no topping pizza- with toppings
2. place Small 6 Slices - 1 topping pizza - add two toppings
3. place Medium 8 Slices - 2 toppings pizza - add only one topping
4. place small 6 slices no topping pizza - with quantity other than integer
5. place Medium 8 Slices - 2 toppings pizza- without payment information
6. place small 6 slices no topping pizza- without payment information
7. place Medium 8 Slices - 2 toppings pizza- without payment information
8. place Large 10 Slices - no toppings pizza- without payment information
9. place Medium 8 Slices - 2 toppings pizza- without PICKUP INFORMATION
10. place small 6 slices no topping pizza- without PICKUP INFORMATION
11. place Medium 8 Slices - 2 toppings pizza- without PICKUP INFORMATION
12. place Large 10 Slices - no toppings pizza- without quantity
13. place Medium 8 Slices - 2 toppings pizza- without quantity
14. place small 6 slices no topping pizza- without quantity
15. place Medium 8 Slices - 2 toppings pizza- without quantity

 


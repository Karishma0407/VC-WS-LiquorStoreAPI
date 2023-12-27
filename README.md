# Liquor Store API

(Midterm)

## Requirements

1.Create a Spring Boot project named LiquorStoreAPI.

2.Respect the following configuration:
-Spring boot 3.1.x
-Packaging “jar”
-Java version: 17

3.Your project should register Customers for a liquor store using HTTP methods
The consumer must provide a JSON object containing the following data: Name, Last name, Age, Email and Address.

4.If the customer’s age is less than 18, show an error message saying that the application cannot register and do not add this customer to the database.

5.After the registration we should be able to see the entire list of customers using the following HTTP request: “http://localhost:8080/customers/”.

6.Implement Unit Test to test your business logic. It will be considered only meaningful tests.

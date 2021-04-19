# kevdemo
Sample API Testing Project
I wrote a very basic REST API in Java to return a JSON payload with 2 fields: a message with the string "Welcome to the machine" and a timestamp of the current time in ISO 8601 format.  I used Java Springboot to do this and used their guides at https://spring.io/guides to implement the REST service as well as the testing strategies.


I used SpringMvc and JUnit5 to write unit and component tests:

  KevdemoApplicationTests.java    - Verifies that the spring application loads
  
  SmokeTest.java                  - Verifies that the spring application is creating the controller
  
  ContextTest.java                - Fires up the application and sends an HTTP request to verify the expected response
  
  WebLayerTest.java.              - Uses Spring MockMvc to verify functions on the weblayer without running the server
  


Additionally I implemented a basic E2E test using Karate from the command line while the application is running locally.  

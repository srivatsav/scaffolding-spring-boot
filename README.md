# Scaffolding-Spring-Boot

This is a scaffolding for any spring boot project. Please refer to the below working example to use the repository.

Start the Server using:
` mvn spring-boot:run`

Start the server without running any tests using:
`mvn spring-boot:run -DskipTests`

# Working Example :
After you start the server, You can try hitting a dummy API already wired into controller.
This should give you a String response in return.

Request :
http://localhost:8081/dummy?name=dummy

Response :
Hello dummy!

# NOTE :
```The default port of the application server is configured to 8081. You can change accordingly.```

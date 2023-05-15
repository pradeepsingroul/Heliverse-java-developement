# Heliverse-java-developement
This is the basic project where User can create Quize, User can get the result , get the quize, Etc in this this project i implemented the basic CRUD operations;

## ER Diagram
![ER File](https://github.com/pradeepsingroul/Heliverse-java-developement/assets/104360276/14b6e63a-c941-4c51-960e-e182c9cb3164)

## Features && ## Rest Api
 
new Quiz 
 ```PostMethod-
http://localhost:8080/quizzes
```

Get quize by id
```GetMethod-
http://localhost:8080/quizzes/{Id}
```

Get result by id
```GetMethod-
http://localhost:8080/quizzes/{Id}/result
```

 Get all quize
```GetMethod-
http://localhost:8080/quizzes/all
```

Get active quize
``` GetMethod-
http://localhost:8080/quizzes/active
```

 

## Tech Stack

- Core Java
- Spring Boot
- MySQL (RDBMS)
- Sql
- jpql
- Maven
- Swegger
- CRON job
- postman
- Giuhub


## Deployment

To deploy this project on localhost paste this below code in application.properties file in the 
resources and update according to your database name, username and password of your MySQL database.

```properties
 #changing the server port
server.port=8080

#db specific properties
spring.datasource.url=jdbc:mysql://localhost:3306/database
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=username
spring.datasource.password=password



#ORM s/w specific properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.mvc.throw-exception-if-no-handler-found=true
spring.web.resources.add-mappings=false

spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER

```
### Swagger UI - Link

Use this link to run it on browser.
```swagger
http://localhost:8080/swagger-ui/index.html
```

## Authors
- [Pradeep Singroul (@pradeepsingroul) ](https://github.com/pradeepsingroul)

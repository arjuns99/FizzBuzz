## Use JPA + Hibernate + MySQL in Spring Boot + bootsrap + jquery

See here for more informations: 



##set up project

-login to mysql using root and root

#run below command to create database

create database asset

- make sure you will have jdk install above than 1.7

-import project : do right click --> import -> existing maven project -> give the path of the code base and click on next then finish

-do the right click on Application.java and run as spring boot project


### Usage

- Run the application and go on http://localhost:8080/
- Use the following urls to invoke controllers methods and see the interactions
  with the database:

#asset list

http://localhost:8080/assets.jsp

#asset form

http://localhost:8080/


### Build and run

#### Configurations

Open the `application.properties` file and set your own configurations for the
database connection.

#### Prerequisites

- Java 7
- Maven 3

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run 
    
    or
    
    execute Application.java 

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.

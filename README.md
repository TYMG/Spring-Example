# Spring-Example

## Purpose: Provide a basic example of how Spring and Maven can be used to create a Spring MVC Web Application that can communicate with a Spring Annotation based RESTful Service.

* Message-Example: Spring MVC Application
  Runs at localhost:8081/SpringMVCExample/
  * Pages
      * View Messages - /messages
      * Create Message - /messages/form/
* Spring-Rest-Server-Backup: Spring REST Web Server
  Runs at localhost:8090 (The port can be changed)

Current Known Issues:
* Current hosted Git Repo (Spring-Example) is pretty wonky; may affect future pushes. May split projects into two separate repos to ease updates.
* Message-Example - The "get all messages" Service call made in MessageManager.getMessages() is not retrieving the message due to an issue with the RestTemplate configuration of the GET Request. Probably a URL issue. 

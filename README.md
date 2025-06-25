# CollabSpace Document Service 

# Document Collaboration Service

This is the backend for the document collaboration platform I’m building. The goal is to allow users to create, share, and edit documents collaboratively in real-time. Eventually, it will support comments, whiteboard collaboration, file organization, and analytics.

## Current File Structure

document-service
 ┣ src
 ┃ ┣ main
 ┃ ┃ ┣ java/com/collabdoc/documentservice
 ┃ ┃ ┃ ┣ Document.java            # Entity class
 ┃ ┃ ┃ ┣ DocumentRepository.java  # Repository layer
 ┃ ┃ ┃ ┣ DocumentService.java     # Business logic
 ┃ ┃ ┃ ┣ DocumentController.java  # REST API endpoints
 ┃ ┣ resources
 ┃ ┃ ┣ application.properties     # DB config
 ┣ pom.xml
 ┣ README.md.

## Stack

- Java 17+
- Spring Boot (currently using version 3.5.3)
- Spring Data JPA
- MySQL (for now using locally hosted db)
- Maven (for builds and dependency management)

## Setup Instructions

Make sure MySQL is running locally on port 3306 and create a new database:

```sql
CREATE DATABASE collabdoc;
```

Then update the following fields in `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/collabdoc
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

## Running the App

Build and run:

```
mvn clean install
mvn spring-boot:run
```

The app will start on `http://localhost:8080`.

## API Plan

For now, REST APIs are being created to handle:

- Create document
- Read document by ID
- List all documents
- Update document
- Delete document

These are available under `/api/documents`.

## To Do (Upcoming Work)

- Add JWT-based authentication
- Add Kafka for document events
- Add GraphQL endpoint for analytics
- Create frontend using React
- Unit testing with JUnit and Mockito
- Create collaboration engine with WebSockets
- Set up deployment using Docker and AWS

## Notes

Using VS Code to develop. Avoiding any platform-specific IDE files and keeping it clean for GitHub.


---

This README will be updated regularly as the project progresses.

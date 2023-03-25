# Building a JWT-Based Authentication System in Spring Boot | Secure Your Spring Boot App with JWT

[![Java: 17](https://img.shields.io/badge/Java-17+-green)](#)
[![Spring Boot: 3.0](https://img.shields.io/badge/Spring--Boot-3.0+-red)](#)
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

[![OneMinuteProgramming](https://img.shields.io/badge/OneMinuteProgramming-_-red?style=social&logo=youtube)](http://www.youtube.com/channel/UC7T7MMEhY8zYd6ekbDRdIhw?sub_confirmation=1)
[![YouTube Channel Subscribers](https://img.shields.io/youtube/channel/subscribers/UC7T7MMEhY8zYd6ekbDRdIhw?style=social)](http://www.youtube.com/channel/UC7T7MMEhY8zYd6ekbDRdIhw?sub_confirmation=1)
[![YouTube Channel Views](https://img.shields.io/youtube/channel/views/UC7T7MMEhY8zYd6ekbDRdIhw?style=social)](http://www.youtube.com/channel/UC7T7MMEhY8zYd6ekbDRdIhw?sub_confirmation=1)

[![YouTube Video](https://img.youtube.com/vi/prgFQ14QezY/0.jpg)](https://www.youtube.com/watch?v=prgFQ14QezY)

## Prerequisites
- JDK 17+
- Maven 3.3+

## Build for source
```shell
mvn install
```

## Run the application
```shell
java -jar ./target/app.jar
```

## Test the application
```shell
curl -L -i -X POST 'localhost:8080/login' --header 'Content-Type: application/json' --data-raw '{"userName": "test","password": "test2"}'
# Sample response 
# {"jwt":"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0IiwiaWF0IjoxNjc3Mjg5MTM0LCJleHAiOjE2NzcyOTI3MzR9.yMNQUZAX8oIYjVImffbBwY3Y_ZXejMLiefO-1SNPnGc"}


curl -L -i -X GET 'localhost:8080/hello' --header 'Authorization: Bearer <jwt_token>'
# e.g. 
# curl -L -i -X GET 'localhost:8080/hello' --header 'Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ0ZXN0IiwiaWF0IjoxNjc3Mjg5MTM0LCJleHAiOjE2NzcyOTI3MzR9.yMNQUZAX8oIYjVImffbBwY3Y_ZXejMLiefO-1SNPnGc' 

```
# DAILY SHEETS

## Purpose
To create an electronic daily sheet system to facilitate data exchange between parents and daycare providers. A daycare provider can add and update data for a child such as how much they ate, when their diaper was changed, and what activities they did that day. Then parents/guardians would be able to view that data for their child(ren).   

## Endpoints

| Method | Endpoint                                         | Description        | Request Body |   |
|--------|--------------------------------------------------|--------------------|--------------|---|
| GET    | /api/sheet/{sheetId}                             | view a child's dailysheet | none  |   |
| POST   | /api/sheet                                       | create a child's dailysheet | student info |   |
| PUT    | /api//sheet/{sheetId}                            | update a child's dailysheet | student info |   |
| GET    | /api/student                                     | get all students   | none         |   |
| POST   | /api/student                                     | create a student   | student info |   |
| PUT    | /api/student/{studentId}                         | update a student   | student info |   |
| DEL    | /api/student/{studentId}                         | delete a student   | none         |   |
| GET    | /api/classroom                                   | get all classrooms | none         |   |
| POST   | /api/classroom                                   | create a student   | class info   |   |
| PUT    | /api/classroom/{classroomId}                     | update a classroom | class info   |   |
| DEL    | /api/classroom/{classroomId}                     | delete a classroom | none         |   |

## Technology Used
- Java
- Spring Boot
- Maven
- PostgreSQL
- PgAdmin
- Postman

## Installation

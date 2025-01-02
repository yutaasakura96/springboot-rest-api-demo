# Spring Boot REST API

This project is a Spring Boot REST API designed to demonstrate fundamental RESTful API principles. The API includes endpoints for managing "Student" resources and a basic "Hello World" example. Below is an overview of the project's development history.

## Features

1. **Student Resource Management**
   - Retrieve, create, update, and delete student records.
   - Example endpoints include:
     - `/students`: Get all students.
     - `/students/{id}`: Retrieve a specific student by ID.
     - `/students/create`: Create a new student.
     - `/students/{id}/update`: Update a student's details.
     - `/students/{id}/delete`: Delete a student.

2. **Custom Headers and Response Customization**
   - Endpoints return `ResponseEntity` for flexible HTTP response handling.
   - Includes custom HTTP headers where applicable.

3. **Hello World Example**
   - A simple `/hello-world` endpoint for initial testing.

## Endpoints

| HTTP Method | Endpoint                         | Description                           |
|-------------|----------------------------------|---------------------------------------|
| `GET`       | `/hello-world`                  | Returns "Hello World".               |
| `GET`       | `/students`                     | Retrieves a list of all students.    |
| `GET`       | `/students/{id}`                | Retrieves a student by ID.           |
| `POST`      | `/students/create`              | Creates a new student.               |
| `PUT`       | `/students/{id}/update`         | Updates a student's details.         |
| `DELETE`    | `/students/{id}/delete`         | Deletes a student by ID.             |
| `GET`       | `/students/query`               | Retrieves a student using query parameters. |

## Development History

### Latest Updates
- **[ad658ff1]** - Refactor StudentController to simplify endpoint paths using `@RequestMapping`
  - Added `@RequestMapping("/students")` at the class level to streamline endpoint definitions.
  - Removed redundant "students" prefix from individual endpoint paths.
  - Improved URL consistency and readability.

- **[7e81addd]** - Refactor StudentController to use `ResponseEntity` for HTTP responses
  - Updated all endpoints to use `ResponseEntity`, allowing flexible HTTP response handling.
  - Added custom headers and improved response consistency.

### New Features
- **[a7be3813]** - Add DELETE endpoint to remove a student by ID
  - New endpoint: `/students/{id}/delete`.

- **[181550dc]** - Add PUT endpoint to update student details
  - New endpoint: `/students/{id}/update`.

- **[c14760a9]** - Add POST endpoint to create a student
  - New endpoint: `/students/create`.

- **[72304796]** - Add query parameter endpoint for student details
  - New endpoint: `/students/query`.

- **[916033cf]** - Add path variable endpoint for student details
  - New endpoint: `/students/{id}/{first-name}/{last-name}`.

### Initial Setup
- **[ebcec854]** - Add `/students` endpoint to retrieve all students.
- **[9a13888a]** - Add `/student` endpoint to retrieve a single student.
- **[abf8919b]** - Add `/hello-world` endpoint.
- **[ed802815]** - Initial commit.

## How to Run

1. Clone the repository:

   git clone https://github.com/your-repo/springboot-rest-api.git

2.	Navigate to the project directory:

  ```bash
  cd springboot-rest-api


3.	Build and run the project using Maven:

  ```bash
  mvn spring-boot:run


4.	Access the endpoints at http://localhost:8080.

Contributing

Feel free to fork this repository and submit pull requests. Contributions are welcome!

License

This project is licensed under the MIT License. See the LICENSE file for details.

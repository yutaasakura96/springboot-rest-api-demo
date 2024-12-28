package springboot.demo.springboot_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.demo.springboot_rest_api.bean.Student;


@RestController
public class StudentController {

  /**
   * HTTP GET request
   * URL - http://localhost:8080/student
   * @return
   */
  @GetMapping("/student")
  public Student getStudent() {
    Student student = new Student(
      1,
      "John",
      "Doe"
    );
    return student;
  }

}

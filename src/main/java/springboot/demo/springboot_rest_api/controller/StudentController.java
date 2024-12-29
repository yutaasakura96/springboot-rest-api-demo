package springboot.demo.springboot_rest_api.controller;

import java.util.ArrayList;
import java.util.List;

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

  /**
   * HTTP GET request
   * URL - http://localhost:8080/students
   * @return
   */
  @GetMapping("/students")
  public List<Student> getStudents() {
    List<Student> students = new ArrayList<>();
    students.add(new Student(1, "John", "Doe"));
    students.add(new Student(2, "Jane", "Doe"));
    students.add(new Student(3, "Tom", "Jerry"));
    students.add(new Student(4, "Jerry", "Tom"));
    students.add(new Student(5, "Alice", "Bob"));
    return students;
  }
}

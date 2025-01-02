package springboot.demo.springboot_rest_api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springboot.demo.springboot_rest_api.bean.Student;


@RestController
@RequestMapping("/students")
public class StudentController {

  /**
   * HTTP GET request
   * URL - http://localhost:8080/student
   * @return
   */
  @GetMapping("/student")
  public ResponseEntity<Student> getStudent() {
    Student student = new Student(
      1,
      "John",
      "Doe"
    );
    return ResponseEntity.ok().header("Custom-Header", "John").body(student);
  }

  /**
   * HTTP GET request
   * URL - http://localhost:8080/students
   * @return
   */
  @GetMapping
  public ResponseEntity <List<Student>> getStudents() {
    List<Student> students = new ArrayList<>();
    students.add(new Student(1, "John", "Doe"));
    students.add(new Student(2, "Jane", "Doe"));
    students.add(new Student(3, "Tom", "Jerry"));
    students.add(new Student(4, "Jerry", "Tom"));
    students.add(new Student(5, "Alice", "Bob"));
    return ResponseEntity.ok(students);
  }

  /**
   * SpringBoot REST API - Path Variable
   * HTTP GET request
   * URL - http://localhost:8080/students/1/John/Doe
   * @return
   */
  @GetMapping("/{id}/{first-name}/{last-name}")
   public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentId,
                                      @PathVariable("first-name") String firstName,
                                      @PathVariable("last-name") String lastName) {
     Student student = new Student(studentId, firstName, lastName);

     return ResponseEntity.ok(student);
   }

   /**
    * SpringBoot REST API - Request Param
    * HTTP GET request
    * URL - http://localhost:8080/students/query?id=1&firstName=John&lastName=Doe
    * @return
    */
    @GetMapping("query")
    public ResponseEntity<Student> studentRequestParam(@RequestParam int id,
                                       @RequestParam String firstName,
                                       @RequestParam String lastName) {
      Student student = new Student(id, firstName, lastName);
      return ResponseEntity.ok(student);
    }

    /**
     * SpringBoot REST API - Request Body
     * HTTP POST request
     * URL - http://localhost:8080/students
     * @return
     */
    @PostMapping("create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
      System.out.println(student.getId());
      System.out.println(student.getFirstName());
      System.out.println(student.getLastName());
      return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    /**
     * SpringBoot REST API - Request Body
     * HTTP PUT request
     * URL - http://localhost:8080/students/1/update
     * @return
     */
    @PutMapping("{id}/update")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable("id") int studentId) {
      System.out.println(student.getFirstName());
      System.out.println(student.getLastName());

      return ResponseEntity.ok(student);
    }

    /**
     * SpringBoot REST API - Path Variable
     * HTTP DELETE request
     * URL - http://localhost:8080/students/1/delete
     * @return
     */
    @DeleteMapping("{id}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") int studentId) {
      System.out.println(studentId);
      return ResponseEntity.ok("Student deleted successfully");
    }
}

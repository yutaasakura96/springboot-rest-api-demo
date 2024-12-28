package springboot.demo.springboot_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

  /**
   * HTTP GET request
   * URL - http://localhost:8080/hello-world
   * @return
   */
  @GetMapping("/hello-world")
  public String helloWorld() {
      return "Hello World";
  }

}

package com.example.kiselevalab1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class LabController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/numbers")
    public List<Integer> numbers() {
        return List.of(1, 2, 3, 4, 5);
    }
}
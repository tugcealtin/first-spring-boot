package com.amigoscode.firstspringboot.student;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudent() {
        return List.of(
                new Student(
                        1L,
                        "Ekrem",
                        "tgc@gamail.com",
                        LocalDate.of(1997, 04, 13),
                        26
                )
        );
    }

    @GetMapping(path = "/withName")
    public List<Student> getStudentWithName(@RequestParam String name, String surname) {
        return List.of(
                new Student(
                        1L,
                        name,
                        name + "@" + surname + ".com",
                        LocalDate.of(1997, 04, 13),
                        26
                )
        );
    }
}

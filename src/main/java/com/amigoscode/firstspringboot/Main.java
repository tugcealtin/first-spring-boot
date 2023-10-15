package com.amigoscode.firstspringboot;

import com.amigoscode.firstspringboot.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}



	/*
	@GetMapping("/greet")
	public GreetResponse greet(){
		GreetResponse  response = new GreetResponse(
				"Hello",
				List.of("java","python"),
				new Person("Tugce", "Altın", 26)
		);
		return response;
	}

	record Person(
			String name,
			String lastName,
			int old
	){}
	record GreetResponse(
			String greet,
			List<String> favProgrammingLanguage,
			Person person
	)
	// JSON için key değeri(name ve String tipinde bir value alır onu anlıyoruz) burda parametre olarak veriliyor böylece bununla bir nesne yaratıldığında girilen value keyin karşılığı oluyor
	//record GreetResponse(String greet){}
	{

	}*/
}

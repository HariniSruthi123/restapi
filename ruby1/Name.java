package com.problem.gold1.ruby1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class Name {
@GetMapping("/hello")public String getName() {
	String s="Tae";
	return "Welcome "+s+"!";
}
}
        
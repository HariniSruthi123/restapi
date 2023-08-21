package com.problem.gold1.ruby1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller_pro1 {
@GetMapping("Welcome")
public String Welcome()
{
	return "Welcome";
}
}

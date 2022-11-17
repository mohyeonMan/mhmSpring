package main.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Controller
public class MainController {
	@GetMapping(value = "/")
	public String index() {
		return "/index";
	}
}

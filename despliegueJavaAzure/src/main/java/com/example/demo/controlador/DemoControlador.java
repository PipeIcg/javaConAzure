package com.example.demo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControlador {

	@GetMapping("/mensaje")
	public String mensaje() {
		return "Hola mundo con azure";
	}
}

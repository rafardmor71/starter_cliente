package autoconfiguracion_starter.starter_include.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import autoconfiguracion_starter.starter_configuration.configuration.Saludo;

@RestController
public class IndexController {

	@Autowired
	private Saludo saludo;


	@GetMapping("/saludo")
	public ResponseEntity<String> saludo() {
		
		return new ResponseEntity<String>(HttpStatus.OK).ok(saludo.mensajeSaludo());
	}
	
}

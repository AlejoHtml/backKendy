package co.com.kendy.inventarios.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusService {
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping ("")
	public String status() {
		return "MI PRIMER SERVICIO";
	}

}

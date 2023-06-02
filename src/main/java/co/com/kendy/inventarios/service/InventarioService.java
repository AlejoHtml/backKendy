package co.com.kendy.inventarios.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.kendy.inventarios.manager.InventariosManager;
import co.com.kendy.inventarios.model.RegistroModel;


@RestController
@RequestMapping("/inventario")
public class InventarioService {
	
	@Autowired
	private InventariosManager inventariosManager;
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@Consumes(MediaType.APPLICATION_JSON)
	@PostMapping("/registrar")
	public Response registrar(@RequestBody RegistroModel input) {
		System.out.println(input.toString());
		inventariosManager.registrar(input);
		return Response.ok().build();
		
	}
	
}

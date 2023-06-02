package co.com.kendy.inventarios.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.kendy.inventarios.manager.InventariosManager;
import co.com.kendy.inventarios.model.RegistroModel;
import co.com.kendy.inventarios.repository.InventarioRepository;

@Service
public class InventariosManagerImpl implements InventariosManager {

	
	@Autowired
	private InventarioRepository inventarioRepository;
	
	@Override
	public void registrar(RegistroModel input) {
		//validar datos TODO
		inventarioRepository.insert(input);
		
	}
	
}

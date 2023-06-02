package co.com.kendy.inventarios.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import co.com.kendy.inventarios.model.RegistroModel;
import co.com.kendy.inventarios.repository.InventarioRepository;

@Service
public class InventarioRepositoryImpl implements InventarioRepository {

	
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(RegistroModel input) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO inventarios(idBodega, referencia, cantidad) values (?, ?, ?)";
		jdbcTemplate.update(sql, input.getIdBodega(), input.getReferencia(), input.getCantidad());
	}

}

package co.com.kendy.inventarios;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class InventariosApplication implements CommandLineRunner{
	
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(InventariosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM inventarios";
		List<Map<String, Object>> lista = jdbcTemplate.queryForList(sql);
		lista.forEach(System.out :: println);
		System.out.println("base de datos correcto");
	}

}

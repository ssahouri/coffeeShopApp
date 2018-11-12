package co.grandcircus.coffeeshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class MenuItemDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<MenuItem> findAll() {
	
		return jdbcTemplate.query("Select * from Items", new BeanPropertyRowMapper<>(MenuItem.class) );
	}

}

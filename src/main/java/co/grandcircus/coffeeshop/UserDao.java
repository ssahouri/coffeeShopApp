package co.grandcircus.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class UserDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void create(User user) {
		String sql = "INSERT INTO Users (first_name, last_name, username, password) VALUES (?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getFirst_name(), user.getLast_name(), 
				user.getUsername(), user.getPassword());
	}

}

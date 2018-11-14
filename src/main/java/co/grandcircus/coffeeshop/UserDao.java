package co.grandcircus.coffeeshop;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
@Transactional
public class UserDao {
	@Autowired
	@PersistenceContext
	private EntityManager em;
	
//	public void createUser(User user) {
//		String sql = "INSERT INTO Users (first_name, last_name, username, password) VALUES (?, ?, ?, ?)";
//		jdbcTemplate.update(sql, user.getFirst_name(), user.getLast_name(), 
//				user.getUsername(), user.getPassword());
//	}
	
	public void createUser(User user) {
		em.persist(user);
	}
	
	public User findById(int id) {
		return em.find(User.class, id);
	}
	
	public void updateUser(User user) {
		em.merge(user);
	}
	
	//deleting a user
	public void deleteUser(int id) {
		User user = em.getReference(User.class, id);
		em.remove(user);
	}

}

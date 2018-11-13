package co.grandcircus.coffeeshop;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;




@Repository
@Transactional
public class MenuItemDao {
	
	
	@PersistenceContext
	private EntityManager em;
//	@Autowired
//	JdbcTemplate jdbcTemplate;
	
	public List<MenuItem> findAll() {
	
		return em.createQuery("FROM MenuItem", MenuItem.class ).getResultList();
	}
	public MenuItem findById(int id) {
		return em.find(MenuItem.class, id);
	}
	
	public void update(MenuItem item) {
		em.merge(item);
	}
	
	public void create(MenuItem item) {
		em.persist(item);
	}
	
	public void delete(int id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		MenuItem item = em.getReference(MenuItem.class, id);
		em.remove(item);
	}


}

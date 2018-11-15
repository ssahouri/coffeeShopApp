package co.grandcircus.coffeeshop;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDao {
	@Autowired
	@PersistenceContext
	private EntityManager em;

	public void createUser(User user) {
		em.persist(user);
	}

	public User findByUsername(String username) {
		try {
			return em.createQuery("FROM User WHERE username = :username", User.class).setParameter("username", username)
					.getSingleResult();
		} catch (NoResultException ex) {
			// No user with that username found.
			return null;
		}
	}

	public User findById(int id) {
		return em.find(User.class, id);
	}

	public void updateUser(User user) {
		em.merge(user);
	}

	// deleting a user
	public void deleteUser(int id) {
		User user = em.getReference(User.class, id);
		em.remove(user);
	}

}

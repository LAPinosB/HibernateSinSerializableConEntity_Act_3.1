package HibernateEjemplo.HibernateEjemplo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Transactional
public class LibroDAO {
	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Libro libro) {
		entityManager.persist(libro);
	}
	
	public void delete(Long libroId) {
        Libro libro = entityManager.find(Libro.class, libroId);
        if (libro != null) {
            entityManager.remove(libro);
        }
    }
	
}

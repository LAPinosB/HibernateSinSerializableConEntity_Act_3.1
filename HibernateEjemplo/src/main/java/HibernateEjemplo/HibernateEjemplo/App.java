package HibernateEjemplo.HibernateEjemplo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	// Crea el EntityManagerFactory usando el nombre de la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");

        // Crea el EntityManager
        EntityManager em = emf.createEntityManager();

        // Crea un nuevo libro
        Libro nuevoLibro = new Libro("Título del libro", "Autor del libro", 2022);

        // Guarda el libro en la base de datos
        em.getTransaction().begin();
        em.persist(nuevoLibro);
        em.getTransaction().commit();

        // Elimina el libro por su ID
        /*
        Long libroId = nuevoLibro.getId();
        em.getTransaction().begin();
        Libro libroAEliminar = em.find(Libro.class, libroId);
        if (libroAEliminar != null) {
            em.remove(libroAEliminar);
        }
        em.getTransaction().commit();
        */

        // Cierra el EntityManager y EntityManagerFactory al final
        em.close();
        emf.close();
    }
}

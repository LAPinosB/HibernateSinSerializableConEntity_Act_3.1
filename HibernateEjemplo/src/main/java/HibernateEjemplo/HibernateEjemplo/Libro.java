package HibernateEjemplo.HibernateEjemplo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import lombok.Getter;
//import lombok.Setter;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	//@Getter @Setter private String titulo;
    //@Getter @Setter private String autor;
    //@Getter @Setter private int anioPublicacion;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	// Constructor predeterminado (necesario para JPA)
    public Libro() {
    }

    public Libro(Long id, String titulo, String autor, int anioPublicacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
	}

	// Constructor con parámetros
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    // Puedes agregar métodos adicionales según sea necesario

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}

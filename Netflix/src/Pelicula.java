


public class Pelicula extends ProduccionAudiovisual {

	private int año;
	
	public Pelicula() {}
	
	public Pelicula(String titulo,String creador) {
		super(titulo, creador);
		this.año = 0;

	}
	
	public Pelicula(String titulo, String genero, String creador, int año, int duracion) {
		super(titulo, genero, creador, duracion);
		this.año = año;
	}


	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	
   @Override
   	public String toString() {
   		return "Clase Película";
   	}	
	
}
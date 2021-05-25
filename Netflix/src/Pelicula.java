


public class Pelicula extends ProduccionAudiovisual {

	private int a�o;
	
	public Pelicula() {}
	
	public Pelicula(String titulo,String creador) {
		super(titulo, creador);
		this.a�o = 0;

	}
	
	public Pelicula(String titulo, String genero, String creador, int a�o, int duracion) {
		super(titulo, genero, creador, duracion);
		this.a�o = a�o;
	}


	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	
   @Override
   	public String toString() {
   		return "Clase Pel�cula";
   	}	
	
}
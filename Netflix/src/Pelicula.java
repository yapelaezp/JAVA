


public class Pelicula {
	private String titulo;
	private String genero;
	private String creador;
	private int a�o;
	private int duracion;
	private boolean visto;
	
	public Pelicula() {}
	
	public Pelicula(String titulo,String creador) {
		this.titulo = titulo;
		this.genero = "";
		this.creador = creador;
		this.a�o = 0;
		this.duracion = 0;
		this.visto = false;
	}
	
	public Pelicula(String titulo, String genero, String creador, int a�o, int duracion) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.a�o = a�o;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
   @Override
   	public String toString() {
   		return "Clase Pel�cula";
   	}	
	
}
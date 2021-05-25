
public class ProduccionAudiovisual {
 private String titulo;
 private String genero;
 private String creador;
 private int duracion;
 private boolean visto;
 
 	public ProduccionAudiovisual() {
 		this.titulo = "";
 		this.genero = "";
 		this.creador = "";
 		this.duracion = 0;
 		this.visto = false;
 	}
 	
 	public ProduccionAudiovisual(String titulo, String creador) {
 		this.titulo = titulo;
 		this.genero = "";
 		this.creador = creador;
 		this.duracion = 0;
 		this.visto = false;
 	}
 	
 	public ProduccionAudiovisual(String titulo, String genero, String creador, int duracion) {
 		this.titulo = "";
 		this.genero = "";
 		this.creador = "";
 		this.duracion = 0;
 		this.visto = false;
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

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
 	
}

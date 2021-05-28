
public class ProduccionAudiovisual implements Visualizable {
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
 		this.titulo = titulo;
 		this.genero = genero;
 		this.creador = creador;
 		this.duracion = duracion;
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

	@Override
	public void marcarVisto() {
		this.visto = true;
		
	}

	@Override
	public boolean esVisto() {
		return this.visto;
	}

	@Override
	public String  tiempoVisto() {
		// Si la película ya se ha visto se muestra el tiempo 
		if (this.visto) {
			int min;
			int seg;
			double aux;
			String tiempo;
			// Como el ejercicio no explica con detalle el tiempo visto decidí crear un número aleatorio que me diga el 
			// tiempo visto de alguna serie o película
			aux = Math.floor(Math.random()* (this.duracion + 1)); 
			min = (int)aux;
			aux = Math.floor(Math.random()* (59 + 1));
			seg = (int) aux;
			tiempo = min + "/" + seg;
			return tiempo;
		}
		else {
			return "No vista";
		}

	}
 	
}

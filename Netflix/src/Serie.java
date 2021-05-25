
public class Serie extends ProduccionAudiovisual {

	private short  no_temporadas;

	public Serie() {
		super();
		this.no_temporadas = 1;
	}	
	
	public Serie(String titulo, String creador) {
		super(titulo, creador);
		this.no_temporadas = 1;

	}
	
	public Serie(String titulo, short no_temporadas, String genero, String creador, int duracion) {
		super(titulo, genero, creador, duracion);
		this.no_temporadas = no_temporadas;
	}

	public short getNo_temporadas() {
		return no_temporadas;
	}

	public void setNo_temporadas(short no_temporadas) {
		this.no_temporadas = no_temporadas;
	}

	
    @Override
    public String toString() {
    	return "Clase Serie";
    }
	
	
}

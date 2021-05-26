
public class Principal {

	public static void main(String[] args) {

	Pelicula miPeli = new Pelicula("El desvergador","Terror","M Jackson",1969,90);
/*
	Serie miSerie = new Serie();
	System.out.println(miSerie.toString());
	System.out.println(miSerie.getNo_temporadas());
*/
	miPeli.marcarVisto();
	System.out.println(miPeli.esVisto());
	System.out.println(miPeli.tiempoVisto());
	}
}

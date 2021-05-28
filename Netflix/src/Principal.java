
public class Principal {

	public static void main(String[] args) {
		
	Pelicula[] misPeliculas = new Pelicula[5];
	Serie[] misSeries = new Serie[5];
	
	misPeliculas[0] = new Pelicula("El desvergador","Terror","M Jackson",1969,90);
	misPeliculas[1] = new Pelicula("7 d�as bajo la poceta","Alan Brito");
	misPeliculas[2] = new Pelicula("3 metros bajo tierra","Drama","Mel Gibson",2020,120);
	misPeliculas[3] = new Pelicula();
	misPeliculas[4] = new Pelicula("Harry Poker","Comedia","Diego Norrea",2016,80);
	
	// Debido a que las series tienen m�s cap�tulos se el tiempo de duraci�n es mucho mayor al de una pel�cula
	misSeries[0] = new Serie("La maldici�n",(short)3,"Terror","Beteljouse",4000);
	misSeries[1] = new Serie("La patada del mocho",(short)10,"Comedia","Jorge Nitales",1000);
	misSeries[2] = new Serie("La casa de papel", "Paco Ardila");
	misSeries[3] = new Serie();
	misSeries[4] = new Serie("Expedici�n a Marte", (short) 1,"Documental","Elon Mosko",360);
	
	misPeliculas[0].marcarVisto();
	misPeliculas[2].marcarVisto();
	misPeliculas[4].marcarVisto();
	misSeries[1].marcarVisto();
	misSeries[4].marcarVisto();
	
	// Mostrasr pel�culas que ya fueron vistas
	
	//Se busca entre el total de pel�cula y series 
	for(int i = 0; i < misPeliculas.length + misSeries.length; i++) {
		// Se evalua primero para las pel�culas
		if (i < 5) {
			if(misPeliculas[i].esVisto()) {
				System.out.println(misPeliculas[i].getTitulo() + " " + misPeliculas[i].tiempoVisto());
			}
		}
		//Luego se revisan las series, como i es mayor a 5, se le resta 5 al momento de indexar
		else {
			if(misSeries[i-5].esVisto()) {
				System.out.println(misSeries[i-5].getTitulo() + " " + misSeries[i-5].tiempoVisto());
			}			
		}
	}
	
	// Buscar serie con m�s temporadas
	// inicialmente establezco como el numero max de temporadas con la priemra serie
	short max_temporada = 0;
	for(int i = 1; i < misSeries.length; i++) {
		if (misSeries[i].getNo_temporadas() > misSeries[max_temporada].getNo_temporadas()) {
			max_temporada = (short)i;
		}
	}
	System.out.println("La serie con m�s temporadas es: "  + misSeries[max_temporada].toString()); 
	
	//Buscar pel�cula m�s reciente
	short anio_mas_reciente = 0;
	for(int i = 1; i < misSeries.length; i++) {
		if (misPeliculas[i].getA�o() > misPeliculas[anio_mas_reciente].getA�o()) {
			anio_mas_reciente = (short)i;
		}
	}	
	System.out.println("La pel�cula m�s reciente es: "  + misPeliculas[anio_mas_reciente].toString()); 
	
	}
}

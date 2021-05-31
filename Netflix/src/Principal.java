import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
	ArrayList<Pelicula> misPeliculas = new ArrayList<Pelicula>();
	ArrayList<Serie> misSeries = new ArrayList<Serie>();
	misPeliculas.add(new Pelicula("El desvergador","Terror","M Jackson",1969,90));
	misPeliculas.add(new Pelicula("7 d�as bajo la poceta","Alan Brito"));
	misPeliculas.add(new Pelicula("3 metros bajo tierra","Drama","Mel Gibson",2020,120));
	misPeliculas.add(new Pelicula());
	misPeliculas.add(new Pelicula("Harry Poker","Comedia","Diego Norrea",2016,80));
	 
	
	// Debido a que las series tienen m�s cap�tulos se el tiempo de duraci�n es mucho mayor al de una pel�cula
	misSeries.add(new Serie("La maldici�n",(short)3,"Terror","Beteljouse",4000));
	misSeries.add(new Serie("La patada del mocho",(short)10,"Comedia","Jorge Nitales",1000));
	misSeries.add(new Serie("La casa de papel", "Paco Ardila"));
	misSeries.add(new Serie());
	misSeries.add(new Serie("Expedici�n a Marte", (short) 1,"Documental","Elon Mosko",360));
	
	
	misPeliculas.get(0).marcarVisto();
	misPeliculas.get(2).marcarVisto();
	misPeliculas.get(4).marcarVisto();
	misSeries.get(1).marcarVisto();
	misSeries.get(4).marcarVisto();
	
	// Mostrasr pel�culas que ya fueron vistas
//	try {
//		
//	} catch (Exception e) {
//		
//	}
	
	
	//Se busca entre el total de pel�cula y series 
	for(int i = 0; i < misPeliculas.size() + misSeries.size(); i++) {
		// Se evalua primero para las pel�culas
		if (i < 5) {
			if(misPeliculas.get(i).esVisto()) {
				System.out.println(misPeliculas.get(i).getTitulo() + " " + misPeliculas.get(i).tiempoVisto());
			}
		}
		//Luego se revisan las series, como i es mayor a 5, se le resta 5 al momento de indexar
		else {
			if(misSeries.get(i-5).esVisto()) {
				System.out.println(misSeries.get(i-5).getTitulo() + " " + misSeries.get(i-5).tiempoVisto());
			}			
		}
	}
	
	// Buscar serie con m�s temporadas
	// inicialmente establezco como el numero max de temporadas con la priemra serie
	short max_temporada = 0;
	for(int i = 1; i < misSeries.size(); i++) {
		if (misSeries.get(i).getNo_temporadas() > misSeries.get(max_temporada).getNo_temporadas()) {
			max_temporada = (short)i;
		}
	}
	System.out.println("La serie con m�s temporadas es: "  + misSeries.get(max_temporada).toString()); 
	
	//Buscar pel�cula m�s reciente
	short anio_mas_reciente = 0;
	for(int i = 1; i < misSeries.size(); i++) {
		if (misPeliculas.get(i).getA�o() > misPeliculas.get(anio_mas_reciente).getA�o()) {
			anio_mas_reciente = (short)i;
		}
	}	
	System.out.println("La pel�cula m�s reciente es: "  + misPeliculas.get(anio_mas_reciente).toString()); 
	
	}
}

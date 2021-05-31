import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
	ArrayList<Pelicula> misPeliculas = new ArrayList<Pelicula>();
	ArrayList<Serie> misSeries = new ArrayList<Serie>();
	misPeliculas.add(new Pelicula("El desvergador","Terror","M Jackson",1969,90));
	misPeliculas.add(new Pelicula("7 días bajo la poceta","Alan Brito"));
	misPeliculas.add(new Pelicula("3 metros bajo tierra","Drama","Mel Gibson",2020,120));
	misPeliculas.add(new Pelicula());
	misPeliculas.add(new Pelicula("Harry Poker","Comedia","Diego Norrea",2016,80));
	 
	
	// Debido a que las series tienen más capítulos se el tiempo de duración es mucho mayor al de una película
	misSeries.add(new Serie("La maldición",(short)3,"Terror","Beteljouse",4000));
	misSeries.add(new Serie("La patada del mocho",(short)10,"Comedia","Jorge Nitales",1000));
	misSeries.add(new Serie("La casa de papel", "Paco Ardila"));
	misSeries.add(new Serie());
	misSeries.add(new Serie("Expedición a Marte", (short) 1,"Documental","Elon Mosko",360));
	
	
	misPeliculas.get(0).marcarVisto();
	misPeliculas.get(2).marcarVisto();
	misPeliculas.get(4).marcarVisto();
	misSeries.get(1).marcarVisto();
	misSeries.get(4).marcarVisto();
	
	// Mostrasr películas que ya fueron vistas
//	try {
//		
//	} catch (Exception e) {
//		
//	}
	
	
	//Se busca entre el total de película y series 
	for(int i = 0; i < misPeliculas.size() + misSeries.size(); i++) {
		// Se evalua primero para las películas
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
	
	// Buscar serie con más temporadas
	// inicialmente establezco como el numero max de temporadas con la priemra serie
	short max_temporada = 0;
	for(int i = 1; i < misSeries.size(); i++) {
		if (misSeries.get(i).getNo_temporadas() > misSeries.get(max_temporada).getNo_temporadas()) {
			max_temporada = (short)i;
		}
	}
	System.out.println("La serie con más temporadas es: "  + misSeries.get(max_temporada).toString()); 
	
	//Buscar película más reciente
	short anio_mas_reciente = 0;
	for(int i = 1; i < misSeries.size(); i++) {
		if (misPeliculas.get(i).getAño() > misPeliculas.get(anio_mas_reciente).getAño()) {
			anio_mas_reciente = (short)i;
		}
	}	
	System.out.println("La película más reciente es: "  + misPeliculas.get(anio_mas_reciente).toString()); 
	
	}
}

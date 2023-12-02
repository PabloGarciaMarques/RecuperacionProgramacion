import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tarea5();
	}
	public static void tarea3() {
		Pelicula p1=new Pelicula("Pelicula1 ", 180, 2009, 6.9);
		Pelicula p2=new Pelicula("Pelicula1 ", 180, 2009, 6.9);
		Pelicula p3=new Pelicula("Pelicula3 ", 180, 2009, 6.9);
		/*Pelicula p4=new Pelicula("Pelicula1 ", 180, 2009, 6.9);
		Pelicula p5=new Pelicula("Pelicula1 ", 180, 2009, 6.9);
		Pelicula p6=new Pelicula("Pelicula1 ", 180, 2009, 6.9);*/
		
		
		boolean iguales=p1.equals(p2);
		System.out.println(iguales);
		
	}
	
	
	public static void tarea5() {
		Scanner sc = new Scanner(System.in);
			List<Pelicula> listaPeliculas=new ArrayList<>();
			String ruta="C:\\Users\\Pablo\\Downloads\\peliculas (1).txt";
			try {
				BufferedReader reader = new BufferedReader(new FileReader(ruta));
				String lineaLeida="";
				while((lineaLeida=reader.readLine())!=null) {
					String [] partesLinea=lineaLeida.split(";");
					String titulo=partesLinea[0];
					int duracion=Integer.parseInt(partesLinea[1]);
					int anyoLanzamiento=Integer.parseInt(partesLinea[2]);
					double notaIMDB=Double.parseDouble(partesLinea[3]);
					
					Pelicula pelicula = new Pelicula(titulo, duracion, anyoLanzamiento, notaIMDB);
					listaPeliculas.add(pelicula);
					
				
		
		System.out.println("¿Que quieres hacer?");
		System.out.println("Leer el archivo");
		System.out.println("Ordenar alfabeticamente.");
		System.out.println("Ordenar por año decreciente.");
		System.out.println("Ordenar por puntacion decreciente");
		System.out.println("Guardar en archivo binario");
		int opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			leerArchivo();
			break;
			
		case 2:
			
			ordenarAlf();
			break;
		case 3:
			
			//ordenarDuracionCreciente();
			break;
		case 4:
		
			//ordenarAnyoDecreciente();
			break;
		case 5:
			
			//ordenarNotaDecreciente();
			break;
		case 6:
			
			//guardarBinario();
			break;
		}
		
	}
	
	public static List<Pelicula> leerArchivo() {
		List<Pelicula> listaPeliculas=new ArrayList<>();
		String ruta="C:\\Users\\Pablo\\Downloads\\peliculas (1).txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ruta));
			String lineaLeida="";
			while((lineaLeida=reader.readLine())!=null) {
				String [] partesLinea=lineaLeida.split(";");
				String titulo=partesLinea[0];
				int duracion=Integer.parseInt(partesLinea[1]);
				int anyoLanzamiento=Integer.parseInt(partesLinea[2]);
				double notaIMDB=Double.parseDouble(partesLinea[3]);
				
				Pelicula pelicula = new Pelicula(titulo, duracion, anyoLanzamiento, notaIMDB);
				listaPeliculas.add(pelicula);
				
			}
			// Imprimir cada película en una línea separada
			for (Pelicula pelicula : listaPeliculas) {
			    System.out.println(pelicula);
			}
			

		} catch (Exception e) {
			// TODO: handle exception
		}
		return listaPeliculas;
		
	}
	
	
	public static void ordenarAlf() {
		
		Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getTitulo).reversed());
		for(Pelicula pelicula:listaPeliculas) {
			System.out.println(pelicula);
		}
	}
	
	
	
	
}

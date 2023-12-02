import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable {
private String titulo;
private int duracion;
private int anyLanzamiento;
private double notaIMDB;
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
public int getAnyLanzamiento() {
	return anyLanzamiento;
}
public void setAnyLanzamiento(int anyLanzamiento) {
	this.anyLanzamiento = anyLanzamiento;
}
public double getNotaIMDB() {
	return notaIMDB;
}
public void setNotaIMDB(double notaIMDB) {
	this.notaIMDB = notaIMDB;
}
public Pelicula(String titulo, int duracion, int anyLanzamiento, double notaIMDB) {
	super();
	this.titulo = titulo;
	this.duracion = duracion;
	this.anyLanzamiento = anyLanzamiento;
	this.notaIMDB = notaIMDB;
}


public boolean equals(Pelicula p) {
	  if(titulo.equalsIgnoreCase(p.getTitulo()) && anyLanzamiento == p.getAnyLanzamiento()) {
		 
		  return true;
		
	}else {
		return false;
	}
	
}
@Override
public String toString() {
	String frase=this.titulo+";"+this.duracion+";"+this.anyLanzamiento+";"+this.notaIMDB;
	return frase;
	
}




}

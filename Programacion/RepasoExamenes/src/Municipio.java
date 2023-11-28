import java.io.Serializable;
import java.util.Comparator;

public class Municipio implements Serializable, Comparable<Municipio> {
private String nombre;
private int poblacion;
private String provincia;


public Municipio(String nombre, int poblacion, String provincia) {

	this.nombre = nombre;
	this.poblacion = poblacion;
	this.provincia = provincia;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getPoblacion() {
	return poblacion;
}
public void setPoblacion(int poblacion) {
	this.poblacion = poblacion;
}
public String getProvincia() {
	return provincia;
}
public void setProvincia(String provincia) {
	this.provincia = provincia;
}

@Override
public String toString() {
    return "Municipio{" +
            "nombre='" + nombre + '\'' +
            ", poblacion=" + poblacion +
            ", provincia='" + provincia + '\'' +
            '}';
}
@Override
public int compareTo(Municipio otroMunicipio) {
    return Integer.compare(otroMunicipio.getPoblacion(), this.getPoblacion());
}


public static Comparator<Municipio> comparadorPorPoblacionDecreciente = Comparator.comparingInt(Municipio::getPoblacion).reversed();

public static Comparator<Municipio> comparadorAlfabeticoPorNombre = Comparator.comparing(Municipio::getNombre);

public static Comparator<Municipio> comparadorPorProvinciaYNombre = Comparator.comparing(Municipio::getProvincia).thenComparing(Municipio::getNombre);
}


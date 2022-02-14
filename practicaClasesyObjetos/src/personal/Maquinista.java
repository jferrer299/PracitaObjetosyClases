package personal;

public class Maquinista {
    public String nombre;
    public String dni;
    public int sueldo;
    public int rango;
public String detalles(){
    StringBuilder sb = new StringBuilder();//Para en vez de imprimir estos datos, retornarlos como un String y despues imprimirlos en main
    sb.append("Datos del maqinista " + this.nombre +"\n");
    sb.append("Maquinista {nombre = " + this.nombre +
                       " " +"dni = " + this.dni+" "
                        +"sueldo = " + this.sueldo+" "
                        +"rango = " + this.rango+"}\n");

    return sb.toString();
    }
}


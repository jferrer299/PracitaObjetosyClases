package personal;

public class Maquinista {
    private String nombre;
    private String dni;
    private int sueldo;
    private int rango;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public String detalles(){
    return("Datos del maqinista " + this.nombre +"\n")+
            ("Maquinista {nombre = " + this.nombre +
                       " " +"dni = " + this.dni+" "
                        +"sueldo = " + this.sueldo+" "
                        +"rango = " + this.rango+"}\n");
    }
}


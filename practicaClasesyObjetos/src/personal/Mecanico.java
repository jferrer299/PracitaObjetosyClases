package personal;

public class Mecanico {
    private String nombre;
    private long telefono;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String detallesMecanicos(){
        return ("Datos del mecanico " + this.nombre +"\n") +
                ("Mecánico {Nombre ="+" " + this.nombre
                + " " + "Teléfono = "+this.telefono + " ");
    }
}

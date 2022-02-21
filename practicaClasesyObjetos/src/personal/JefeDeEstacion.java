package personal;

public class JefeDeEstacion {
    private String nombre;
    private String dni;
    private String fechaNombramiento;

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

    public String getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(String fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }

    public String detallesJefe(){
        return ("Datos del jefe de estación " + this.nombre +"\n")+
                ("JefeDeEstación{Nombre ="+" " + this.nombre
                + " " + "DNI = "+this.dni + " "+ "fechaNombramiento =" + fechaNombramiento);

    }
}

package personal;

public class JefeDeEstacion {
    public String nombre;
    public String dni;
    public String fechaNombramiento;
    public String detallesJefe(){
        StringBuilder sb = new StringBuilder();
        sb.append("Datos del jefe de estación " + this.nombre +"\n");
        sb.append("JefeDeEstación{Nombre ="+" " + this.nombre
                + " " + "DNI = "+this.dni + " "+ "fechaNombramiento =" + fechaNombramiento);
        return sb.toString();
    }
}

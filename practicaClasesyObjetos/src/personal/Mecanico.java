package personal;

public class Mecanico {
    public String nombre;
    public long telefono;

    public String detallesMecanicos(){
        StringBuilder sb = new StringBuilder();
        sb.append("Datos del mecanico " + this.nombre +"\n");
        sb.append("Mecánico {Nombre ="+" " + this.nombre
                + " " + "Teléfono = "+this.telefono + " ");
        return sb.toString();
    }
}

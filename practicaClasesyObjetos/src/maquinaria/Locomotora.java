package maquinaria;

public class Locomotora {
    public String matricula;
    public String potencia;
    public int añoFabricacion;

    public String detallesLocomo(){
        StringBuilder sb = new StringBuilder();//Para en vez de imprimir estos datos, retornarlos como un String y despues imprimirlos en main
        sb.append("Locomotora {matrícula = " + this.matricula +
                " " +"potencia = " + this.potencia+" "
                +"añoFabricación = " + this.añoFabricacion+" ");

        return sb.toString();
    }
}

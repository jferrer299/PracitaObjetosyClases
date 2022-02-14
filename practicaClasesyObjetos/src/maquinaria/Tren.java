package maquinaria;

public class Tren {
    int vagones;
    String maquinista;

    public String detallesTren(){
    StringBuilder sb = new StringBuilder();
    sb.append("vagones="+" " + this.vagones+ "\n" + "maquinista = "+ maquinista );
        return sb.toString();
    }
}

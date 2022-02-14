import maquinaria.Locomotora;
import maquinaria.Tren;
import personal.Especialidad;
import personal.JefeDeEstacion;
import personal.Maquinista;
import personal.Mecanico;

public class PlantillaMain {
    public static void main(String[] args) {
        // Simulamos una estación: creamos objetos de diversos tipos:

        // dos maquinistas

        Maquinista maqui1= new Maquinista();
            maqui1.nombre = "Pepe";
            maqui1.dni = "111111111P";
            maqui1.sueldo = 42000;
            maqui1.rango = 1;

        Maquinista maqui2 = new Maquinista();
            maqui2.nombre = "Marta";
            maqui2.dni = "22222222M";
            maqui2.sueldo = 42000;
            maqui2.rango = 1;

        // imprimimos los datos de los dos maquinistas
        System.out.println(maqui1.detalles());
        System.out.println(maqui2.detalles());

        // Creo a los mecánicos
        Mecanico F = new Mecanico();
            F.nombre= "F.Frenador";
            F.telefono = 389177612;


        Mecanico H = new Mecanico();
        H.nombre= "H.Hidráulico";
        F.telefono = 389177612;


        Mecanico E = new Mecanico();
        E.nombre= "E.Electricista";
        E.telefono = 12345767;


        Mecanico M = new Mecanico();
        M.nombre= "M.Motorista";
        M.telefono = 145125;


        //Imprimo a los mecanicos
        System.out.println(F.detallesMecanicos()+ "Especialidad = "+Especialidad.FRENOS + "}\n");
        System.out.println(H.detallesMecanicos()+ "Especialidad = "+Especialidad.HIDRAULICA + "}\n");
        System.out.println(E.detallesMecanicos()+ "Especialidad = "+Especialidad.ELECTRICIDAD + "}\n");
        System.out.println(M.detallesMecanicos()+ "Especialidad = "+Especialidad.MOTOR + "}\n");

        // Un jefe de estación
        JefeDeEstacion J = new JefeDeEstacion();
            J.nombre = "El boss";
            J.dni = "2222222D";
            J.fechaNombramiento = "2019-12-01";

        // Imprimimos los datos del jefe de estación
        System.out.println(J.detallesJefe()+"\n");
        System.out.println("Datos de locomotora");
        System.out.println("===================");


        // Una locomotora
        Locomotora lm = new Locomotora();
            lm.matricula = "M3085";
            lm.potencia = "350";
            lm.añoFabricacion = 2020;
            // imprimimos los datos de la locomotora
        System.out.println(lm.detallesLocomo()+" "+F.detallesMecanicos()+ "Especialidad = "+Especialidad.FRENOS + "}\n");

        // Creamos un tren con la locomotora que acabamos de crear
        Tren t1 = new Tren();
        System.out.println("Datos del tren:");
        System.out.println("================");
        System.out.println("Tren=");
        System.out.println(lm.detallesLocomo()+" "+F.detallesMecanicos()+ "Especialidad = "+Especialidad.FRENOS + "}\n");
        System.out.println(t1.detallesTren());

        // Añadimos 6 vagones al tren (nos dirá que el último no se puede
        System.out.println("\nAñadimos 5 vagones al tren y tratamos de añadir uno más: ");
        System.out.println("***************************");
        System.out.println("Creando vagon....");


        // Asignamos uno de los maquinistas al tren creado
        System.out.println("\n*****     Le asignamos un maquinista *****");

        // Mostramos el número de vagones del tren
        // Mostramos los datos del tren creado

        // Quitamos un vagón
        System.out.println("\n***** Quitamos un vagón *****");
        // mostramos el número de vagones del tren

        // Finalmente, contamos todos los elementos que tenemos en la estación
        System.out.println("\nMi estación se compone de");


    }
}

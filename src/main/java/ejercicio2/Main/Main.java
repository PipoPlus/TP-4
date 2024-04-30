package ejercicio2.Main;

import ejercicio2.Modelo.CorreoAutomatico;
import ejercicio2.Persistencia.DatosEnDisco;
import ejercicio2.Persistencia.EnvioPorCorreo;

public class Main {
    public static void main(String[] args) {

        DatosEnDisco datosEmpleados = new DatosEnDisco("C:\\Users\\elrod\\Desktop\\Orientacion Objetos II\\TP-4-Layers\\src\\main\\resources\\empleados.txt");

        CorreoAutomatico correo = new CorreoAutomatico(datosEmpleados,new EnvioPorCorreo());

        correo.felicitarCumpleaños();

    }
}

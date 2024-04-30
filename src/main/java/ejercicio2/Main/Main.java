package ejercicio2.Main;

import ejercicio2.Modelo.CorreoAutomatico;
import ejercicio2.Persistencia.DataBase;
import ejercicio2.Persistencia.EnvioPorCorreo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DataBase dataBase = new DataBase("C:\\Users\\elrod\\Desktop\\Orientacion Objetos II\\TP-4-Layers\\src\\main\\resources\\empleados.txt");

        CorreoAutomatico correo = new CorreoAutomatico(dataBase,new EnvioPorCorreo());

        correo.felicitarCumpleaños();

    }
}

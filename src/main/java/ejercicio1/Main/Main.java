package ejercicio1.Main;

import ejercicio1.Modelo.Concurso;
import ejercicio1.Persistencia.InscripcionSQL;
import ejercicio1.UI.AgregarParticipante;

import java.sql.SQLException;
import java.awt.EventQueue;


public class Main {

    public static final String URL = "jdbc:mysql://localhost:3306/concurso";
    public static final String USER = "root";
    public static final String PASSWORD = "";




    public static void main(String[] args) {
        inicializarDatabase();
        launchApplication();
    }

    private static void launchApplication() {
       EventQueue.invokeLater(new Runnable() {
           public void run() {
               try {
                   InscripcionSQL registroInscripciones =
                           new InscripcionSQL(URL,USER,PASSWORD);
                   Concurso concurso = new Concurso(registroInscripciones);
                   new AgregarParticipante(concurso);
               } catch (Exception e) {
                   System.out.println(e);
               }
           }

       })
    ;}

    private static void inicializarDatabase() {
        var jdbc = new SetUpDataBase(URL,
                USER,
                PASSWORD);
        jdbc.inicializar();
    }




}
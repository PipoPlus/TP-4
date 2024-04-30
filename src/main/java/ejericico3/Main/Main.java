package ejericico3.Main;

import ejericico3.Modelo.ServicioConcurso;
import ejericico3.Persistencia.ConcursoBaseDeDatos;
import ejericico3.Persistencia.ConcursoDisco;
import ejericico3.UI.RadioCompetition;

import javax.swing.SwingUtilities;
public class Main {

    public static final String URL = "jdbc:mysql://localhost:3306/tp-4";
    public static final String USER = "root";
    public static final String PASSWORD = "";

    public static  String rutaConcursosTxt = "C:\\Users\\elrod\\Desktop\\Orientacion Objetos II\\TP-4-Layers\\src\\main\\resources\\concursos.txt";
    public static  String rutaInscriptosTxt ="C:\\Users\\elrod\\Desktop\\Orientacion Objetos II\\TP-4-Layers\\src\\main\\resources\\inscriptos.txt";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Main().start();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
    }

    private void start() {
        //Correr aplicacion en disco
//          new RadioCompetition(new ServicioConcurso(new ConcursoDisco(rutaConcursosTxt, rutaInscriptosTxt)));

        //Correr aplicacion en Base de Datos
            new RadioCompetition(new ServicioConcurso(new ConcursoBaseDeDatos(URL, USER, PASSWORD)));
    }






}

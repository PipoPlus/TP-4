package ejercicio2.Modelo;

import java.util.ArrayList;
import java.util.List;

public class FakeEmail implements ClasesCorreo{


    private List<String> correosEnviados = new ArrayList<>();

    @Override
    public void correoCumpleaños(String apellido, String nombre, String email) {
        correosEnviados.add(String.format("Correo enviado a %s %s con email %s", nombre, apellido, email));
    }

    public List<String> obtenerCorreosEnviados() {
        return correosEnviados;
    }

}

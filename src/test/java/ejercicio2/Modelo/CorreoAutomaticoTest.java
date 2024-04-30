package ejercicio2.Modelo;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorreoAutomaticoTest {




    @Test
    void testFelicitarCumpleaños() {
        var empleadoService = new FakeEmpleadoService();
        var clasesCorreo = new FakeEmail();
        var correoAutomatico = new CorreoAutomatico(empleadoService, clasesCorreo);

        correoAutomatico.felicitarCumpleaños();

        // Afirmar que se envió un solo correo electrónico
        assertEquals(1, clasesCorreo.obtenerCorreosEnviados().size());

        // Verificar el contenido del correo
        String expectedEmail = "Correo enviado a Juan García con email juan@example.com";
        assertEquals(expectedEmail, clasesCorreo.obtenerCorreosEnviados().get(0), "El contenido del correo no es el esperado.");

    }

}
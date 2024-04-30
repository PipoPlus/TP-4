package ejercicio2.Modelo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeEmpleadoService implements EmpleadoService {

    @Override
    public List<Empleado> cargarEmpleadosDelArchivo() {

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("García", "Juan", LocalDate.now(), "juan@example.com"));
        empleados.add(new Empleado("Pérez", "María", LocalDate.now().minusDays(1), "maria@example.com"));
        empleados.add(new Empleado("López", "Pedro", LocalDate.now().plusDays(1), "pedro@example.com"));
        empleados.add(new Empleado("Martínez", "Ana", LocalDate.now().plusMonths(1), "ana@example.com"));

        return empleados;
    }
}

package ejercicio2.Persistencia;

import ejercicio2.Modelo.Empleado;
import ejercicio2.Modelo.EmpleadoService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DataBase implements EmpleadoService {

    String filePath;

    public DataBase(String ruta){
        this.filePath = ruta;
    }

    @Override
    public List<Empleado> cargarEmpleadosDelArchivo() {
        List<Empleado> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                String apellido = parts[0];
                String nombre = parts[1];
                LocalDate nacimiento = LocalDate.parse(parts[2], DateTimeFormatter.ofPattern("yyyy/MM/dd"));
                String email = parts[3];
                employees.add(new Empleado(apellido, nombre, nacimiento, email));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }
}

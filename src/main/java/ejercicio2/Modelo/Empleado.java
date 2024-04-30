package ejercicio2.Modelo;

import java.time.LocalDate;


public class Empleado {

    private String apellido;
    private String nombre;
    private LocalDate nacimiento;
    private String email;



    public Empleado(String apellido, String nombre, LocalDate nacimiento, String email) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.email = email;
    }


    public boolean esCumpleaños(){
        LocalDate fechaActual = LocalDate.now();
        return nacimiento.getMonthValue() == fechaActual.getMonthValue() && nacimiento.getDayOfMonth() == fechaActual.getDayOfMonth();
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
}

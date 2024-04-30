package ejercicio2.Modelo;

import java.time.LocalDate;


public class Empleado {

    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String email;



    public Empleado(String lastName, String firstName, LocalDate birthDate, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.email = email;
    }


    public boolean esCumpleaños(){
        LocalDate fechaActual = LocalDate.now();
        return birthDate.getMonthValue() == fechaActual.getMonthValue() && birthDate.getDayOfMonth() == fechaActual.getDayOfMonth();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }
}

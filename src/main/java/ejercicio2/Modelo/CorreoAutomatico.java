package ejercicio2.Modelo;



import java.util.List;

public class CorreoAutomatico {

    EmpleadoService service;
    ClasesCorreo correo;

    public CorreoAutomatico (EmpleadoService baseEmpleados, ClasesCorreo correo){
        this.service = baseEmpleados;
        this.correo = correo;
    }

    public void felicitarCumpleaños(){
        List<Empleado> empleados = service.cargarEmpleadosDelArchivo();
        for (Empleado e : empleados){

            if (e.esCumpleaños()){
                correo.correoCumpleaños(e.getLastName(),e.getFirstName(),e.getEmail());
            }
        }
    }

}

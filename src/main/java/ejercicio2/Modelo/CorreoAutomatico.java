package ejercicio2.Modelo;



import java.util.List;

public class CorreoAutomatico {

    EmpleadoService servicioEmpleado;
    ClasesCorreo correo;

    public CorreoAutomatico (EmpleadoService servicioEmpleado, ClasesCorreo correo){
        this.servicioEmpleado = servicioEmpleado;
        this.correo = correo;
    }

    public void felicitarCumpleaños(){
        List<Empleado> empleados = servicioEmpleado.cargarEmpleadosDelArchivo();
        for (Empleado e : empleados){

            if (e.esCumpleaños()){
                correo.correoCumpleaños(e.getApellido(),e.getNombre(),e.getEmail());
            }
        }
    }

}

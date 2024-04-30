package ejercicio1.Modelo;

public class Concurso {

    RegistroInscripcion registro;

    public Concurso (RegistroInscripcion registro){
        this.registro = registro;
    }


    public void inscribirParicipante(Participante participante){
        registro.registrarInscripcion(participante.nombre,participante.region,participante.telefono);
    }

}

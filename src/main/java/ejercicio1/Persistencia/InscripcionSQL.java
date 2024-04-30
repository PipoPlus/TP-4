package ejercicio1.Persistencia;

import ejercicio1.Modelo.RegistroInscripcion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InscripcionSQL implements RegistroInscripcion {

    private Conn conn;
    public static final String SQL = "insert into participantes(nombre, telefono, region) values(?,?,?)";


    public InscripcionSQL(String url, String user, String pwd){
        this.conn = new Conn(url,user,pwd);
    }

    @Override
    public void registrarInscripcion(String nombreParticipante, String region, String numeroTelefonico) {

        try (var conexion = this.conn.open(); PreparedStatement st = conexion.prepareStatement(SQL)){

            st.setString(1, nombreParticipante);
            st.setString(2, numeroTelefonico);
            st.setString(3, region);
            st.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

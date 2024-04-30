package ejercicio2.Persistencia;

import ejercicio2.Modelo.ClasesCorreo;
import java.util.Properties;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;


public class EnvioPorCorreo implements ClasesCorreo {

    private static final String USERNAME = "21e60c54fcf1b9";
    private static final String PASSWORD = "4f38f702e543b0";
    private static final String HOST = "sandbox.smtp.mailtrap.io";

    @Override
    public void correoCumpleaños(String apellido, String nombre, String email) {
        //Propiedades de SMTP de Mailtrap
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", HOST);
        props.put("mail.smtp.port", "587");

        // Creaa la sesion de correo electronico
        Session session = Session.getInstance(props,
                new jakarta.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(USERNAME, PASSWORD);
                    }
                });

        try {

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(USERNAME));

            message.setRecipient(Message.RecipientType.TO, new InternetAddress(nombre));

            message.setSubject("Feliz Cumpleaños " + nombre + "<3");

            message.setText("Sr/Sra: " + apellido + "\n Desde la empresa te desamos un muy feliz cumpleaños. Como regalo, te damos por aprobado Orientacion a Objetos II. ;)");

            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException("Error al enviar el correo electronico", e);
        }
    }
}

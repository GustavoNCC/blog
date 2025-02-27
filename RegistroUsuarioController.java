package modelo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RegistroUsuarioController {

    @FXML
    private TextField nombreField;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button registrarButton;
    @FXML
    private Label mensajeLabel;
    @FXML
    private void registrarUsuario() {
        String nombre = nombreField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();

        if (nombre.isEmpty() || email.isEmpty() || password.isEmpty()) {
            mensajeLabel.setText("Todos los campos son obligatorios.");
        } else {
            mensajeLabel.setText("Usuario registrado con éxito.");
        }
    }
}

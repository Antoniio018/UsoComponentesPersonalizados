package es.ieslosmontecillos.usocomponentespersonalizados;

import es.ieslosmontecillos.componentes_gomezantonio.CampoTextoBoton;
import es.ieslosmontecillos.componentes_gomezantonio.Temporizador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private CampoTextoBoton txtbtnNombre;
    @FXML
    private CampoTextoBoton txtbtnApellido;
    @FXML
    private Temporizador temp;
    @FXML
    private Label lblResultado;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtbtnNombre.setText("Nombre");
        txtbtnApellido.setText("Apellido");
        temp.play();

    }
    @FXML
    public void grabarRegistroNombre(ActionEvent actionEvent) {
        lblResultado.setText("Se ha grabado: " + txtbtnNombre.getText());
    }

    @FXML
    public void grabarRegistroApellido(ActionEvent actionEvent) {
        lblResultado.setText("Se ha grabado: " + txtbtnApellido.getText());
    }

    @FXML
    public void heTerminado(ActionEvent actionEvent) {
        lblResultado.setText("Ya ha terminado el temporizador");
    }
}
module es.ieslosmontecillos.usocomponentespersonalizados {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires es.ieslosmontecillos.componentes_gomezantonio;

    opens es.ieslosmontecillos.usocomponentespersonalizados to javafx.fxml,javafx.graphics;
    exports es.ieslosmontecillos.usocomponentespersonalizados;
}
package Principal;

import Controlador.FiguraControlador;
import Vista.GeoFiguras;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            GeoFiguras vista = new GeoFiguras();
            new FiguraControlador(vista);
            vista.setLocationRelativeTo(null);
            vista.setVisible(true);
        });
    }
}
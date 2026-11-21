package Controlador;

import Modelo.Cuadrado;
import Modelo.Figura2D;
import Modelo.Rectangulo;
import Modelo.Triangulo;
import Vista.GeoFiguras;

public class FiguraControlador {

    private GeoFiguras vista;

    public FiguraControlador(GeoFiguras vista) {
        this.vista = vista;

        this.vista.addCalcularListener(e -> calcular());
        this.vista.addLimpiarListener(e -> vista.limpiar());
        this.vista.addFiguraListener(e -> vista.configurarCampos(vista.getFiguraSeleccionada()));

        vista.configurarCampos(0);
    }

    private void calcular() {
        try {
            Figura2D figura = crearFigura();          
            double area = figura.calcularArea();      
            double perimetro = figura.calcularPerimetro();
            vista.mostrarResultados(area, perimetro);
        } catch (NumberFormatException ex) {
            vista.mostrarError("Ingrese solo números válidos.");
        } catch (IllegalArgumentException ex) {
            vista.mostrarError(ex.getMessage());
        }
    }

    private Figura2D crearFigura() {
        int tipo = vista.getFiguraSeleccionada();
        switch (tipo) {
            case 0:
                return new Triangulo(leer(vista.getDato1()), leer(vista.getDato2()), leer(vista.getDato3()));
            case 1:
                return new Rectangulo(leer(vista.getDato1()), leer(vista.getDato2()));
            case 2:
                return new Cuadrado(leer(vista.getDato1()));
            default:
                throw new IllegalArgumentException("Seleccione una figura.");
        }
    }

    private double leer(String texto) {
        return Double.parseDouble(texto.trim().replace(',', '.'));
    }
}
package Controller;

import Model.Circulo;
import Model.Cuadrado;
import Model.Triangulo;

import java.awt.*;
import java.util.HashMap;
import java.util.function.Consumer;

public class Container {
  Triangulo tri ;
  Cuadrado cuad ;
  Circulo cir ;

    // Almacena funciones de dibujo para figuras geométricas específicas.
    private HashMap<String, Consumer<Graphics>> drawFunctions;

    public Container() {
        tri = new Triangulo();
        cuad = new Cuadrado();
        cir = new Circulo();
        // Inicializar el mapa con funciones lambda
        drawFunctions = new HashMap<>();
        drawFunctions.put("Triángulo", g -> tri.dibujar(g));
        drawFunctions.put("Círculo", g -> cir.dibujar(g));
        drawFunctions.put("Cuadrado", g -> cuad.dibujar(g));
    }

    public void dibujarFigura(Graphics g, String figura) {
        // Obtener la función lambda y ejecutarla
        drawFunctions.getOrDefault(figura, graphics -> {}).accept(g);
    }


}

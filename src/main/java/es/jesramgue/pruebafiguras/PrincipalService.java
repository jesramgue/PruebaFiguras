package es.jesramgue.pruebafiguras;

import es.jesramgue.pruebafiguras.figuras.Cuadrado;
import es.jesramgue.pruebafiguras.figuras.Figura;
import es.jesramgue.pruebafiguras.figuras.Rectangulo;
import es.jesramgue.pruebafiguras.figuras.Rombo;
import es.jesramgue.pruebafiguras.figuras.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class PrincipalService {

    public static List initArray() {
        List figuras =  new ArrayList<Figura>();
        figuras.add(new Triangulo());
        figuras.add(new Rectangulo());
        figuras.add(new Triangulo());
        figuras.add(new Rectangulo());
        figuras.add(new Rombo());

        return figuras;
    }

    public static void printCuadrados(final List<Figura> figuras) {
        for (Figura lfAux : figuras) {
            if (lfAux instanceof Cuadrado) {
                System.out.println(lfAux.pintar());
            }
        }
    }
    
    public static void printTriangulos(final List<Figura> figuras) {
        for (Figura lfAux : figuras) {
            if (lfAux instanceof Triangulo) {
                System.out.println(lfAux.pintar());
            }
        }
    }
}

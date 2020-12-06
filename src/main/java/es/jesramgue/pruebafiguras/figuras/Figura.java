package es.jesramgue.pruebafiguras.figuras;

/**
 * Clase abstracta Figura .
 *
 * @version 1.0
 * @author jesus Ramirez Guerrero
 */
public abstract class Figura {

    public String pintar() {
        return this.getClass().getSimpleName();
    }
}

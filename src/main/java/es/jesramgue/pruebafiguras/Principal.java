package es.jesramgue.pruebafiguras;

import java.util.List;

public class Principal {

    private static List afLista;

    public static void main(String[] args) {
        afLista = PrincipalService.initArray();

        System.out.println("1.- Recuperará todas las figuras de tipo cuadrado y para cada una de ellas hará que\n"
                + "ejecute su método pintar():");
        PrincipalService.printCuadrados(afLista);
        System.out.println("2.- Recuperará todas los triangulos y para cada uno de ellos hará que ejecute su\n"
                + "método pintar():");
        PrincipalService.printTriangulos(afLista);

    }

}

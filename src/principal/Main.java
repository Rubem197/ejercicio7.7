package principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int denominador1;
        int denominador2;
        int numerador1;
        int numerador2;

        Fraccion fraccion1 = new Fraccion();
        Fraccion fraccion2 = new Fraccion();
        Fraccion resultado = new Fraccion();


        System.out.println("Introduce el numerador de la primera fraccion");
        numerador1 = sc.nextInt();
        do {
            System.out.println("Introduce el denominador de la primera fraccion");
            denominador1 = sc.nextInt();

        } while (denominador1 < 0);

        System.out.println("Introduce el numerador de la segunda fraccion");
        numerador2 = sc.nextInt();

        do {
            System.out.println("Introduce el denominador de la segunda fraccion");
            denominador2 = sc.nextInt();

        }while (denominador2 < 0);

        if (numerador1 < 0 && numerador2 < 0) {
            numerador1 = numerador1 * -1;
            numerador2 = numerador2 * -1;
        }


        fraccion1.setNumerador(numerador1);
        fraccion1.setDenominador(denominador1);

        fraccion2.setNumerador(numerador2);
        fraccion2.setDenominador(denominador2);
        resultado.multiplicar(fraccion1, fraccion2);
        resultado.dividir(fraccion1, fraccion2);



    }
}

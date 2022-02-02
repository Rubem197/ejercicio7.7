package principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);


        int denominador1=0;
        int numerador1=0;
        int denominador2=0;
        int numerador2=0;

        Fraccion fraccion1 = new Fraccion();
        Fraccion fraccion2 = new Fraccion();
        Fraccion resultado = new Fraccion();

        System.out.println("Introduce el numerador de la primera fraccion");
        numerador1=sc.nextInt();

        System.out.println("Introduce el denominador de la primera fraccion");
        denominador1=sc.nextInt();

        System.out.println("Introduce el numerador de la segunda fraccion");
        numerador2=sc.nextInt();

        System.out.println("Introduce el denominador de la segunda fraccion");
        denominador2=sc.nextInt();


        fraccion1.setNumerador(numerador1);
        fraccion1.setDenominador(denominador1);

        fraccion2.setNumerador(numerador2);
        fraccion2.setDenominador(denominador2);
        resultado.multiplicar(fraccion1, fraccion2);

        System.out.println(resultado.toString());




    }
}

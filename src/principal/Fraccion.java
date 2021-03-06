package principal;

import java.sql.SQLOutput;

public class Fraccion {

    private int numerador;
    private int denominador;


    public Fraccion() {

    }

    public void multiplicar(Fraccion fraccion1, Fraccion fraccion2) {

        Fraccion resultado = new Fraccion();
        resultado.setNumerador(fraccion1.getNumerador() * fraccion2.getNumerador());
        resultado.setDenominador(fraccion1.getDenominador() * fraccion2.getDenominador());
        fraccionar(resultado);
        System.out.println( soltarResultado(resultado));

    }

    public void dividir(Fraccion fraccion1, Fraccion fraccion2) {

        Fraccion resultado = new Fraccion();
        resultado.setNumerador(fraccion1.getNumerador() * fraccion2.getDenominador());
        resultado.setDenominador(fraccion2.getNumerador() * fraccion1.getDenominador());

        fraccionar(resultado);
        System.out.println( soltarResultado(resultado));
    }

    private void fraccionar(Fraccion resultado) {
        if (resultado.getNumerador() % Math.min(resultado.getNumerador(), resultado.getDenominador()) == 0 && resultado.getDenominador() % Math.min(resultado.getNumerador(), resultado.getDenominador()) == 0) {

            resultado.setNumerador(resultado.getNumerador() / Math.min(resultado.getNumerador(), resultado.getDenominador()));
            resultado.setDenominador(resultado.getDenominador() / Math.min(resultado.getNumerador(), resultado.getDenominador()));

        }
    }

    public int getNumerador() {

        return numerador;
    }

    public void setNumerador(int numerador) {

        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {

        if (denominador > 0) {
            this.denominador = denominador;
        }
    }

    public String soltarResultado( Fraccion resultado) {

        return " El resultado es:  " + resultado.getNumerador() + "  y " + resultado.getDenominador();
    }


}

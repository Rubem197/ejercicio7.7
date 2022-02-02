package principal;

public class Fraccion {

        private int numerador;
        private int denominador;


    public Fraccion() {

    }


    public Fraccion(int numerador, int denominador){

            this.numerador=numerador;
            this.denominador=denominador;

        }



    public Object  multiplicar(Fraccion fraccion1, Fraccion fraccion2){


            Fraccion resultado = new Fraccion();

            resultado.setNumerador(fraccion1.getNumerador() * fraccion2.getNumerador());
            resultado.setDenominador(fraccion1.getDenominador() * fraccion2.getDenominador());

            return resultado;

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

            if(denominador>0) {
                this.denominador = denominador;
            }
    }
    public String toString(){

        return " El resultado es:  " + getNumerador() + "  y " + getDenominador();
    }







}

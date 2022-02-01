package principal;

public class Fraccion {

        private int numerador;
        private int denominador;

        public Fraccion(){

            this.numerador=numerador;
            this.denominador=denominador;

        }


        public int multiplicar(Fraccion fraccion1, Fraccion fraccion2){


            int nominador;
            int denominador;

            nominador= fraccion1.getNumerador() * fraccion2.getNumerador();
            denominador= fraccion1.getDenominador() * fraccion2.getDenominador();

            return nominador ;

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







}

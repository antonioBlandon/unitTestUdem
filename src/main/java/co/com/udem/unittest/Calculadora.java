package co.com.udem.unittest;

public class Calculadora {
    public String calcular(int numeroArabigo) {
        return construirRomano(numeroArabigo);
    }

    public String construirRomano(int input) {
        if ( input < 10 ) {
            return construirRomanoUnidades(input);
        } else {
            return "X";
        }
    }

    public String construirRomanoUnidades(int unidades) {
        String romano = "";

        if (unidades == 9) {
            romano = "IX";
        } else if (unidades >= 5 ) {
            romano = "V";
            for( int i = 6; i <= unidades; i++ ) {
                romano += "I";
            }
        } else if( unidades == 4 ) {
            romano = "IV";
        } else {
            for( int i = 1; i <= unidades; i++ ) {
                romano += "I";
            }
        }
        return romano;
    }
}
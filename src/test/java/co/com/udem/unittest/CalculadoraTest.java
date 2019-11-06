package co.com.udem.unittest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class CalculadoraTest {
    Calculadora calculadora;

    @BeforeEach
    public void setup() {
        calculadora = new Calculadora();
        calculadora = Mockito.spy(calculadora);
    }

    @Test
    public void cuandoIngresa5EntoncesRetornaV() {
        Mockito.when(calculadora.construirRomano(Mockito.anyInt())).thenReturn("V");

        String respuesta = calculadora.calcular(5);
        assertThat(respuesta, equalTo("V"));
    }

    @Test
    public void cuandoIngresa1EntoncesRetornaI() {
        String respuesta = calculadora.calcular(1);
        assertThat(respuesta, equalTo("I"));
    }

    @Test
    public void cuandoIngresa10EntoncesRetornaX() {
        String respuesta = calculadora.calcular(10);
        assertThat(respuesta, equalTo("X"));
    }

    @Test
    public void cuandoIngresa2EntoncesRetornaII() {
        String respuesta = calculadora.calcular(2);
        assertThat(respuesta, equalTo("II"));
    }

    @Test
    public void cuandoIngresa3EntoncesRetornaIII() {
        String respuesta = calculadora.calcular(3);
        assertThat(respuesta, equalTo("III"));
    }

    @Test
    public void cuandoIngresa4EntoncesRetornaIV() {
        String respuesta = calculadora.calcular(4);
        assertThat(respuesta, equalTo("IV"));
    }

    @Test
    public void cuandoIngresa6EntoncesRetornaVI() {
        String respuesta = calculadora.calcular(6);
        assertThat(respuesta, equalTo("VI"));
    }
}

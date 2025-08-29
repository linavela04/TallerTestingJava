package taller12Testing.ejercicio4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnvioTest {
    private Envio envio;

    @Before
    public void setUp(){
        envio = new Envio();
    }

    @Test
    public void pedido3kg(){
        double resultado = envio.calcularCosto(3.0);
        assertEquals(10.0,resultado,0.001);
    }
    @Test
    public void pedido10kg(){
        double resultado = envio.calcularCosto(10.0);
        assertEquals(25.0,resultado,0.001);
    }
    @Test
    public void pedido25kg(){
        double resultado = envio.calcularCosto(25.0);
        assertEquals(50.0,resultado,0.001);
    }

}

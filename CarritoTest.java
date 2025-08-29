package taller12Testing.ejercicio2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarritoTest {
    private Carrito carrito;

    @Before
    public void setUp(){
        carrito = new Carrito();
    }

    @Test
    public void carroVacio(){
        boolean resultado = carrito.estaVacio();
        assertEquals(true,resultado);
    }

    @Test
    public void carro1Item(){
        carrito.agregarProductos("Producto1");
        boolean resultado = carrito.estaVacio();
        assertEquals(false,resultado);
    }

    @Test
    public void carroVarios(){
        carrito.agregarProductos("Producto1");
        carrito.agregarProductos("Producto2");
        carrito.agregarProductos("Producto3");
        int resultado = carrito.getCantidadProductos();
        assertEquals(3,resultado);
    }

}

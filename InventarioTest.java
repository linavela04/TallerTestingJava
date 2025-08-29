package taller12Testing.ejercicio3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class InventarioTest {
    private Inventario inventario;

    @Before
    public void setUp(){
        inventario = new Inventario(4);
    }

    @Test
    public void aumentarStock(){
        int resultado = inventario.agregarStock(2);
        assertEquals(6,resultado);
    }

    @Test
    public void disminuirStock(){
        int resultado = inventario.reducirStock(2);
        assertEquals(2,resultado);
    }

    @Test
    public void stockMayor(){
        int resultado = inventario.reducirStock(5);
        assertEquals("No hay stock suficiente",resultado);;
    }
    @Test(expected = IllegalArgumentException.class)
    public void stockMayorDebeLanzarExcepcion() {
        inventario.reducirStock(5); // stock actual es 4 → debería lanzar excepción
    }
    @Test
    public void stockMayor2() {
        assertThrows(IllegalArgumentException.class, () -> {
            inventario.reducirStock(5);
        });
    }
}

package taller12Testing.ejercicio2;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<String> carritoCompras;

    public Carrito(){
        carritoCompras = new ArrayList<>();
    }

    public void agregarProductos(String producto){
        carritoCompras.add(producto);
        System.out.println("Se agrego el producto: " + producto);
    }

    public boolean estaVacio(){
        return carritoCompras.isEmpty();
    }

    public int getCantidadProductos(){
        return carritoCompras.size();
    }
}

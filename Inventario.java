package taller12Testing.ejercicio3;

public class Inventario {
    private int stock;

    public Inventario(int stock) {
        this.stock = stock;
    }

    public int agregarStock(int cantidad){
        stock += cantidad;
        return stock;
    }

    public int reducirStock(int cantidad){
        if(cantidad > stock){
            throw new IllegalArgumentException("No hay stock suficiente");
        }
        stock -= cantidad;
        return stock;

    }

    public int getStock(){
        return stock;
    }

}

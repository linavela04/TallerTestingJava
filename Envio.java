package taller12Testing.ejercicio4;

public class Envio {
    public double calcularCosto(double peso){
        if(peso > 0 && peso <= 5){
            return 10.0;
        }else if(peso <=20){
            return 25.0;
        }else if(peso > 20){
            return 50.0;
        }else{
            throw new IllegalArgumentException("No puede ser 0");
        }
    }
}

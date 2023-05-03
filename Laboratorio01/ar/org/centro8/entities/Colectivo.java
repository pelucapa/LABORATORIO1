package ar.org.centro8.entities;

public final class Colectivo extends Vehiculo {
    public Colectivo(String color, String marca, String modelo, double precio, String marcaRadio, int potencia){
        super(color, marca, modelo, precio, marcaRadio, potencia);
    }
    
    public Colectivo(String color, String marca, String modelo, double precio){
        super(color, marca, modelo, precio);
    }

    public Colectivo(String color, String marca, String modelo){
        super(color, marca, modelo);
    }
}

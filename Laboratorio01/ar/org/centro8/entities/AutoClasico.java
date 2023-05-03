package ar.org.centro8.entities;

public class AutoClasico extends Vehiculo {
    public AutoClasico (String color, String marca, String modelo, double precio, String marcaRadio, int potencia){
        super(color, marca, modelo, precio, marcaRadio, potencia);
    }

    public AutoClasico (String color, String marca, String modelo, double precio){
        super(color, marca, modelo, precio);
    }

    public AutoClasico (String color, String marca, String modelo){
        super(color, marca, modelo);
    }
}

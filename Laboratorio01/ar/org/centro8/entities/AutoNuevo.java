package ar.org.centro8.entities;

public class AutoNuevo extends Vehiculo {
    public AutoNuevo (String color, String marca, String modelo, double precio, String marcaRadio, int potencia){
        super(color, marca, modelo, precio, marcaRadio, potencia);
    }

    public AutoNuevo(String color, String marca, String modelo, String marcaRadio, int potencia){
        super(color, marca, modelo, marcaRadio, potencia);
    }
    
}

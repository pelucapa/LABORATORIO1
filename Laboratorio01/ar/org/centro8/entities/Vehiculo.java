package ar.org.centro8.entities;
public abstract class Vehiculo {
    
    private String color;
    private String marca;
    private String modelo;
    private double precio;
    private Radio radio;

    public Vehiculo(String color, String marca, String modelo, double precio, String marcaRadio, int potencia) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.radio = new Radio(marcaRadio, potencia);
    }

    public Vehiculo(String color, String marca, String modelo, double precio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Vehiculo(String color, String marca, String modelo, String marcaRadio, int potencia) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.radio = new Radio(marcaRadio, potencia);
    }

    public Vehiculo(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }    

    public void agregarRadio(String marcaRadio, int potencia){
        this.radio = new Radio(marcaRadio, potencia);
    }


    @Override
    public String toString() {
        return "Vehiculo [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
                + ", radio=" + radio + "]";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Radio getRadio() {
        return radio;
    }

    

    



}
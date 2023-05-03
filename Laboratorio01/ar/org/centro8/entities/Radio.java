package ar.org.centro8.entities;

public class Radio {
    String marcaRadio;
    int potencia;

    public Radio(String marca, int potencia) {
        this.marcaRadio = marca;
        this.potencia = potencia;
    }  

    @Override
    public String toString() {
        return " [marca=" + marcaRadio + ", potencia=" + potencia + "]";
    }

    public String getMarca() {
        return marcaRadio;
    }

    public void setMarca(String marca) {
        this.marcaRadio = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }




}

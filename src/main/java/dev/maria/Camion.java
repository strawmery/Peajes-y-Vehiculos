package dev.maria;

public class Camion extends Vehiculo {
    private int ejes;
    
    public Camion(String placa, int ejes) {
        super(placa);
        this.ejes = ejes;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    @Override
    public double calcularPeaje() {
        return  ejes * 50.0;
    }
}

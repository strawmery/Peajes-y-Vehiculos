package dev.maria;

public class Coche extends Vehiculo {
    
    public Coche(String placa) {
        super(placa);
    }

    @Override
    public double calcularPeaje() {
        return 100.0;
    }

}

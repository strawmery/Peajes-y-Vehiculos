package dev.maria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VehiculoTest {

    @Test
    void testPlacaCoche(){
        Vehiculo vehiculo = new Coche();
        vehiculo.setPlaca("ABC123");
        assertEquals("ABC123", vehiculo.getPlaca());
    }

    @Test
    void testCalcularPeajeCoche(){
        Vehiculo vehiculo = new Coche("abc123");
        assertEquals(100.0, vehiculo.calcularPeaje());
    }

    @Test
    void testPlacaMoto(){
        Vehiculo vehiculo = new Moto();
        vehiculo.setPlaca("ABC123");
        assertEquals("ABC123", vehiculo.getPlaca());
    }

    @Test
    void testCalcularPeajeMoto(){
        Vehiculo vehiculo = new Moto("abc123");
        assertEquals(50.0, vehiculo.calcularPeaje());
    }

    @Test
    void testPlacaCamion(){
        Vehiculo vehiculo = new Camion();
        vehiculo.setPlaca("ABC123");
        assertEquals("ABC123", vehiculo.getPlaca());
    }

    @Test
    void testCalcularPeaje(){
        Vehiculo vehiculo = new Camion("abc123",2);
        assertEquals(100.0, vehiculo.calcularPeaje());
    }

}

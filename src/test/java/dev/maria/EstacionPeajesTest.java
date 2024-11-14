package dev.maria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EstacionPeajesTest {

    @Test
    void testConstructor(){
        int id = 1;
        String nombre = "Peaje 1";
        String ciudad = "Ciudad 1";
        double totalPeajes = 10.0;
        EstacionPeajes peaje = new EstacionPeajes(id, nombre, ciudad, totalPeajes);
        assertEquals(id, peaje.getId());
        assertEquals(nombre, peaje.getNombre());
        assertEquals(ciudad, peaje.getCiudad());
        assertEquals(totalPeajes, peaje.getTotalPeajes());
    }

    @Test
    void testId(){
        EstacionPeajes peaje = new EstacionPeajes();
        peaje.setId(1);
        assertEquals(1, peaje.getId());
    }

    @Test
    void testNombre(){
        EstacionPeajes peaje = new EstacionPeajes();
        peaje.setNombre("test");
        assertEquals("test", peaje.getNombre());
    }

    @Test
    void testCiudad(){
        EstacionPeajes peaje = new EstacionPeajes();
        peaje.setCiudad("test");
        assertEquals("test", peaje.getCiudad());
    }

    @Test    void testTotalPeajes(){
        EstacionPeajes peaje = new EstacionPeajes();
        peaje.setTotalPeajes(10.0);
        assertEquals(10.0, peaje.getTotalPeajes());
    }

    @Test
    void testCobrarPeajeConUnVehiculo() {
        EstacionPeajes estacion = new EstacionPeajes(1,"Estación Test", "Ciudad Test",0);
        Vehiculo coche = new Coche("ABC123");
        double totalPeajes = estacion.cobrarPeaje(coche);
        
        assertEquals(100.0, totalPeajes);
        assertEquals(1, estacion.getVehiculos().size());
        assertTrue(estacion.getVehiculos().contains(coche));
    }
}

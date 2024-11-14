package dev.maria;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
}

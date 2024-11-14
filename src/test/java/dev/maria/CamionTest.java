package dev.maria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CamionTest {
    @Test
    void testEjesCamion(){
        Camion camion = new Camion();
        camion.setEjes(4);
        assertEquals(4, camion.getEjes());
    }
}

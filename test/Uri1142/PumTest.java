/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1142;

import org.junit.Test;
import static org.junit.Assert.*;

public class PumTest {
    
    public PumTest() {
    }

    /**
     * Test of gerarSequencia method, of class Pum.
     */
    @Test
    public void testGerarSequencia() {
        Pum pum = new Pum();
        String experado = "1 2 3 PUM\n";
        String result = pum.gerarSequencia(1);
        assertEquals(experado, result);
    }
}

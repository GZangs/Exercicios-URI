/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri2031;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel.zanghelini
 */
public class PedraPapelAtaqueTest {
    
    public PedraPapelAtaqueTest() {
    }
    
    @Test
    public void testMain() {
       System.out.println("Teste Pedra vs Pedra");
        pedraPapelAtaque jokenpo = new pedraPapelAtaque();
        String[] teste = {"pedra", "pedra"};
        int expResult = 3;
        int result = jokenpo.verificarVencedor(teste);
        assertEquals(expResult, result);
    }
}

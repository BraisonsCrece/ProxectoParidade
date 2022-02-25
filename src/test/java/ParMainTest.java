
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author A21BraisFD
 */
public class ParMainTest {
    
    public ParMainTest() {
    }

    /**
     * Test of main method, of class ParMain.
     */
    @Test
    @Disabled
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ParMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarParidade method, of class ParMain.
     */
    @Test
    public void testComprobarParidade() {
        System.out.println("comprobarParidade_cero");
        int numeroProba = 0;
        String expResult = "O número é par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComprobarParidade_1() {
        System.out.println("comprobarParidade_Par");
        int numeroProba = 100;
        String expResult = "O número é par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComprobarParidade_2() {
        System.out.println("comprobarParidade_Impar");
        int numeroProba = 101;
        String expResult = "O número é impar";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComprobarParidade_3() {
        System.out.println("comprobarParidade_NegativoPar");
        int numeroProba = -100;
        String expResult = "O número é par";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testComprobarParidade_4() {
        System.out.println("comprobarParidade_NegativoImpar");
        int numeroProba = -101;
        String expResult = "O número é impar";
        String result = ParMain.comprobarParidade(numeroProba);
        assertEquals(expResult, result);
    }
    
}

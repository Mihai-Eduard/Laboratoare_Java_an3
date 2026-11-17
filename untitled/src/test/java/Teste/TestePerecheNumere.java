package Teste;

import Ex2.PerecheNumere;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TestePerecheNumere {
    @Test
    void test1_fibonacci()
    {
        PerecheNumere pn=new PerecheNumere(8,5);
        assertTrue(pn.fibonacci());
    }
    @Test
    void test2_CMMMC()
    {
        PerecheNumere pn=new PerecheNumere(12,18);
        assertEquals(36,pn.CMMMC());
    }
}

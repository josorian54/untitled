import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SueldoTest {
    Sueldo sueldo = new Sueldo();

    @Test
    void testCalculaBruto() {
        double result = sueldo.calculaBruto('G', 5100);
        Assertions.assertEquals(515, result);
    }
    @Test
    void testCalculaBruto1() {
        double result = sueldo.calculaBruto('G', 3500);
        Assertions.assertEquals(550, result);
    }
    @Test
    void testCalculaBruto2() {
        double result = sueldo.calculaBruto('G', 2500);
        Assertions.assertEquals(375, result);
    }
    @Test
    void testCalculaBruto3() {
        double result = sueldo.calculaBruto('F', 4000);
        Assertions.assertEquals(1000, result);
    }
    @Test
    void testCalculaBruto4() {
        double result = sueldo.calculaBruto('F', 5000);
        Assertions.assertEquals(1250, result);
    }

    @Test
    void testCalculaRet() {
        double result = sueldo.calculaRet('G', 2000);
        Assertions.assertEquals(300, result);
    }
    @Test
    void testCalculaRet1() {
        double result = sueldo.calculaRet('G', 1100);
        Assertions.assertEquals(110, result);
    }
    @Test
    void testCalculaRet2() {
        double result = sueldo.calculaRet('G', 500);
        Assertions.assertEquals(25, result);
    }
    @Test
    void testCalculaRet3() {
        double result = sueldo.calculaRet('E', 1500);
        Assertions.assertEquals(75, result);
    }

    @Test
    void testCalculaNeto() {
        double result = sueldo.calculaNeto(0d, 0d);
        Assertions.assertEquals(0d, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction;

    @Before
    public void before() {
        fraction = new Fraction(2, 3);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(2, fraction.getNumerator());
        assertEquals(3, fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        this.fraction = new Fraction();
        assertEquals(1, this.fraction.getNumerator());
        assertEquals(1, this.fraction.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.6667, this.fraction.decimal(), 10e-5);
    }

    @Test
    public void testMultiplicar() {
        Fraction fraction1 = new Fraction(4, 5);
        assertEquals(0.533333, this.fraction.multiplicar(fraction1), 10e-5);
    }

    @Test
    public void testEsMayor() {
        Fraction fraction1 = new Fraction(1, 2);
        assertEquals(true, this.fraction.esMayor(fraction1));
    }

    @Test
    public void testEsPropia() {
        assertEquals(true, this.fraction.esPropia());
    }

}

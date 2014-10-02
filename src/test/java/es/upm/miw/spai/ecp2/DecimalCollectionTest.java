package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    private DecimalCollection collection;

    @Before
    public void before() {
        this.collection = new DecimalCollection();
        this.collection.add(0.0);
        this.collection.add(1.2);
        this.collection.add(2.8);
    }

    @Test
    public void testDecimalCollection() {
        this.collection = new DecimalCollection();
        assertEquals(0, this.collection.size());
    }

    @Test
    public void testAdd() {
        this.collection = new DecimalCollection();
        this.collection.add(2.2);
        assertEquals(2.2, this.collection.sum(), 10e-3);
    }

    @Test
    public void testSize() {
        assertEquals(3, this.collection.size());
    }

    @Test
    public void testSum() {
        assertEquals(4.0, this.collection.sum(), 10e-3);
    }

    @Test
    public void testHigher() {
        assertEquals(2.8, this.collection.higher(), 10e-3);
    }
    
    @Test
    public void testMedia(){
    	assertEquals(1.333, this.collection.media(), 10e-3);
    }

}

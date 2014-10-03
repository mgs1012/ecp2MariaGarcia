package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user;

    @Before
    public void before() {
        user = new User(8, "María", "Garcia");
    }

    @Test
    public void testUser() {
        assertEquals(8, this.user.getNumber());
        assertEquals("María", this.user.getName());
        assertEquals("Garcia", this.user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("María Garcia", this.user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("M.", this.user.initials());
    }
    @Test
    public void testMostrarNombreCompletoMayusculas() {
        assertEquals("Garcia,María", this.user.mostrarNombreCompletoMayusculas());
    }

}

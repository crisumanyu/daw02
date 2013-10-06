/*
 * Copyright (C) 2013 Administrador
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.rafaelaznar.tests;

import net.rafaelaznar.operaciones.JoesbaClass;
import net.rafaelaznar.operaciones.jogrboClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordi Eslava
 */
public class JoesbaClassTest {

    public JoesbaClassTest() {
        System.out.println("NewEmptyJUnitTest");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("beforeClass-setUpClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("afterClass-tearDownClass");
    }

    @Before
    public void setUp() {
        System.out.println("before-setUp");
    }

    @After
    public void tearDown() {
        System.out.println("after-tearDown");
    }

    @Test
    public void testGetNombreApellidos() {
        System.out.println("test: GetNombreApellidos()");
        JoesbaClass oJoesba = new JoesbaClass();
        assertNotNull("objeto oJoesba creado", oJoesba);
        oJoesba.setNombre("Jordi");
        oJoesba.setApellido("Eslava");
        oJoesba.setApellido2("Barrera");
        assertEquals("getNombre: Debe devolver Jordi", oJoesba.getNombre(), "Jordi");
        assertTrue("geApellido: Deve devolver Eslava", "Eslava".equals(oJoesba.getApellido()));
        assertTrue("geApellido2: Deve devolver Barrera", "Barrera".equals(oJoesba.getApellido2()));
        assertSame("prueba getReference", oJoesba, oJoesba.getReference());
        jogrboClass joesba2 = new jogrboClass();
        assertNotSame("no son el mismo objeto", oJoesba, joesba2);
    }
}

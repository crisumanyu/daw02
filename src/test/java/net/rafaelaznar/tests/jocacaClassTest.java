/*
 * Copyright (C) 2013 jorge
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

import net.rafaelaznar.operaciones.jocacaClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jorge
 */
public class jocacaClassTest {
    
        public jocacaClassTest() {
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
        System.out.println("test: GetNombreCompleto()");
        jocacaClass oJocaca = new jocacaClass();
        assertNotNull("objeto Jocaca creado", oJocaca);
        assertEquals("getNombre: Debe devolver Jorge", oJocaca.getNombre(), "Jorge");
        assertTrue("getApellido1: Deve devolver Caballero", "Caballero".equals(oJocaca.getApellido1()));
        assertTrue("getApellido2: Deve devolver Cardona", "Cardona".equals(oJocaca.getApellido2()));
        if (!oJocaca.getNombre().equals("Jorge")) {
            fail("getNombre: Nombre distinto de Jorge");
        }
        assertSame("prueba getReference", oJocaca, oJocaca.getReference());
        jocacaClass oJocaca2 = new jocacaClass();
        assertNotSame("no son el mismo objeto", oJocaca, oJocaca2);
    }
}

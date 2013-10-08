/*
 * Copyright (C) 2013 cris
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

import net.rafaelaznar.operaciones.crmamoClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author cris
 */


public class crmamoClassTest {
    
    
   public crmamoClassTest() {
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
    public void testGetNombreCompleto() {
        
        System.out.println("test: getNombreCompleto");
        crmamoClass oCrmamo = new crmamoClass();
        assertNotNull("objeto nombre y apellidos creado", oCrmamo);
        assertEquals("getNombre: Devuelve Cristina", oCrmamo.getNombre(), "Cristina");
        assertTrue("getApellido1: Martin", "Martin".equals(oCrmamo.getApellido1()));
         assertTrue("getApellido2: Molina", "Molina".equals(oCrmamo.getApellido2()));
        if (!oCrmamo.getNombre().equals("Cristina")) {
            fail("getNombre: Nombre incorrecto");
        }
        assertSame("prueba getReference", oCrmamo, oCrmamo.getReference());
        crmamoClass oCrmamo2 = new crmamoClass();
        assertNotSame("no son el mismo objeto", oCrmamo, oCrmamo2);
    }
    
}

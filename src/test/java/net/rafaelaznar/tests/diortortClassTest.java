package net.rafaelaznar.tests;

/*
 * Copyright (C) 2013 Diana
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

import net.rafaelaznar.operaciones.diortortClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diana
 */
public class diortortClassTest {

    public diortortClassTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetNombreCompleto() {
        System.out.println("test: GetNombreCompleto()");
        diortortClass odiortort = new diortortClass();
        assertNotNull("objeto diortort creado", odiortort);
        odiortort.setNombre("Diana");
        assertEquals("getNombre: Debe devolver Diana", odiortort.getNombre(), "Diana");
        odiortort.setApellido1("Ortega");
        assertEquals("getApellido1: Debe devolver Ortega", odiortort.getApellido1(), "Ortega");
        odiortort.setApellido2("Ortega");
        assertEquals("getApellido2: Debe devolver Ortega", odiortort.getApellido2(), "Ortega");

        diortortClass odiortort2 = new diortortClass();
        assertNotSame("no son el mismo objeto", odiortort, odiortort2);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

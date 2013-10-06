/*
 * Copyright (C) 2013 Jose Mari
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

import net.rafaelaznar.operaciones.anrialClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Mari
 */
public class anrialClassTest {
    
    public anrialClassTest() {
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
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void anrialClass() {
        
        System.out.println("test: getNombreCompleto()");
        anrialClass oAnrial = new anrialClass();
        assertNotNull("objeto anrial creado", oAnrial);
        oAnrial.setNombre("Ana");
        oAnrial.setApellido1("Riquelme");
        oAnrial.setApellido2("Alfonso");
        assertEquals("getNombre: Debe devolver Alvaro", oAnrial.getNombre(),"Ana");
        assertEquals("getApellido1: Debe devolver Riquelme", oAnrial.getApellido1(),"Riquelme");
        assertEquals("getApellido1: Debe devolver Alfonso", oAnrial.getApellido2(),"Alfonso");
        assertEquals("getNombreCompleto: Debe devolver Ana Riquelme Alfonso", oAnrial.getNombreCompleto(), "Ana Riquelme Alfonso");
    }
}
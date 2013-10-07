/*
 * Copyright (C) 2013 Enrique
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

import net.rafaelaznar.operaciones.engigiClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Enrique
 */
public class engigiClassTest {
    
    public engigiClassTest() {
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
        System.out.println("test: getNombreCompleto()");
        engigiClass oEngigi = new engigiClass();
        assertNotNull("objeto alcrta creado", oEngigi);
        oEngigi.setNombre("Enrique");
        oEngigi.setApellido("Gimeno");
        oEngigi.setApellido2("Gilabert");
        assertEquals("getNombre: Debe devolver Enrique", oEngigi.getNombre(), "Enrique");
        assertEquals("getApellido: Debe devolver Gimeno", oEngigi.getApellido(), "Gimeno");
        assertEquals("getApellido2: Debe devolver Gilabert", oEngigi.getApellido2(), "Gilabert");
        assertEquals("getNombreCompleto: Debe devolver Enrique Gimeno Gilabert", oEngigi.getNombreCompleto(), "Enrique Gimeno Gilabert");
        
        
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
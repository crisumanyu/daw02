/*
 * Copyright (C) 2013 Alvaro
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
package net.rafaelaznar.operaciones;

/**
 *
 * @author Alvaro
 */
public class alcrtaClass {

    private String nombre = "";
    private String apellido = "";
    private String apellido2 = "";

    /**
     * Metodo que devuelve/retorna el nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que asigna el nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que devuelve/retorna el primer apellido
     *
     * @return primer apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo que asigna el apellido
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Metodo que devuelve/retorna el segundo apellido
     *
     * @return segundo apellido
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Metodo que asigna el segundo apellido
     *
     * @param apellido2
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido + " " + apellido2;
    }

}

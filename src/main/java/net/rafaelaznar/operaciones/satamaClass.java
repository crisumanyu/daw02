/*
 * Copyright (C) 2013 unolimitado
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
 * @author Salva Tamarit
 * @version %I%, %G%
 * @date 06-10-2013
 */
public class satamaClass {
    /**
     * Declaración de Variables.
     */
    private String nombre = "Salva";
    private String apellidoUno = "Tamarit";
    private String apellidoDos = "Martínez";

    

    /**
     * Devuelve el nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Asinga el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve el primer apellido
     * @return apellidoUno
     */
    public String getApellidoUno() {
        return apellidoUno;
    }
    /**
     * Asigna el primer apellido
     * @param apellidoUno 
     */
    public void setApellidoUno(String apellidoUno) {
        this.apellidoUno = apellidoUno;
    }
    /**
     * Devuelve el segundo apellido
     * @return apellidoDos
     */
    public String getApellidoDos() {
        return apellidoDos;
    }
    /**
     * Asigna el segundo apellido
     * @param apellidoDos 
     */
    public void setApellidoDos(String apellidoDos) {
        this.apellidoDos = apellidoDos;
    }
    /**
     * Devuelve el nombre comleto formado por el nombre y los dos apellidos separados
     * por un espacio en blanco
     * @return nombre y apellidos
     */
    public String getNombreCompleto() {
        return nombre + " " + apellidoUno + " " + apellidoDos;
    }
    
    
}

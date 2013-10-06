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
package net.rafaelaznar.operaciones;

/**
 *
 * @author Jordi Eslava Barrera Fecha 06-10-2013
 */
public class JoesbaClass {

    /**
     * Declaración de Variables.
     */
    private String Nombre = "";
    private String Apellido = "";
    private String Apellido2 = "";

    /**
     * Método que devuelve el nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Método que establece el Nombre
     *
     * @return
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Método que devuelve el Apellido
     *
     * @return Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * Método que establece el Apellido
     *
     * @return
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * Método que devuelve el Apellido2
     *
     * @return Apellido2
     */
    public String getApellido2() {
        return Apellido2;
    }

    /**
     * Método que establece el Apellido2
     *
     * @return
     */
    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    /**
     * Método que devuelve el Nombre y los Apellidos con formato
     *
     * @retorna Nombre + Apellido + Apellido2
     */
    public String getNombreApellidos() {
        return Nombre + " " + Apellido + " " + Apellido2;
    }

    /**
     * Para obtener la referencia a este objeto
     *
     * @return referencia al objeto
     */
    public JoesbaClass getReference() {
        return this;
    }
}

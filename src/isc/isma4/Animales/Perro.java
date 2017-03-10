/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.Animales;

/**
 *
 * @author Black Jack
 */
public class Perro extends especie {

    public String woof;

    @Override
    public String getSonido() {
        return woof;
    }

}

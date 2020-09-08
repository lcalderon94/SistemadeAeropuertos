/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aeropuerto;

/**
 *
 * @author luis
 */
public class AeropuertoPublico extends Aeropuerto {
    private double subvencion;

    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoPublico(String nombre, String ciudad, String pais, Compañia[] c,double sub) {
        super(nombre, ciudad, pais, c);
        this.subvencion = sub;
    }

    public AeropuertoPublico(double subvencion, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    public double getSubvencion() {
        return subvencion;
    }
    
    
}

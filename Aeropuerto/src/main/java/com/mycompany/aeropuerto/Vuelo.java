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
public class Vuelo {
    
    private String identificador;
    private String ciudadDeOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;
    private int numActualPasajeros;
    private Pasajeros listaDePasajeros[];

    public Vuelo(String identificador, String ciudadDeOrigen, String ciudadDestino, double precio, int numMaxPasajeros) {
        this.identificador = identificador;
        this.ciudadDeOrigen = ciudadDeOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numActualPasajeros = 0;
        this.listaDePasajeros = new Pasajeros[numMaxPasajeros];
        
    }
    
    public void insertarPasajero(Pasajeros pasajero){
        listaDePasajeros[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadDeOrigen() {
        return ciudadDeOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }
    
    
    public Pasajeros getPasajero(int i){
        return listaDePasajeros[i];
    }
    
    public Pasajeros getPasajero(String pasaporte){
        boolean encontrado = false;
        
        int i=0;
        Pasajeros passport=null;
        while((!encontrado)&&(i<listaDePasajeros.length)){
            if(pasaporte == listaDePasajeros[i].getPasaporte()){
                encontrado = true;
                passport = listaDePasajeros[i];
                i++;
            }
            
        }
        return passport;
        
    }
}

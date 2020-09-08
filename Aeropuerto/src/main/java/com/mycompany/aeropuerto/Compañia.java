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
public class Compañia {
    private String nombre;
    private Vuelo listaDeVuelos[] = new Vuelo [10];
    private int numVuelo=0;

    public Compañia(String nombre) {
        this.nombre = nombre;
    }
    
    public Compañia(String nombre, Vuelo v[]){
        this.nombre = nombre;
        listaDeVuelos = v;
        numVuelo = v.length;
    }
    
    public void insertarVuelo(Vuelo vuelo){
        listaDeVuelos[numVuelo] = vuelo;
        numVuelo++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumVuelo() {
        return numVuelo;
    }
    
    public Vuelo getVuelo(int i){
        return listaDeVuelos[i];
    }
    
    public Vuelo getVuelo(String id){
        boolean encontrado = false;
        int i=0;
        
        Vuelo v = null;
        while((!encontrado)&&(i<listaDeVuelos.length)){
            if(id.equals(listaDeVuelos[i].getIdentificador())){
                encontrado = true;
            v = listaDeVuelos[i];
            }
            i++;
        }
        return v;
    }
    
    
    
}

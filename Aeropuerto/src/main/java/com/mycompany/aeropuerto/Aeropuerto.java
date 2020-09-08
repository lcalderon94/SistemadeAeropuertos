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
public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private String pais;
    private Compañia listaDeCompañias[] = new Compañia[10];
    private int numCompañia;

    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompañia = 0;
    }
    
    public Aeropuerto(String nombre, String ciudad, String pais, Compañia c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        listaDeCompañias = c;
        this.numCompañia = c.length;
    }

    
    
    public void insertarCompañia(Compañia compañia){
        listaDeCompañias[numCompañia] = compañia;
        numCompañia++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compañia[] getListaDeCompañias() {
        return listaDeCompañias;
    }

    public int getNumCompañia() {
        return numCompañia;
    }
    
    public Compañia getCompañia(int i){
        return listaDeCompañias[i];
    }
    
    public Compañia getCompañia(String nombre){
        boolean encontrado = false;
        int i=0;
        Compañia c = null;
        while((!encontrado)&&(i<listaDeCompañias.length)){
            if(nombre==listaDeCompañias[i].getNombre()){
                encontrado = true;
                c = listaDeCompañias[i];
            }
            i++;
        }
        
        return c;
        
    }
    
    
    
    
    
}

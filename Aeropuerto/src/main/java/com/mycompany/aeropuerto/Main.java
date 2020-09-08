/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aeropuerto;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    final static int num = 4;//Numero de aeropuertos
    
    static Aeropuerto aeropuertos[] = new Aeropuerto[num];
    
    public static void main(String[] args){
       insertarDatosAeropuerto(aeropuertos);
       menu();
       
       
    }
    
    public static void insertarDatosAeropuerto(Aeropuerto a[]){
        
        a[0] = new AeropuertoPublico(80000000,"Ruben barajas","España","Madrid");
        a[0].insertarCompañia(new Compañia("AirFrance"));
        a[0].insertarCompañia(new Compañia("TAP"));
        a[0].getCompañia("TAP").insertarVuelo(new Vuelo("0001","Madrid","Venezuela",990.99,300));
        a[0].getCompañia("AirFrance").insertarVuelo(new Vuelo("0002","Madrid","Italia",158.30,150));
        a[0].getCompañia("LATAM").insertarVuelo(new Vuelo("0003","Madrid","Barquisimeto",1200.99,500));
        a[0].getCompañia("AirFrance").getVuelo("0001").insertarPasajero(new Pasajeros("Luis","AB123456","Venezuela"));
        a[0].getCompañia("AirFrance").getVuelo("0001").insertarPasajero(new Pasajeros("Maria","OJKL20","Argentina"));
        a[0].getCompañia("TAP").getVuelo("0002").insertarPasajero(new Pasajeros("Raul","JH21KL","Peru"));
    
    
    }
    
    public static void menu(){
        int opcion;
        
        do{
            System.out.println("\t: MENU");
            System.out.println("1. Ver aeropuertos gestionados(publicos/privados)");
            System.out.println("2. Ver empresas(privado) o subvencion(publico)");
            System.out.println("3. Listas compañias de un Aeropuerto");
            System.out.println("4. Lista de vuelos por Compañía");
            System.out.println("5. Listar posibles vuelos de Origen a Destino");
            System.out.println("6. Salir.");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("");
                    mostrarDatosAeropuertos(aeropuertos);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4: 
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Elija un numero dentro del menú porfavor");
                    break;
            }
            System.out.println("");
            
            
        }while(opcion!=6);
    }
    
    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
       for(int i=0;i<aeropuertos.length;i++){
           if(aeropuertos[i] instanceof AeropuertoPrivado){
               System.out.println("Aeropuerto privado");
               System.out.println("Nombre: "+aeropuertos[i].getNombre());
               System.out.println("Ciudad: "+aeropuertos[i].getPais());
               System.out.println("Pais: "+aeropuertos[i].getPais());
       }else{
               System.out.println("Aeropuerto publico");
               System.out.println("Nombre: "+aeropuertos[i].getNombre());
               System.out.println("Ciudad: "+aeropuertos[i].getPais());
               System.out.println("Pais: "+aeropuertos[i].getPais());
           }
           System.out.println("");
       }
        
        
    }
    
    
    
}

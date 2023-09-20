/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;

import java.util.ArrayList;
import zooAnimales.*;

/**
 *
 * @author david
 */
public class Zoologico {
    private String _nombre;
    private String _ubicacion;
    private static ArrayList <Zona> _zona = new ArrayList <>();
    
    public Zoologico(String nombre, String ubicacion){
        this._nombre = nombre;
        this._ubicacion = ubicacion;
    }
    
    public Zoologico(){
        
    }
    
    public static void agregarZonas(Zona zona){
        Zoologico._zona.add(zona);
    }
    
    public int cantidadTotalAnimales(){
        return Animal.getTotalAnimales();
    }
    
    public String getNombre(){
        return this._nombre;
    }
    
    public void setNombre(String nombre){
        this._nombre = nombre;
    }
    
    public String getUbicacion(){
        return this._ubicacion;
    }
    
    public void setUbicacion(String ubicacion){
        this._ubicacion = ubicacion;
    }
    
    public ArrayList<Zona> getZona(){
        return Zoologico._zona;
    }
    
    public void setZona(Zona zona){
        Zoologico._zona.add(zona);
    }
}

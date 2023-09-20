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
public class Zona {
    private String _nombre;
    private Zoologico _zoo;
    private ArrayList <Animal> _animales = new ArrayList <>();
    
    public Zona(String nombre, Zoologico zoo){
        this._nombre = nombre;
        this._zoo = zoo;
    }
    
    public Zona(){
        
    }
    
    public void agregarAnimales(Animal animal){
        this._animales.add(animal);
        animal.setZona(this);
        Animal.sumarAnimal();
    }
    
    public int cantidadAnimales(){
        return this._animales.size();
    }
    
    public String getNombre(){
        return this._nombre;
    }
    
    public void setNombre(String nombre){
        this._nombre = nombre;
    }
    
    public Zoologico getZoo(){
        return this._zoo;
    }
    
    public void setZoo(Zoologico zoo){
        this._zoo = zoo;
    }
    
    public ArrayList getAnimales(){
        return this._animales;
    }
    
    public void setAnimales(Animal animales){
        this._animales.add(animales);
    }
    
    
}

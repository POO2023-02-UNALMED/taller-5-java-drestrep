/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooAnimales;
import gestion.Zona;

/**
 *
 * @author david
 */
public class Animal {
    private static int _totalAnimales;
    private String _nombre;
    private int _edad;
    private String _habitat;
    private String _genero;
    private Zona _zona;
    
    public Animal(){
        
    }

    public Animal(String nombre, int edad, String habitat, String genero){
        this._nombre = nombre;
        this._edad = edad;
        this._habitat = habitat;
        this._genero = genero;
    }
    
    public String movimiento(){
        return "desplazarse";
    }
    
    public static String totalPorTipo(){
        return("Mamiferos: " + Mamifero.getListado().size()+ "\nAves: "+ Ave.getListado().size() + "\nReptiles: " + Reptil.getListado().size() + "\nPeces: " + Pez.getListado().size() + "\nAnfibios: " + Anfibio.getListado().size());
    }
    
    @Override
    public String toString(){
        if (this._zona != null){
            return "Mi nombre es " + this._nombre + ", tengo una edad de " + this._edad + ", habito en " + this._habitat + " y mi genero es " + this._genero + ", la zona en la que me ubico es " + this._zona + ", en el zoo " + this._zona.getZoo();
        }
        else{
            return "Mi nombre es " + this._nombre + ", tengo una edad de " + this._edad + ", habito en " + this._habitat + " y mi genero es " + this._genero;
        }
    }
    
    public static int getTotalAnimales(){
        return Animal._totalAnimales;
    }
    
    public static void sumarAnimal(){
        Animal._totalAnimales = _totalAnimales+1;
    }
    
    public String getNombre(){
        return this._nombre;
    }
    
    public void setNombre(String nombre){
        this._nombre = nombre;    
    }
    
    public int getEdad(){
        return this._edad;
    }
    
    public void setEdad(int edad){
        this._edad = edad;    
    }
    
    public String getHabitat(){
        return this._habitat;
    }
    
    public void setHabitat(String habitat){
        this._habitat = habitat;    
    }
    
    public String getGenero(){
        return this._genero;
    }
    
    public void setGenero(String genero){
        this._genero = genero;    
    }
    
    public Zona getZona(){
        return this._zona;
    }
    
    public void setZona(Zona zona){
        this._zona = zona;
    }
    
}
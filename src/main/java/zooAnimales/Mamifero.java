/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;
/**
 *
 * @author david
 */
public class Mamifero extends Animal{
    private static ArrayList <Mamifero> _listado = new ArrayList <>();
    public static int caballos;
    public static int leones;
    private boolean _pelaje;
    private int _patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this._pelaje = pelaje;
        this._patas = patas;
        Mamifero._listado.add(this);
    }
    
    public Mamifero(){
        Mamifero._listado.add(this);
    }
    
    public static int cantidadMamiferos(){
        return Mamifero._listado.size();
    }
    
    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero mamifero = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        Mamifero.caballos = Mamifero.caballos + 1;
        return mamifero;
    }
    
    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero mamifero = new Mamifero(nombre, edad, "selva", genero, true, 4);
        Mamifero.leones = Mamifero.leones + 1;
        return mamifero;
    }
    
    public static ArrayList getListado(){
        return Mamifero._listado;
    }
    
    public static void setListado(Mamifero mamifero){
        Mamifero._listado.add(mamifero);
    }
    
    public boolean isPelaje(){
        return this._pelaje; 
    }
    
    public void setPelaje(boolean pelaje){
        this._pelaje = pelaje;
    }
    
    public int getPatas(){
        return this._patas;    
    }
    
    public void setPatas(int patas){
        this._patas = patas;
    }
}

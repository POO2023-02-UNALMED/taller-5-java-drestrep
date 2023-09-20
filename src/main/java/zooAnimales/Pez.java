/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooAnimales;

import java.util.ArrayList;
import gestion.*;
/**
 *
 * @author david
 */
public class Pez extends Animal{
    private static ArrayList <Pez> _listado = new ArrayList <>();
    public static int salmones;
    public static int bacalaos;
    private String _colorEscamas;
    private int _cantidadAletas;
    
    public Pez(String nombre, int edad, String habitat, String genero, String colorescamas, int cantidadaletas) {
        super(nombre, edad, habitat, genero);
        this._colorEscamas = colorescamas;
        this._cantidadAletas = cantidadaletas;
        Pez._listado.add(this);
    }
    
    public Pez(){
        Pez._listado.add(this);
    }
    
    public static int cantidadPeces(){
        return Pez._listado.size();
    }
    
    @Override
    public String movimiento(){
        return "nadar";
    }
    
    public static Pez crearSalmon(String nombre, int edad, String genero){
        Pez pez = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        Pez.salmones = Pez.salmones + 1;
        return pez;
    }
    
    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez pez = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        Pez.bacalaos = Pez.bacalaos + 1;
        return pez;
    }
    
    public static ArrayList getListado(){
        return Pez._listado;
    }
    
    public static void setListado(Pez pez){
        Pez._listado.add(pez);
    }
    
    public String getColorEscamas(){
        return this._colorEscamas;
    }
    
    public void setColorEscamas(String colorescamas){
        this._colorEscamas = colorescamas;
    }
    
    public int getCantidadAletas(){
        return this._cantidadAletas;
    }
    
    public void setCantidadAletas(int cantidadaletas){
        this._cantidadAletas = cantidadaletas;
    }
    
}

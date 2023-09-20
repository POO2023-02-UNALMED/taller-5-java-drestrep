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
public class Anfibio extends Animal{
    private static ArrayList <Anfibio> _listado = new ArrayList <>();
    public static int ranas;
    public static int salamandras;
    private String _colorPiel;
    private boolean _venenoso;
    
    public Anfibio(String nombre, int edad, String habitat, String genero, String colorpiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this._colorPiel = colorpiel;
        this._venenoso = venenoso;
        Anfibio._listado.add(this);
    }
    
    public Anfibio(){
        Anfibio._listado.add(this);
    }
    
    public static int cantidadAnfibios(){
        return Anfibio._listado.size();
    }
    
    @Override
    public String movimiento(){
        return "saltar";
    }
    
    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio anfibio = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        Anfibio.ranas = Anfibio.ranas +1;
        return anfibio;
    }
    
    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio anfibio = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        Anfibio.salamandras = Anfibio.salamandras +1;
        return anfibio;
    }
    
    public static ArrayList getListado(){
        return Anfibio._listado;
    }
    
    public static void setListado(Anfibio anfibio){
        Anfibio._listado.add(anfibio);
    }
    
    public String getColorPiel(){
        return this._colorPiel;
    }
    
    public void setColorPiel(String colorpiel){
        this._colorPiel = colorpiel;
    }
    
    public boolean isVenenoso(){
        return this._venenoso;
    }
    
    public void setVenenoso(boolean venenoso){
        this._venenoso = venenoso;
    }
    
}

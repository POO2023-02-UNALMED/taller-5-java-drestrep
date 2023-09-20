/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zooAnimales;

import gestion.*;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Reptil extends Animal{
    private static ArrayList <Reptil> _listado = new ArrayList <>();
    public static int iguanas;
    public static int serpientes;
    private String _colorEscamas;
    private int _largoCola;
    
    public Reptil(String nombre, int edad, String habitat, String genero, String colorescamas, int largocola) {
        super(nombre, edad, habitat, genero);
        this._colorEscamas = colorescamas;
        this._largoCola = largocola;
        Reptil._listado.add(this);
    }
    
    public Reptil(){
        Reptil._listado.add(this);
    }
    
    public static int cantidadReptiles(){
        return Reptil._listado.size();
    }
    
    @Override
    public String movimiento(){
        return "reptar";
    }
    
    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil reptil = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        Reptil.iguanas = Reptil.iguanas + 1;
        return reptil;
    }
    
    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil reptil = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        Reptil.serpientes = Reptil.serpientes + 1;
        return reptil;
    }
    
    public static ArrayList getListado(){
        return Reptil._listado;
    }
    
    public static void setListado(Reptil reptil){
        Reptil._listado.add(reptil);
    }
    
    public String getColorEscamas(){
        return this._colorEscamas;     
    }
    
    public void setColorEscamas(String colorescamas){
        this._colorEscamas = colorescamas;
    }
    
    public int getLargoCola(){
        return this._largoCola;     
    }
    
    public void setLargoCola(int largocola){
        this._largoCola = largocola;
    }
    
    
}

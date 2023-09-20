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
public class Ave extends Animal{
    private static ArrayList <Ave> _listado = new ArrayList <>();
    public static int halcones;
    public static int aguilas;
    private String _colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorplumas) {
        super(nombre, edad, habitat, genero);
        this._colorPlumas = colorplumas;
        Ave._listado.add(this);
    }
    
    public Ave(){
        Ave._listado.add(this);
    }
    
    public static int cantidadAves(){
        return Ave._listado.size();
    }
    
    @Override
    public String movimiento(){
        return "volar";
    }
    
    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave ave = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        Ave.halcones = Ave.halcones + 1;
        return ave;
    }
    
    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave ave = new Ave(nombre, edad, "montanas", genero,"blanco y amarillo");
        Ave.aguilas = Ave.aguilas + 1;
        return ave;
    }
    
    public static ArrayList getListado(){
        return Ave._listado;     
    }
    
    public static void setLIstado(Ave ave){
        Ave._listado.add(ave);
    }
    
    public String getColorPlumas(){
        return this._colorPlumas;
    }
    
    public void setColorPlumas(String colorplumas){
        this._colorPlumas = colorplumas;
    }
}

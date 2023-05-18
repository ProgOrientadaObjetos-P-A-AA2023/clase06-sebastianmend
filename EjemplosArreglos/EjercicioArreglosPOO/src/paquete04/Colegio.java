/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author SALA I
 */
public class Colegio {
    private String nombre;
    private String ciudad;
    
    public Colegio (String n, String c){
        
        nombre=n;
                
        ciudad=c;        
    }

    public void establecernombre(String x){
        nombre=x;
        
    }
    
    public void stablecerCiudad(String x){
        ciudad=x;
    }
    
    public String ObtenerNombre(){
        return nombre;
        
        
    }
    
    public String obtenerCiudad(){
        return ciudad;
        
    }

    
    
}

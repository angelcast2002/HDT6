/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hdt6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Angel
 */
public class MAP {

    HashMap<String, ArrayList> Productos = new HashMap<String, ArrayList>();
    ArrayList <String> ListaDatos = new ArrayList<>();
    // ArrayList <String> NombreProductos = new ArrayList<>();

    public void SepararDatos(ArrayList datos) {
        
        for (int i = 0; i < datos.size(); i++) {

            String valor = (String) datos.get(i);
            String[] parts = valor.split("-");
            // String valor1 = parts[0];
            // String valor2 = parts[1];
            ListaDatos.add(parts[0]);
            ListaDatos.add(parts[1]);
            // System.out.println(ListaDatos.get(1));

            
        }
    }
  

    public void HashMap() {
        for (int i = 0; i < ListaDatos.size(); i++) {
            ArrayList <String> NombreProductos = new ArrayList<>();
            String key = ListaDatos.get(i);
            String value = ListaDatos.get(i+1);
            if (Productos.size() == 0) {
                NombreProductos.add(value);
                Productos.put(key, NombreProductos);
            } else {
                for (Map.Entry<String, ArrayList> m : Productos.entrySet()) {

                    System.out.println(m.getKey() + " : " + m.getValue());

                    if (m.getKey().equals(key)) {
    
                        NombreProductos = m.getValue();
                        NombreProductos.add(value);
                        Productos.put(key, NombreProductos);
                        break;
                    }
    
                    else {
    
                        NombreProductos.add(value);
                        Productos.put(key, NombreProductos);
                        // break;
                    }
                    
                    // System.out.println(m.getKey() + " : " + m.getValue());
                    
                }
            }
            
            
            i = i+1;
            
        }

    // for(Map.Entry<String,ArrayList> m : Productos.entrySet())
    // {
    //   System.out.println(m.getKey() + " : " + m.getValue());
    // }

        

        
    }
    

    public void TreeMap() {


        
    }

    public void LinkedHashMap() {


        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hdt6;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Angel
 */
public class MAP {

    HashMap<String, String> Productos = new HashMap<String, String>();
    ArrayList <String> ListaDatos = new ArrayList<>();

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
            String key = ListaDatos.get(i) + ListaDatos.get(i+1);
            String value = ListaDatos.get(i+1);
            Productos.put(key, value);
            i = i+1;
            
        }

        
    }

    public void TreeMap() {


        
    }

    public void LinkedHashMap() {


        
    }
}

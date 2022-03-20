package com.mycompany.hdt6;


import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.ArrayList;

public class Datos {
   
    public static ArrayList LeerDatos()throws IOException, FileNotFoundException{
        ArrayList <String> Datos = new ArrayList<>();
        String cadena;
        FileReader file = new FileReader("ListadoProducto.txt");
        BufferedReader b = new BufferedReader(file);

        while ((cadena = b.readLine()) != null) {
             Datos.add(cadena);

        }

        b.close();
        return Datos;
    } 
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hdt6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author angelcast
 * @param <T>
 */
public class Gen<T> {
    //T es el parámetro de tipo genérico.
    T ob; //Declara un objeto de tipo T

    //Pase al constructor una referencia a un objeto de tipo T.
    Gen(T o){
        ob=o;
    }

    T getOb(){
        return ob;
    }

    //Muestra el tipo de T
    void mostrarTipo(){
        System.out.println("El tipo de T es: "+ob.getClass().getName());
    }

    
    
}

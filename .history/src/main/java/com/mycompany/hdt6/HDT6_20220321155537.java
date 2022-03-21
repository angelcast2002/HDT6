/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hdt6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angelcast
 */
public class HDT6 {

    public static void main(String[] args) throws IOException {
        Datos datos = new Datos();
        Scanner sc = new Scanner(System.in);
        MAP map = new MAP();
        System.out.println("Ingrese \n1 Para Hasmap\n2 Para TreeMap\n3 Para LinkedHashMap");
        int key = sc.nextInt();
        sc.nextLine();
        boolean salir = false;
        ArrayList <String> Datos = new ArrayList<>();
        Datos = datos.LeerDatos(); 
        // Se modifico el archivo txt original a fin de retirar las tildes ya que provocan error de lectura
        map.SepararDatos(Datos);
        while (salir == false) {
            System.out.println("Ingrese \n1 Para Hasmap\n2 Para TreeMap\n3 Para LinkedHashMap");
            key = sc.nextInt();
            sc.nextLine();
            map.setHashUtilizado(key);
            switch (key) {
                case 1:
                    map.HashMap();
                    break;
                    
                case 2:
                    map.TreeMap();
                    break;
    
                case 3:
                    map.LinkedHashMap();
                    break;
    
                default:
                    System.out.println("Ingrese un valor valido");
                    salir = true;
                    break;
    
            }
        }
       

        while (salir == false) {
            System.out.println("Que desea hacer?");
            System.out.println("Ingrese: \n1 Para ingresar un producto \n2 Para buscar un producto\n3 Para saber los detalles de cada categoria\n4 Detalles de las categorias en orden\n5 Para Mostrar todos los productos y categorias\n6 Para Salir");
            int llave = sc.nextInt();
            sc.nextLine();
            switch (llave) {
                case 1:
                    System.out.println("Ingrese la categoria del producto");
                    String valor1 = sc.nextLine();
                    System.out.println("Ingrese el nombre del producto");
                    String valor2 = sc.nextLine();
                    System.out.println(map.AgregarValor(valor1, valor2));
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto a buscar");
                    String nombre = sc.nextLine();
                    System.out.println(map.NombreProducto(nombre));
                    break;
                case 3:
                    System.out.println(map.DatosDelProducto());
                    break;
                case 4:
                    System.out.println(map.DatosDelProductoConNombres());
                    break;
                case 5:
                    System.out.println(map.MostrarTodo());
                    break;
                case 6:
                    System.out.println("Saliendo");
                    salir = true;
                    break;
                default:
                    System.out.println("Ingrese un valor valido");
                    break;
            }
            
            
        }

        
        
        
    }
}

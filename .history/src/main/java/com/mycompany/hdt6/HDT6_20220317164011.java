/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hdt6;

import java.io.IOException;
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
                break;
                
        }

        while (salir == false) {

            
            
        }

        
        datos.LeerDatos();
        
    }
}

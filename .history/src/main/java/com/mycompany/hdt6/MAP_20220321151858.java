/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hdt6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Angel
 */
public class MAP {

    private HashMap<String, ArrayList> Productos = new HashMap<String, ArrayList>();
    private LinkedHashMap <String, ArrayList> ProductosLinked = new LinkedHashMap<String, ArrayList>();
    private TreeMap <String, ArrayList> ProductosTree = new TreeMap<String, ArrayList>();
    private ArrayList <String> ListaDatos = new ArrayList<>();
    private int HashUtilizado = 0;
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

                if (Productos.get(key) != null ) {
                    NombreProductos = Productos.get(key);
                    NombreProductos.add(value);
                    Productos.put(key, NombreProductos);

                } else {
                    NombreProductos.add(value);
                    Productos.put(key, NombreProductos);
                    
                }
                
            }
            
            
            i = i+1;
            
        }

     for(Map.Entry<String,ArrayList> m : Productos.entrySet())
    {
        System.out.println(m.getKey() + " : " + m.getValue());
    }

        

        
    }
    

    public void TreeMap() {
        for (int i = 0; i < ListaDatos.size(); i++) {
            ArrayList <String> NombreProductos = new ArrayList<>();
            String key = ListaDatos.get(i);
            String value = ListaDatos.get(i+1);
            if (ProductosTree.size() == 0) {
                NombreProductos.add(value);
                ProductosTree.put(key, NombreProductos);
            } else {
                
                if (ProductosTree.get(key) != null ) {
                    NombreProductos = ProductosTree.get(key);
                    NombreProductos.add(value);
                    ProductosTree.put(key, NombreProductos);

                } else {
                    NombreProductos.add(value);
                    ProductosTree.put(key, NombreProductos);
                    
                }
                
            }
            
            
            i = i+1;
            
        }
        for(Map.Entry<String,ArrayList> m : ProductosTree.entrySet())
    {
        System.out.println(m.getKey() + " : " + m.getValue());
    }


        
    }

    public void LinkedHashMap() {
        for (int i = 0; i < ListaDatos.size(); i++) {
            ArrayList <String> NombreProductos = new ArrayList<>();
            String key = ListaDatos.get(i);
            String value = ListaDatos.get(i+1);
            if (ProductosLinked.size() == 0) {
                NombreProductos.add(value);
                ProductosLinked.put(key, NombreProductos);
            } else {

                if (ProductosLinked.get(key) != null ) {
                    NombreProductos = ProductosLinked.get(key);
                    NombreProductos.add(value);
                    ProductosLinked.put(key, NombreProductos);

                } else {
                    NombreProductos.add(value);
                    ProductosLinked.put(key, NombreProductos);
                    
                }
                
            }
            
            
            i = i+1;
            
        }
        for(Map.Entry<String,ArrayList> m : ProductosLinked.entrySet())
        {
            System.out.println(m.getKey() + " : " + m.getValue());
        }


        
    }

    public String NombreProducto(String nombre) {
        String Mensaje = "No se ha encontrado el producto";
        switch (HashUtilizado) {
            case 1:
                for(Map.Entry<String,ArrayList> m : Productos.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    for (String productos : nombreProductos) {
                        if (productos.equals(nombre)){
                            Mensaje = "Categoria " + m.getKey() + " : Producto " + productos;
                        }
                    }
                }
                break;
        
            case 2:
                for(Map.Entry<String,ArrayList> m : ProductosTree.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    for (String productos : nombreProductos) {
                        if (productos.equals(nombre)){
                            Mensaje = "Categoria " + m.getKey() + " : Producto " + productos;
                        }
                    }
                }
                break;

            case 3:
                for(Map.Entry<String,ArrayList> m : ProductosLinked.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    for (String productos : nombreProductos) {
                        if (productos.equals(nombre)){
                            Mensaje = "Categoria " + m.getKey() + " : Producto " + productos;
                        }
                    }
                }
                break;
        }
        
        return Mensaje;
    }

    public String DatosDelProducto() {
        String Mensaje = "";
        switch (HashUtilizado) {
            case 1:
                for(Map.Entry<String,ArrayList> m : Productos.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    Mensaje = Mensaje + "\n" + "Categoria " + m.getKey() + " Contidad en categoria " + nombreProductos.size();
                }
                break;
        
            case 2:
                for(Map.Entry<String,ArrayList> m : ProductosTree.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    Mensaje = Mensaje + "\n" + "Categoria " + m.getKey() + " Contidad en categoria " + nombreProductos.size();
                }
                break;

            case 3:
                for(Map.Entry<String,ArrayList> m : ProductosLinked.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    Mensaje = Mensaje + "\n" + "Categoria " + m.getKey() + " Contidad en categoria " + nombreProductos.size();
                }
                break;
        }
        return Mensaje;
    }

    public String DatosDelProductoConNombres() {
        String Mensaje = "";
        Integer Cuenta = null;
        HashMap <String, Integer> NumeroDeObjetos = new HashMap<>();
        TreeMap <String, Integer> NumeroDeObjetos2 = new TreeMap<>();
        LinkedHashMap <String, Integer> NumeroDeObjetos3 = new LinkedHashMap<>();
        switch (HashUtilizado) {
            case 1:
                Cuenta = 0;
                for(Map.Entry<String,ArrayList> m : Productos.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    for (String a : nombreProductos) {
                        if (NumeroDeObjetos.get(a) != null) {
                            Cuenta = Cuenta + 1;
                            NumeroDeObjetos.put(a, Cuenta);
                        }
                        else{
                            NumeroDeObjetos.put(a, Cuenta);
                        }
                    }
                }
                for(Map.Entry<String,ArrayList> m : Productos.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    Mensaje =Mensaje + "\n" + " Categoria " + m.getKey() + " : Producto " + m.getValue() + " Cantidad de productos iguales " +  NumeroDeObjetos.get(m.getValue()) + " Cantidad de productos en la categoria "+ nombreProductos.size();
                }
                break;
        
            case 2:
                Cuenta = 0;
                for(Map.Entry<String,ArrayList> m : ProductosTree.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    for (String a : nombreProductos) {
                        if (NumeroDeObjetos2.get(a) != null) {
                            Cuenta = Cuenta + 1;
                            NumeroDeObjetos2.put(a, Cuenta);
                        }
                        else{
                            NumeroDeObjetos2.put(a, Cuenta);
                        }
                    }
                }
                for(Map.Entry<String,ArrayList> m : ProductosTree.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    Mensaje =Mensaje + "\n" + " Categoria " + m.getKey() + " : Producto " + m.getValue() + " Cantidad de productos iguales " +  NumeroDeObjetos2.get(m.getValue()) + " Cantidad de productos en la categoria "+ nombreProductos.size();
                }
                break;

            case 3:
                Cuenta = 0;
                for(Map.Entry<String,ArrayList> m : ProductosLinked.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    for (String a : nombreProductos) {
                        if (NumeroDeObjetos3.get(a) != null) {
                            Cuenta = Cuenta + 1;
                            NumeroDeObjetos3.put(a, Cuenta);
                        }
                        else{
                            NumeroDeObjetos3.put(a, Cuenta);
                        }
                    }
                }
                for(Map.Entry<String,ArrayList> m : ProductosLinked.entrySet()){
                    ArrayList<String> nombreProductos = m.getValue();
                    Mensaje =Mensaje + "\n" + " Categoria " + m.getKey() + " : Producto " + m.getValue() + " Cantidad de productos iguales " +  NumeroDeObjetos3.get(m.getValue()) + " Cantidad de productos en la categoria "+ nombreProductos.size();
                }
                break;
        }
        return Mensaje;
    }

    public String MostrarTodo() {
        String Mensaje = "";
        switch (HashUtilizado) {
            case 1:
                for(Map.Entry<String,ArrayList> m : Productos.entrySet()){
                    Mensaje = Mensaje + "\n" + m.getKey() + " : " + m.getValue();
                }
                break;
            case 2:
                for(Map.Entry<String,ArrayList> m : ProductosTree.entrySet()){
                    Mensaje = Mensaje + "\n" + m.getKey() + " : " + m.getValue();
                }
                break;
            case 3:
                for(Map.Entry<String,ArrayList> m : ProductosLinked.entrySet()){
                    Mensaje = Mensaje + "\n" + m.getKey() + " : " + m.getValue();
                }
                break;
        }
        
        return Mensaje;
    }

    public String AgregarValor(String valor1, String valor2) {
        String Mensaje = "Agregado con exito";
        ArrayList <String> Valores = new ArrayList<>();
        switch (HashUtilizado) {
            case 1:
                if (Productos.get(valor1) != null){
                    Valores = Productos.get(valor1);
                    Valores.add(valor2);
                } else {
                    Mensaje = "No se ha encontrado la categoria";
                }
                break;
        
            case 2:
                if (ProductosTree.get(valor1) != null){
                    Valores = ProductosTree.get(valor1);
                    Valores.add(valor2);
                } else {
                    Mensaje = "No se ha encontrado la categoria";
                }
                break;

            case 3:
                if (ProductosLinked.get(valor1) != null){
                    Valores = ProductosLinked.get(valor1);
                    Valores.add(valor2);
                } else {
                    Mensaje = "No se ha encontrado la categoria";
                }
                break;
        }
        
        return Mensaje;
    }

    /**
     * @return HashMap<String, ArrayList> return the Productos
     */
    public HashMap<String, ArrayList> getProductos() {
        return Productos;
    }

    /**
     * @param Productos the Productos to set
     */
    public void setProductos(HashMap<String, ArrayList> Productos) {
        this.Productos = Productos;
    }

    /**
     * @return LinkedHashMap <String, ArrayList> return the ProductosLinked
     */
    public LinkedHashMap <String, ArrayList> getProductosLinked() {
        return ProductosLinked;
    }

    /**
     * @param ProductosLinked the ProductosLinked to set
     */
    public void setProductosLinked(LinkedHashMap <String, ArrayList> ProductosLinked) {
        this.ProductosLinked = ProductosLinked;
    }

    /**
     * @return TreeMap <String, ArrayList> return the ProductosTree
     */
    public TreeMap <String, ArrayList> getProductosTree() {
        return ProductosTree;
    }

    /**
     * @param ProductosTree the ProductosTree to set
     */
    public void setProductosTree(TreeMap <String, ArrayList> ProductosTree) {
        this.ProductosTree = ProductosTree;
    }

    /**
     * @return ArrayList <String> return the ListaDatos
     */
    public ArrayList <String> getListaDatos() {
        return ListaDatos;
    }

    /**
     * @param ListaDatos the ListaDatos to set
     */
    public void setListaDatos(ArrayList <String> ListaDatos) {
        this.ListaDatos = ListaDatos;
    }

    /**
     * @return int return the HashUtilizado
     */
    public int getHashUtilizado() {
        return HashUtilizado;
    }

    /**
     * @param HashUtilizado the HashUtilizado to set
     */
    public void setHashUtilizado(int HashUtilizado) {
        this.HashUtilizado = HashUtilizado;
    }

}

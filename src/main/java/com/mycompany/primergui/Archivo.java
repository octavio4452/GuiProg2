
package com.mycompany.primergui;

import java.io.*;
import java.util.ArrayList;


public class Archivo {
    File archivo=new File("datos.txt");
    
    public void escribir(String fila){
        
        try {
            if(!archivo.exists()){
                archivo.createNewFile();
            }            
            FileWriter w=new FileWriter(archivo,true);
            BufferedWriter bw=new BufferedWriter(w);
            PrintWriter pw=new PrintWriter(bw);
            pw.append(fila);
            pw.close();
            bw.close();
        
        } catch (Exception e) {
            System.out.println("Error");
        }    
    }// cierre metodo escribir
        
    public ArrayList<Object[]> leerDatos(){
        ArrayList<Object[]> datos=new ArrayList();
        try {
            FileReader fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
            String fila="";
            while((fila=br.readLine())!=null){
                System.out.println(fila);
                Object[] objFila=fila.split(";");
                datos.add(objFila);      
             }     
        } catch (Exception e) {
            System.out.println("Error");
        } 
        return datos;
    }//cierre metodo leer
    
    
}

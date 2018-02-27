package boletin21;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    ArrayList<String> lista = new ArrayList();
    Scanner sc = new Scanner(System.in);
    
    File fichero;
    FileWriter f1;
    
    public Metodos(){
    
    }
    
    public void escribir(){
        for(int i=0;i<5;i++){
            System.out.println("Inserte Palabra "+(i+1)+": ");
            lista.add(sc.next());
        }
    }
    
    public void ordenar(){
        for(int i=0;i<5;i++){
            lista.sort(null);
        }
    }
    
    public void Fichero(){
        //Fichero a escribir
        fichero = new File("C:\\Users\\serxa\\OneDrive\\Documentos\\NetBeansProjects\\Boletin21\\files\\lista.txt");
        
        try{
            f1 = new FileWriter(fichero);
            for(int i=0; i<lista.size();i++){
                f1.write("\n"+(i+1)+". "+lista.get(i)+"\n");
            }
            f1.close();
        }catch (IOException e){
            System.out.println("Error al describir");
        }
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmeramezquita.textreader.controller;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WAMEZQUITA
 */
public class TextReaderController {
    private String path;
    private int lines;

    public TextReaderController(String path, int lines) {
        this.path = path;
        this.lines = lines;
        readLines();
    }
   
    private void readLines(){
        File archivo = new File(this.path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
            
        try{
            fileReader = new FileReader(archivo);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            for(int i=0;i<this.lines;i++){
                if((linea=bufferedReader.readLine())!=null)
                    System.out.println(linea);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(TextReaderController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wilmeramezquita.textreader;

import com.wilmeramezquita.textreader.controller.TextReaderController;
import java.util.Scanner;


/**
 *
 * @author WAMEZQUITA
 */
public class TextReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        readParameters();
    }
    
    private static void readParameters(){
        System.out.println("Ingrese la ruta del archivo: ");
        Scanner scanRoute = new Scanner(System.in);
        String ruta = scanRoute.nextLine();
        System.out.println("Ingrese la cantidad de lineas por leer: ");
        Scanner scanLines = new Scanner(System.in);
        String lines = scanLines.nextLine();
        executeRead(ruta, lines);
    }
    
    private static void executeRead(String route, String lines){
        int readLines = Integer.parseInt(lines);
        TextReaderController textReaderController = new TextReaderController(route, readLines);
    }
}

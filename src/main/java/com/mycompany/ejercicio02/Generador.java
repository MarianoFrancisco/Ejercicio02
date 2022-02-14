/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio02;

/**
 *
 * @author Mariano
 */
public class Generador {
    
    public static void main(String[] args) {
        /*--------------Nota-----------------:
        Si elimina el archivo codigoVocalesNumeros, tiene que poner el código de detector en 
        bloque de comentario y ejecutar esta clase para crearlo nuevamente desde el jflex,
        para generar el jar debe comentar generarCompilador(); de la linea de abajo
        y si quiere que se actualice el .java generado por su jflex entonces
        quite las // y listo.
        */
        //generarCompilador();
        //llamamos al form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detector().setVisible(true);
            }
        });
    }
    
    private static void generarCompilador(){
        try {
            //indicamos ruta
            String ruta = "src/main/java/com/mycompany/ejercicio02/"; //ruta donde tenemos los archivos con extension .jflex y .cup
            //pasamos a un string []
            String opcionVocalesNumeros[] = { ruta + "LexicoVocalesNumeros.jflex", "-d", ruta };
            //pasamos ruta
            jflex.Main.generate(opcionVocalesNumeros);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}

/**
 * Clase que permite generar la clase Lexer.java a partir del archivo 
 * Lexer.flex, usando la libreria JFlex.
 * 
 * Este main solo se ejecuta cuando se realizan cambios en el lenguaje 
 * o en las expresiones regulares.
 */

package GeneradorLexer;

import java.io.File;


public class GenerarClase {

    
    public static void main(String[] args) {
        String path = "Lexer.flex";
        generarLexer(path);

    }
    public static void generarLexer(String path){
        File file=new File(path);
        JFlex.Main.generate(file);
    }
}

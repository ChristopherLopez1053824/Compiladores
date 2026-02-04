
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String[] args) {

        try {

            
            String ruta = TxtManager.seleccionarArchivoTxt();

            if (ruta == null) {
                System.out.println("Programa terminado.");
                return;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
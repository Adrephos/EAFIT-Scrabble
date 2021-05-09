import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.text.*;

public class LeerDiccionario {

    public boolean buscarPalabra(String palabra){

        File archivo = new File("0_palabras_todas.txt");;
        BufferedReader br = null;

        try {
            //Crear un objeto BufferedReader al que se le pasa 
            //   un objeto FileReader con el nombre del fichero
            br = new BufferedReader(new FileReader(archivo));
            //Leer la primera línea, guardando en un String
            String texto = br.readLine();
            //Repetir mientras no se llegue al final del fichero
            while(texto != null)
            { 
                texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
                texto = texto.replaceAll("[^\\p{ASCII}(N\u0303)(n\u0303)]", "");
                texto = Normalizer.normalize(texto, Normalizer.Form.NFC);
                //Determinar si la palabra que se busca está en el Diccionario
                if (texto.equals(palabra)) {
                    return true;
                }
                //Leer la siguiente línea
                texto = br.readLine();
            }
         }
         catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error de lectura del fichero");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
        return false;
    }
}

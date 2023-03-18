
package Ventanas;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AñadirBinario extends ObjectOutputStream{

    public AñadirBinario(OutputStream out) throws IOException {     //Constructor de ObjectOutputStream
        super(out);
    }
    public AñadirBinario() throws IOException, SecurityException {
    }
    
    @Override
    public void writeStreamHeader(){
        File archivo = new File("registroAttletas.bin");
        
        if(archivo.length() == 0){
            try {
                super.writeStreamHeader();
            } catch (IOException ex) {
                System.err.println("Error, "+ex);
            }
        }
        else{
            try {
                reset();
            } catch (IOException ex) {
                System.err.println("Error, "+ex);
            }
        }
    }
}

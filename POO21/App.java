package POO21;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class App {
    public static void main(String[] args) throws Exception {
        String caminhoArquivo = "POO21/arquivo.txt";
        
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo, true))){
            escritor.write("Olá, mundo!\n");
        } catch (Exception e) {
            
        } 
    }
}

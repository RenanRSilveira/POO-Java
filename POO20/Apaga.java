import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Apaga {
    public static void main(String[] args) {
        String caminho = "C:\\Users\\Win10\\OneDrive\\Documentos\\Git\\POO-Java\\POO20\\usuarios.txt";
        
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, true))){
            escritor.write("Renan\n");
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (Exception e) {
            // TODO: handle exception
        }


    }
}

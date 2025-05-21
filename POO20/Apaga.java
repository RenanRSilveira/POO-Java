import java.io.BufferedReader;
import java.io.FileReader;

public class Apaga {
    public static void main(String[] args) {
        String caminho = "C:\\Users\\Win10\\OneDrive\\Documentos\\Git\\POO-Java\\POO20\\usuarios.txt";
       

        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))){
            String linha;
            while((linha = leitor.readLine()) != null){
                System.out.println(linha);
    
            }
            


        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

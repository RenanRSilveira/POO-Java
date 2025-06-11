import java.io.FileInputStream; 
import java.io.IOException;
public class InputStream { public static void main(String[] args) { 
    try {
        FileInputStream input = new FileInputStream("C:\\Users\\Win10\\OneDrive\\Documentos\\Testando.txt");
        int byteLido;
        while ((byteLido = input.read()) != -1) {
            // Converte o byte em caractere e mostra na tela
            char caractere = (char) byteLido;
            System.out.print(caractere);
        }

        input.close(); // Muito importante: fechar o arquivo depois!
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
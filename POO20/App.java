import java.io.BufferedReader;
import java.io.FileReader;

public class App {
   
    public static void main(String[] args) {
        // Posso usar duas barras invertidas \\ ou apenas uma barra / ao invés da \ padrão
        String caminhoArquivo = "C:/Users/Win10/OneDrive/Documentos/Git/POO-Java/POO20/usuarios.txt";
        
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))){
            //FileReader é necessário para acessar e abrir o arquivo
            //BufferedReader é necessário para ler o arquivo de forma eficiente
            //Usamos o () em try para fechar o arquivo depois de acessar
            String linha = leitor.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }
            
        } catch (Exception e) {
            System.out.println("Erro\n" + e.getMessage());
        }
    }
}

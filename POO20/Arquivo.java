import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Arquivo {
    // Posso usar duas barras invertidas \\ ou apenas uma barra / ao invés da \
    // padrão

    public String ler(String caminhoArquivo) {
        // Usar quando for um arquivo maior
        String texto = "";
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            // FileReader é necessário para acessar e abrir o arquivo
            // BufferedReader é necessário para ler o arquivo de forma eficiente
            // Usamos o () em try para fechar o arquivo depois de acessar
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (Exception e) {
            System.out.println("Erro\n" + e.getMessage());
        }
        return texto;
    }

    public void lerFile(String caminhoArquivo) {
        // -> Usar quando for um arquivo pequeno
        try {
            Path caminho = Paths.get(caminhoArquivo);
            List<String> resultado = Files.readAllLines(caminho);
            for (String x : resultado) {
                System.out.println(x);
            }

        } catch (Exception e) {

        }

    }
}

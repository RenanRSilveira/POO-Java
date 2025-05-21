import java.io.BufferedReader;
import java.io.FileReader;

public class Arquivo {
        // Posso usar duas barras invertidas \\ ou apenas uma barra / ao invés da \ padrão
        
       public String ler(String caminhoArquivo){
        String texto = "";
        
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))){
            String linha = leitor.readLine();
            //FileReader é necessário para acessar e abrir o arquivo
            //BufferedReader é necessário para ler o arquivo de forma eficiente
            //Usamos o () em try para fechar o arquivo depois de acessar
            while (linha != null) {
                texto += linha;
                linha = leitor.readLine();
                if(linha != null){
                    texto += "\n";
                }
            }
            System.out.println(texto);
            
        } catch (Exception e) {
            System.out.println("Erro\n" + e.getMessage());
            }
        return texto;
        }
    }



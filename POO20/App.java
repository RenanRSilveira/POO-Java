
public class App {
    public static void main(String[] args) {
        Arquivo arquivo = new Arquivo();
        arquivo.ler("C:/Users/Win10/OneDrive/Documentos/Git/POO-Java/POO20/usuarios.txt");
        System.out.println();
        Arquivo arquivo2 = new Arquivo();
        arquivo2.lerFile("C:/Users/Win10/OneDrive/Documentos/Git/POO-Java/POO20/usuarios.txt"); 
    }
}

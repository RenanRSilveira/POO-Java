package POO006.Record;

public record Product(String name, int price) {

    public static final String Mensagem_final = "Hello World";

    public void printNome(){
        System.out.println("O produto é: " + name);
    }

    public static void printMensagem(){
        System.out.println(Mensagem_final);
    }
}

package Lambda;

public class Strings {
    public static void main(String[] args) {
        ManipuladorString maiusculo = (str) -> (str).toUpperCase();
        System.out.println(maiusculo.manipular("olá, mundo!"));
        
        // Se tiver apenas 1 parâmetro, os parênteses são opicionais
        ManipuladorString minusculo = str -> (str).toLowerCase(); 
        System.out.println(minusculo.manipular("Olá, Mundo!"));

        ManipuladorString saudacao = nome -> "Olá, " + nome + "!";
        System.out.println(saudacao.manipular("Maria"));;  // Saída: Olá, Maria!

    }
}


interface ManipuladorString{
    String manipular(String str);
    
}
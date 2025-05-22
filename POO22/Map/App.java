package POO22.Map;

import java.util.*;


public class App {
    public static void main(String[] args) {
        // Map é como um dicionário em Python
        // HashMap não garante ordem, LinkedHashMap sim
        Map<String, String> estados = new HashMap<>();

        estados.put("SP", "São Paulo");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("MG", "Minas Gerais");
        estados.put("ES", "Espírito Santo");

        System.out.println(estados);
        System.out.println(estados.get("MG"));

        for(String chave : estados.keySet()){
            System.out.println(chave);
        }

        for(String valor : estados.values()){
            System.out.println((valor));
        }

        // Para percorrer um Map e mostrar as chaves e valores:
        for (Map.Entry<String, String> entry : estados.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

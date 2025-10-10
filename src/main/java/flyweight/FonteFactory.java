package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FonteFactory {
    private static final Map<String, Fonte> fontes = new HashMap<>();

    public static Fonte getFonte(String nome, int tamanho, String estilo) {
        String chave = nome + tamanho + estilo;
        if (!fontes.containsKey(chave)) {
            fontes.put(chave, new Fonte(nome, tamanho, estilo));
            System.out.println("Nova fonte criada: " + nome + " " + tamanho + "pt " + estilo);
        }
        return fontes.get(chave);
    }

    public static int getTotalFontes() {
        return fontes.size();
    }
}

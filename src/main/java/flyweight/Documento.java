package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Documento {
    private String titulo;
    private List<Texto> paragrafos = new ArrayList<>();

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarTexto(Texto texto) {
        paragrafos.add(texto);
    }

    public void exibirDocumento() {
        System.out.println("\n=== Documento: " + titulo + " ===");
        for (Texto t : paragrafos) {
            t.exibirTexto();
        }
    }
}

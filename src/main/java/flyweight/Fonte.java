package flyweight;

public class Fonte {
    private final String nome;
    private final int tamanho;
    private final String estilo;

    public Fonte(String nome, int tamanho, String estilo) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.estilo = estilo;
    }

    public void exibir(String conteudo) {
        System.out.println("[" + nome + " " + tamanho + "pt " + estilo + "] " + conteudo);
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getEstilo() {
        return estilo;
    }
}

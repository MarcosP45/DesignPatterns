package flyweight;

public class Texto {
    private String conteudo;
    private Fonte fonte;

    public Texto(String conteudo, Fonte fonte) {
        this.conteudo = conteudo;
        this.fonte = fonte;
    }

    public void exibirTexto() {
        fonte.exibir(conteudo);
    }

    public Fonte getFonte() {
        return fonte;
    }
}

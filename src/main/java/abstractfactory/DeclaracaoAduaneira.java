package abstractfactory;

public class DeclaracaoAduaneira implements DocumentoTransporte {
    public String emitir() {
        return "Declaração aduaneira emitida.";
    }

    public String getConteudo() {
        return emitir();
    }
}

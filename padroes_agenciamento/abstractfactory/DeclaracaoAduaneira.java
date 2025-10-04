package abstractfactory;

public class DeclaracaoAduaneira implements DocumentoTransporte {
    @Override
    public String emitir() {
        return "Declaração aduaneira emitida.";
    }
}

package abstractfactory;

public class ConhecimentoEmbarque implements DocumentoTransporte {
    @Override
    public String emitir() {
        return "Conhecimento de embarque emitido.";
    }
}

package abstractfactory;

public class FabricaTransporteAereo implements FabricaAbstrata {
    @Override
    public DocumentoTransporte criarDocumentoPrincipal() {
        return new ConhecimentoEmbarque();
    }

    @Override
    public DocumentoTransporte criarDocumentoSecundario() {
        return new DeclaracaoAduaneira();
    }
}

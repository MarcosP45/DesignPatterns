package abstractfactory;

public class FabricaTransporteAereo implements FabricaAbstrata {
    public DocumentoTransporte criarDocumentoPrincipal() {
        return new ConhecimentoEmbarque();
    }

    public DocumentoTransporte criarDocumentoSecundario() {
        return new DeclaracaoAduaneira();
    }
}

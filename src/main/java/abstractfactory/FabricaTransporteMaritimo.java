package abstractfactory;

public class FabricaTransporteMaritimo implements FabricaAbstrata {
    public DocumentoTransporte criarDocumentoPrincipal() {
        return new ConhecimentoEmbarque();
    }

    public DocumentoTransporte criarDocumentoSecundario() {
        return new DeclaracaoAduaneira();
    }
}

package abstractfactory;

public interface FabricaAbstrata {
    DocumentoTransporte criarDocumentoPrincipal();
    DocumentoTransporte criarDocumentoSecundario();
}

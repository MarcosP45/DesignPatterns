package abstractfactory;

public interface FabricaAbstrata {
    DocumentoTransporte criarDocumentoPrincipal();
    DocumentoTransporte criarDocumentoSecundario();

    default DocumentoTransporte criarDocumentoTransporte() {
        return criarDocumentoPrincipal();
    }

    default DeclaracaoAduaneira criarDeclaracaoAduaneira() {
        DocumentoTransporte sec = criarDocumentoSecundario();
        if (sec instanceof DeclaracaoAduaneira) return (DeclaracaoAduaneira) sec;
        return null;
    }
}

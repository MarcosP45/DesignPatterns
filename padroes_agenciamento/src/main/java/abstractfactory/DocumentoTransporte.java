package abstractfactory;

public interface DocumentoTransporte {
    String emitir();

    default String getDescricao() {
        return emitir();
    }
}

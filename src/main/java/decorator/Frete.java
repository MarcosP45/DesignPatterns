package decorator;

public interface Frete {
    String getDescricao();
    double getCusto();

    default double getValor() {
        return getCusto();
    }
}

package decorator;

public class RastreamentoOnline extends FreteDecorator {
    public RastreamentoOnline(Frete frete) {
        super(frete);
    }

    public String getDescricao() {
        return frete.getDescricao() + " + Rastreamento online";
    }

    public double getCusto() {
        return frete.getCusto() + 30.0;
    }
}
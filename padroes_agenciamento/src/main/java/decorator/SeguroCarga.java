package decorator;

public class SeguroCarga extends FreteDecorator {
    public SeguroCarga(Frete frete) {
        super(frete);
    }

    public String getDescricao() {
        return frete.getDescricao() + " + Seguro da carga";
    }

    public double getCusto() {
        return frete.getCusto() + 50.0;
    }
}

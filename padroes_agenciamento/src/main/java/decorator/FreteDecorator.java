package decorator;

public abstract class FreteDecorator implements Frete {
    protected Frete frete;

    public FreteDecorator(Frete frete) {
        this.frete = frete;
    }

    public String getDescricao() {
        return frete.getDescricao();
    }

    public double getCusto() {
        return frete.getCusto();
    }
}
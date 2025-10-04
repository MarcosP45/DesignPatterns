package decorator;

public class FreteBasico implements Frete {
    public FreteBasico(double v) {
    }

    public String getDescricao() {
        return "Frete básico";
    }

    public double getCusto() {
        return 100.0;
    }
}

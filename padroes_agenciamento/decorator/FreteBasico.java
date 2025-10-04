package decorator;

public class FreteBasico implements Frete {
    public String getDescricao() {
        return "Frete básico";
    }

    public double getCusto() {
        return 100.0;
    }
}

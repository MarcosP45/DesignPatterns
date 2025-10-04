package bridge;

public abstract class Transporte {
    protected TipoCarga tipoCarga;

    public Transporte(TipoCarga tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public abstract void transportar();
}

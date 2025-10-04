package bridge;

public class TransporteAereo extends Transporte {
    public TransporteAereo(TipoCarga tipoCarga) {
        super(tipoCarga);
    }

    public void transportar() {
        System.out.println("Transportando via aéreo: " + tipoCarga.getDescricao());
    }
}

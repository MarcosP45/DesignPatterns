package bridge;

public class TransporteRodoviario extends Transporte {
    public TransporteRodoviario(TipoCarga tipoCarga) {
        super(tipoCarga);
    }

    public void transportar() {
        System.out.println("Transportando via rodoviário: " + tipoCarga.getDescricao());
    }
}

package bridge;

public class TransporteMaritimo extends Transporte {
    public TransporteMaritimo(TipoCarga tipoCarga) {
        super(tipoCarga);
    }

    public void transportar() {
        System.out.println("Transportando via marítimo: " + tipoCarga.getDescricao());
    }
}

package factorymethod;

public class ServicoEntregaFinal implements IServico {
    @Override
    public String executar() {
        return "Entrega final realizada.";
    }
}

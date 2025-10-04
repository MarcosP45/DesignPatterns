package factorymethod;

public class ServicoTransporteInternacional implements IServico {
    @Override
    public String executar() {
        return "Transporte internacional iniciado.";
    }
}

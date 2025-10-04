package factorymethod;

public class ServicoArmazenagem implements IServico {
    @Override
    public String executar() {
        return "Carga armazenada com sucesso.";
    }
}

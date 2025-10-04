package factorymethod;

public class ServicoAgendamentoColeta implements IServico {
    @Override
    public String executar() {
        return "Agendamento de coleta realizado.";
    }
}

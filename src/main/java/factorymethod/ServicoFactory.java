package factorymethod;

public class ServicoFactory {

    public static IServico obterServico(String tipo) {
        switch (tipo) {
            case "coleta":
                return new ServicoAgendamentoColeta();
            case "transporte":
                return new ServicoTransporteInternacional();
            case "armazenagem":
                return new ServicoArmazenagem();
            case "desembaraco":
                return new ServicoDesembaracoAduaneiro();
            case "entrega":
                return new ServicoEntregaFinal();
            default:
                throw new IllegalArgumentException("Serviço não encontrado.");
        }
    }


public IServico criarServico(String tipo) {
    if (tipo == null) throw new IllegalArgumentException("Tipo nulo");
    switch (tipo.toLowerCase()) {
        case "agendamento":
        case "coleta":
            return new ServicoAgendamentoColeta();
        case "transporte":
            return new ServicoTransporteInternacional();
        case "armazenagem":
            return new ServicoArmazenagem();
        case "desembaraco":
        case "desembaraço":
        case "desembaracoaduaneiro":
            return new ServicoDesembaracoAduaneiro();
        case "entrega":
        case "entregafinal":
            return new ServicoEntregaFinal();
        default:
            throw new IllegalArgumentException("Serviço não encontrado: " + tipo);
    }
}

}
package factorymethod;

public class ServicoDesembaracoAduaneiro implements IServico {
    @Override
    public String executar() {
        return "Desembaraço aduaneiro concluído.";
    }
}

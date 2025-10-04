package facade;

public class Carga {

    public boolean liberar() {
        return AgenciamentoFacade.verificarPendenciasLiberacao(this);
    }
}

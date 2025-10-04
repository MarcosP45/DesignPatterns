package facade;

public class AgenciamentoFacade {

    public static boolean verificarPendenciasLiberacao(Carga carga) {
        if (Aduana.getInstancia().verificarCargaComPendencia(carga)) {
            return false;
        }
        if (Terminal.getInstancia().verificarCargaComPendencia(carga)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarCargaComPendencia(carga)) {
            return false;
        }
        return true;
    }
}

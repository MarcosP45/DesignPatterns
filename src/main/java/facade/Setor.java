package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Carga> cargasComPendencia = new ArrayList<Carga>();

    public void addCargaPendente(Carga carga) {
        this.cargasComPendencia.add(carga);
    }

    public boolean verificarCargaComPendencia(Carga carga) {
        return this.cargasComPendencia.contains(carga);
    }
}

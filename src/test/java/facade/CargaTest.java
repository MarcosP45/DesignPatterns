package facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CargaTest {

    @Test
    void deveRetornarPendenciaAduanaLiberacao() {
        Carga carga = new Carga();
        Aduana.getInstancia().addCargaPendente(carga);

        assertEquals(false, carga.liberar());
    }

    @Test
    void deveRetornarPendenciaTerminalLiberacao() {
        Carga carga = new Carga();
        Terminal.getInstancia().addCargaPendente(carga);

        assertEquals(false, carga.liberar());
    }

    @Test
    void deveRetornarPendenciaFinanceiroLiberacao() {
        Carga carga = new Carga();
        Financeiro.getInstancia().addCargaPendente(carga);

        assertEquals(false, carga.liberar());
    }

    @Test
    void deveRetornarCargaSemPendenciaLiberacao() {
        Carga carga = new Carga();

        assertEquals(true, carga.liberar());
    }
}

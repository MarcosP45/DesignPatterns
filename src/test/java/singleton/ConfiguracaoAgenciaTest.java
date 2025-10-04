
package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConfiguracaoAgenciaTest {

    @Test
    void mesmaInstanciaSingleton() {
        ConfiguracaoAgencia a = ConfiguracaoAgencia.getInstancia();
        ConfiguracaoAgencia b = ConfiguracaoAgencia.getInstancia();
        assertSame(a, b, "Instâncias devem ser as mesmas (singleton).");
    }

    @Test
    void taxasValidadas() {
        ConfiguracaoAgencia cfg = ConfiguracaoAgencia.getInstancia();
        assertTrue(cfg.getTaxaCambio() > 0);
        assertTrue(cfg.getTaxaAdministrativa() > 0);
    }
}

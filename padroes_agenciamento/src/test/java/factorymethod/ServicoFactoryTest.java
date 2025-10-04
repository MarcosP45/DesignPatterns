
package factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoFactoryTest {

    @Test
    void servicoAgendamentoColeta() {
        ServicoFactory factory = new ServicoFactory();
        IServico serv = factory.criarServico("agendamento");
        assertNotNull(serv);
        assertTrue(serv.executar().toLowerCase().contains("agendamento"));
    }

    @Test
    void servicoEntregaFinal() {
        ServicoFactory factory = new ServicoFactory();
        IServico serv = factory.criarServico("entrega");
        assertNotNull(serv);
        assertTrue(serv.executar().toLowerCase().contains("entrega"));
    }
}

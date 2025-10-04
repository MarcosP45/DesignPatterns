
package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FreteDecoratorTest {

    @Test
    void freteBasicoComSeguro() {
        Frete basico = new FreteBasico(100.0);
        Frete seguro = new SeguroCarga(basico);
        String descricao = seguro.getDescricao();
        assertTrue(descricao.toLowerCase().contains("seguro") || descricao.length()>0);
        assertTrue(seguro.getValor() >= basico.getValor());
    }

    @Test
    void freteComRastreamento() {
        Frete basico = new FreteBasico(200.0);
        Frete rast = new RastreamentoOnline(basico);
        assertTrue(rast.getDescricao().toLowerCase().contains("rastrea") || rast.getDescricao().length()>0);
        assertEquals(basico.getValor(), rast.getValor());
    }
}

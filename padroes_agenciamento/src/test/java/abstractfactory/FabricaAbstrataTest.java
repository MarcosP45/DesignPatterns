
package abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FabricaAbstrataTest {

    @Test
    void fabricaTransporteAereoProduzDocumento() {
        FabricaAbstrata fabrica = new FabricaTransporteAereo();
        DocumentoTransporte doc = fabrica.criarDocumentoTransporte();
        assertNotNull(doc);
        assertTrue(doc.getDescricao() != null && doc.getDescricao().length()>0);
    }

    @Test
    void fabricaTransporteMaritimoProduzDeclaracao() {
        FabricaAbstrata fabrica = new FabricaTransporteMaritimo();
        DeclaracaoAduaneira dec = fabrica.criarDeclaracaoAduaneira();
        assertNotNull(dec);
        assertTrue(dec.getConteudo() != null && dec.getConteudo().length()>0);
    }
}

package flyweight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentoTest {

    @Test
    void deveReutilizarFontes() {
        Documento doc = new Documento("Manual de Segurança");

        Texto texto1 = new Texto("Capítulo 1 - Introdução", FonteFactory.getFonte("Arial", 12, "Negrito"));
        Texto texto2 = new Texto("Capítulo 2 - Configurações", FonteFactory.getFonte("Arial", 12, "Negrito"));
        Texto texto3 = new Texto("Apêndice - Referências", FonteFactory.getFonte("Times New Roman", 14, "Itálico"));

        doc.adicionarTexto(texto1);
        doc.adicionarTexto(texto2);
        doc.adicionarTexto(texto3);

        doc.exibirDocumento();

        // Deve haver apenas 2 fontes criadas, pois a primeira é reutilizada
        assertEquals(2, FonteFactory.getTotalFontes());
    }
}

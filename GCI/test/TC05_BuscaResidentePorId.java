import model.Residente;
import service.ResidenteService;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

/**
 * TC05 - Verifica a busca de residente por identificador único.
 *
 * <p>Cenários: válido e alternativo (ID inexistente)</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC05_BuscaResidentePorId {

    /**
     * Dado um residente cadastrado com ID 10,
     * quando buscar pelo ID 10,
     * então deve retornar o residente correto.
     */
    @Test
    public void deveEncontrarResidentePorId() {
        ResidenteService service = new ResidenteService();
        Residente residente = new Residente(10, "Lurdes Costa",
                LocalDate.of(1948, 7, 30), "Pedro Costa", "Osteoporose");
        service.cadastrar(residente);

        Residente encontrado = service.buscarPorId(10);

        assertNotNull(encontrado);
        assertEquals("Lurdes Costa", encontrado.getNome());
    }

    /**
     * Dado um serviço sem residentes cadastrados,
     * quando buscar por um ID inexistente,
     * então deve retornar null.
     */
    @Test
    public void deveRetornarNuloParaIdInexistente() {
        ResidenteService service = new ResidenteService();

        Residente encontrado = service.buscarPorId(999);

        assertNull(encontrado);
    }
}

import model.Residente;
import service.ResidenteService;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

/**
 * TC07 - Verifica se a remoção de um residente funciona corretamente,
 * incluindo tentativa de remover ID inexistente.
 *
 * <p>Cenários: válido e alternativo</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC07_RemocaoResidente {

    /**
     * Dado um residente cadastrado,
     * quando removê-lo pelo ID,
     * então o total de residentes deve ser 0.
     */
    @Test
    public void deveRemoverResidenteComSucesso() {
        ResidenteService service = new ResidenteService();
        Residente residente = new Residente(7, "Sebastião Nunes",
                LocalDate.of(1945, 9, 12), "Rita Nunes", "Glaucoma");
        service.cadastrar(residente);

        boolean removido = service.remover(7);

        assertTrue(removido);
        assertEquals(0, service.totalResidentes());
    }

    /**
     * Dado um serviço sem o residente de ID 999,
     * quando tentar remover o ID 999,
     * então deve retornar false.
     */
    @Test
    public void deveRetornarFalsoAoRemoverIdInexistente() {
        ResidenteService service = new ResidenteService();

        boolean removido = service.remover(999);

        assertFalse(removido);
    }
}

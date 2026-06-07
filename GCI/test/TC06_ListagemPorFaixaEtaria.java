import model.Residente;
import service.ResidenteService;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.util.List;

/**
 * TC06 - Verifica se a listagem de residentes por faixa etária
 * retorna apenas os residentes corretos.
 *
 * <p>Cenário: válido</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC06_ListagemPorFaixaEtaria {

    /**
     * Dados dois residentes, um "Idoso Avançado" e outro "Idoso Longevo",
     * quando listar por faixa "Idoso Avançado",
     * então deve retornar apenas o residente da faixa correta.
     */
    @Test
    public void deveListarApenasResidentesDaFaixaCorreta() {
        ResidenteService service = new ResidenteService();

        // ~85 anos => Idoso Avançado
        Residente r1 = new Residente(1, "Carmem Lima",
                LocalDate.of(1940, 1, 1), "Resp. A", "Hipertensão");
        // ~92 anos => Idoso Longevo
        Residente r2 = new Residente(2, "Raimundo Gomes",
                LocalDate.of(1933, 5, 5), "Resp. B", "Parkinson");

        service.cadastrar(r1);
        service.cadastrar(r2);

        List<Residente> avancados = service.listarPorFaixaEtaria("Idoso Avançado");

        assertEquals(1, avancados.size());
        assertEquals("Carmem Lima", avancados.get(0).getNome());
    }
}

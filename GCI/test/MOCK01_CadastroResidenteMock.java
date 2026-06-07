import model.Residente;
import service.ResidenteService;
import org.junit.Test;
import java.time.LocalDate;
import static org.mockito.Mockito.*;

/**
 * MOCK01 - Verifica se o metodo cadastrar() do ResidenteService
 * e chamado exatamente uma vez ao cadastrar um residente.
 *
 * <p>Utiliza Mock para simular comportamento dinamico do servico.</p>
 *
 * @author Jean Faro, Joao Victor, Guilherme Paiva
 */
public class MOCK01_CadastroResidenteMock {

    /**
     * Dado um mock de ResidenteService,
     * quando chamar cadastrar() com um residente valido,
     * entao o metodo deve ter sido invocado exatamente uma vez.
     */
    @Test
    public void deveChamarCadastrarUmaVez() {
        ResidenteService mockService = mock(ResidenteService.class);
        Residente residente = new Residente(1, "Maria Silva",
                LocalDate.of(1945, 3, 10), "Joao Silva", "Hipertensao");

        mockService.cadastrar(residente);

        verify(mockService, times(1)).cadastrar(residente);
    }
}

import model.Atendimento;
import model.Enfermeiro;
import model.Residente;
import service.AtendimentoService;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static org.mockito.Mockito.*;

/**
 * MOCK03 - Verifica se o metodo registrar() do AtendimentoService
 * e chamado corretamente com o atendimento esperado.
 *
 * <p>Utiliza Mock para simular comportamento dinamico do servico.</p>
 *
 * @author Jean Faro, Joao Victor, Guilherme Paiva
 */
public class MOCK03_RegistroAtendimentoMock {

    /**
     * Dado um mock de AtendimentoService,
     * quando chamar registrar() com um atendimento valido,
     * entao o metodo deve ter sido invocado uma vez com aquele atendimento.
     */
    @Test
    public void deveChamarRegistrarComAtendimentoCorreto() {
        AtendimentoService mockService = mock(AtendimentoService.class);

        Residente residente = new Residente(1, "Jose Oliveira",
                LocalDate.of(1942, 6, 20), "Ana Oliveira", "Diabetes");
        Enfermeiro enfermeiro = new Enfermeiro(1, "Carla Rocha", "COREN-123", "Manha");
        Atendimento atendimento = new Atendimento(1, residente, enfermeiro,
                LocalDateTime.now(), "Verificacao de pressao", "Normal");

        mockService.registrar(atendimento);

        verify(mockService, times(1)).registrar(atendimento);
    }
}

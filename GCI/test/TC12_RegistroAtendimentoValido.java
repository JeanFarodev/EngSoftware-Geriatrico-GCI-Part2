import model.Atendimento;
import model.Enfermeiro;
import model.Residente;
import service.AtendimentoService;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * TC12 - Verifica se o registro de um atendimento válido
 * é realizado com sucesso.
 *
 * <p>Cenário: válido</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC12_RegistroAtendimentoValido {

    /**
     * Dado um atendimento com residente, enfermeiro, data e tipo preenchidos,
     * quando registrar no serviço,
     * então o total de atendimentos deve ser 1.
     */
    @Test
    public void deveRegistrarAtendimentoComSucesso() {
        AtendimentoService service = new AtendimentoService();

        Residente residente = new Residente(1, "Iolanda Ferreira",
                LocalDate.of(1942, 4, 18), "Marcos Ferreira", "Diabetes");
        Enfermeiro enfermeiro = new Enfermeiro(1, "Carla Rocha", "COREN-123", "Manhã");

        Atendimento atendimento = new Atendimento(1, residente, enfermeiro,
                LocalDateTime.now(), "Verificação de pressão", "Pressão normal");

        service.registrar(atendimento);

        assertEquals(1, service.totalAtendimentos());
    }
}

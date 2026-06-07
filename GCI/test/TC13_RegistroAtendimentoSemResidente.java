import model.Atendimento;
import model.Enfermeiro;
import service.AtendimentoService;
import org.junit.Test;
import java.time.LocalDateTime;

/**
 * TC13 - Verifica se o sistema lança exceção ao registrar
 * um atendimento sem residente vinculado.
 *
 * <p>Cenário: de exceção</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC13_RegistroAtendimentoSemResidente {

    /**
     * Dado um atendimento com residente nulo,
     * quando tentar registrar,
     * então deve lançar IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExcecaoParaAtendimentoSemResidente() {
        AtendimentoService service = new AtendimentoService();
        Enfermeiro enfermeiro = new Enfermeiro(1, "Paulo Mendes", "COREN-456", "Tarde");

        // residente = null => atendimento inválido
        Atendimento atendimento = new Atendimento(1, null, enfermeiro,
                LocalDateTime.now(), "Curativos", "");

        service.registrar(atendimento);
    }
}

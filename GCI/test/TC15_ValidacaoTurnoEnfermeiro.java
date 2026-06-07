import model.Enfermeiro;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TC15 - Verifica se a validação de turno do enfermeiro
 * aceita turnos válidos e rejeita turnos inválidos.
 *
 * <p>Cenários: válido e alternativo</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC15_ValidacaoTurnoEnfermeiro {

    /**
     * Dado um enfermeiro com turno "Manhã",
     * quando validar o turno,
     * então deve retornar true.
     */
    @Test
    public void deveAceitarTurnoValido() {
        Enfermeiro enfermeiro = new Enfermeiro(1, "Roberta Alves", "COREN-321", "Manhã");

        assertTrue(enfermeiro.isTurnoValido());
    }

    /**
     * Dado um enfermeiro com turno "Madrugada" (inválido),
     * quando validar o turno,
     * então deve retornar false.
     */
    @Test
    public void deveRejeitarTurnoInvalido() {
        Enfermeiro enfermeiro = new Enfermeiro(2, "Fábio Cruz", "COREN-654", "Madrugada");

        assertFalse(enfermeiro.isTurnoValido());
    }
}

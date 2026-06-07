import model.Residente;
import service.ResidenteService;
import org.junit.Test;
import java.time.LocalDate;

/**
 * TC02 - Verifica se o sistema lança exceção ao tentar
 * cadastrar um residente com nome nulo.
 *
 * <p>Cenário: de exceção</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC02_CadastroResidenteNomeNulo {

    /**
     * Dado um residente com nome nulo,
     * quando tentar cadastrar,
     * então deve lançar IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExcecaoQuandoNomeNulo() {
        ResidenteService service = new ResidenteService();
        Residente residente = new Residente(2, null,
                LocalDate.of(1940, 1, 1), "Responsável", "Diabetes");

        service.cadastrar(residente);
    }
}

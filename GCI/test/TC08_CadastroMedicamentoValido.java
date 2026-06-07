import model.Medicamento;
import service.MedicamentoService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TC08 - Verifica se o cadastro de um medicamento válido
 * é realizado com sucesso.
 *
 * <p>Cenário: válido</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC08_CadastroMedicamentoValido {

    /**
     * Dado um medicamento com dados completos,
     * quando cadastrado no serviço,
     * então o total de medicamentos deve ser 1.
     */
    @Test
    public void deveCadastrarMedicamentoComSucesso() {
        MedicamentoService service = new MedicamentoService();
        Medicamento med = new Medicamento(1, "Losartana", "50mg", 100, 20, 200);

        service.cadastrar(med);

        assertEquals(1, service.totalMedicamentos());
    }
}

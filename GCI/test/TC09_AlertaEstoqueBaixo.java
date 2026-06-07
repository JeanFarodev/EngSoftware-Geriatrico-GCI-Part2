import model.Medicamento;
import service.MedicamentoService;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

/**
 * TC09 - Verifica se o alerta automático de estoque baixo
 * identifica corretamente os medicamentos abaixo do mínimo.
 *
 * <p>Cenário: válido</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC09_AlertaEstoqueBaixo {

    /**
     * Dado um medicamento com estoque atual menor que o mínimo configurado,
     * quando listar os medicamentos com estoque baixo,
     * então o medicamento crítico deve constar na lista de alertas.
     */
    @Test
    public void deveDetectarMedicamentoComEstoqueBaixo() {
        MedicamentoService service = new MedicamentoService();
        // estoque=5, mínimo=20 => estoque baixo
        Medicamento critico = new Medicamento(1, "Enalapril", "10mg", 5, 20, 100);
        // estoque=50, mínimo=10 => estoque ok
        Medicamento normal = new Medicamento(2, "Metformina", "850mg", 50, 10, 150);

        service.cadastrar(critico);
        service.cadastrar(normal);

        List<Medicamento> alertas = service.listarEstoqueBaixo();

        assertEquals(1, alertas.size());
        assertEquals("Enalapril", alertas.get(0).getNome());
    }
}

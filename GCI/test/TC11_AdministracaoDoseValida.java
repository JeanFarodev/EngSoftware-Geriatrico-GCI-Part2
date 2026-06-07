import model.Medicamento;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * TC11 - Verifica se a administração de uma dose válida
 * decrementa corretamente o estoque do medicamento.
 *
 * <p>Cenário: válido</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC11_AdministracaoDoseValida {

    /**
     * Dado um medicamento com 30 unidades em estoque,
     * quando administrar 5 unidades,
     * então o estoque deve ser reduzido para 25.
     */
    @Test
    public void deveDecrementarEstoqueAposAdministracaoDaDose() {
        Medicamento med = new Medicamento(1, "Omeprazol", "20mg", 30, 10, 100);

        med.administrarDose(5);

        assertEquals(25, med.getQuantidadeEstoque());
    }
}

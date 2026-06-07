import model.Medicamento;
import service.MedicamentoService;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * MOCK02 - Verifica se o mock de MedicamentoService retorna
 * corretamente uma lista simulada de medicamentos com estoque baixo.
 *
 * <p>Utiliza Mock para simular comportamento dinamico do servico.</p>
 *
 * @author Jean Faro, Joao Victor, Guilherme Paiva
 */
public class MOCK02_EstoqueBaixoMock {

    /**
     * Dado um mock de MedicamentoService configurado para retornar
     * uma lista com um medicamento critico,
     * quando chamar listarEstoqueBaixo(),
     * entao deve retornar exatamente 1 medicamento.
     */
    @Test
    public void deveRetornarListaSimuladaDeEstoqueBaixo() {
        MedicamentoService mockService = mock(MedicamentoService.class);
        Medicamento critico = new Medicamento(1, "Enalapril", "10mg", 2, 20, 100);

        when(mockService.listarEstoqueBaixo()).thenReturn(Arrays.asList(critico));

        List<Medicamento> resultado = mockService.listarEstoqueBaixo();

        assertEquals(1, resultado.size());
        assertEquals("Enalapril", resultado.get(0).getNome());
        verify(mockService, times(1)).listarEstoqueBaixo();
    }
}

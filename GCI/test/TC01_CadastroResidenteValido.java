import model.Residente;
import service.ResidenteService;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

/**
 * TC01 - Verifica se o cadastro de um residente válido
 * é realizado com sucesso no sistema.
 *
 * <p>Cenário: válido</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC01_CadastroResidenteValido {

    /**
     * Dado um residente com dados completos,
     * quando cadastrado no serviço,
     * então o total de residentes deve ser 1.
     */
    @Test
    public void deveCadastrarResidenteComSucesso() {
        ResidenteService service = new ResidenteService();
        Residente residente = new Residente(1, "Maria da Silva",
                LocalDate.of(1945, 3, 10), "João Silva", "Hipertensão");

        service.cadastrar(residente);

        assertEquals(1, service.totalResidentes());
    }
}

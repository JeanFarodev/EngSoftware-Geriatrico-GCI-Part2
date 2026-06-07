import model.Residente;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

/**
 * TC03 - Verifica se o cálculo dinâmico de idade
 * do residente está correto.
 *
 * <p>Cenário: válido</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC03_CalculoIdadeResidente {

    /**
     * Dado um residente com data de nascimento conhecida,
     * quando calcular a idade,
     * então o resultado deve ser maior ou igual a 60.
     */
    @Test
    public void deveCalcularIdadeCorretamente() {
        // Residente nascido em 1950 terá pelo menos 74 anos em 2024/2025
        Residente residente = new Residente(3, "José Oliveira",
                LocalDate.of(1950, 6, 15), "Ana Oliveira", "Artrose");

        int idade = residente.calcularIdade();

        assertTrue("Idade deve ser maior ou igual a 60", idade >= 60);
    }
}

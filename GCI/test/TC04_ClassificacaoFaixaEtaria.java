import model.Residente;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;

/**
 * TC04 - Verifica se a classificação automática de faixa etária
 * é aplicada corretamente de acordo com a idade calculada.
 *
 * <p>Cenário: válido</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC04_ClassificacaoFaixaEtaria {

    /**
     * Dado um residente com 85 anos (nascido em 1940),
     * quando calcular a faixa etária,
     * então deve retornar "Idoso Avançado".
     */
    @Test
    public void deveClassificarComoIdosoAvancado() {
        // Nascido em 1940 => ~85 anos em 2025
        Residente residente = new Residente(4, "Antônia Pereira",
                LocalDate.of(1940, 2, 20), "Carlos Pereira", "Alzheimer");

        String faixa = residente.calcularFaixaEtaria();

        assertEquals("Idoso Avançado", faixa);
    }

    /**
     * Dado um residente com 92 anos (nascido em 1933),
     * quando calcular a faixa etária,
     * então deve retornar "Idoso Longevo".
     */
    @Test
    public void deveClassificarComoIdosoLongevo() {
        Residente residente = new Residente(5, "Benedito Souza",
                LocalDate.of(1933, 11, 5), "Fernanda Souza", "Parkinson");

        String faixa = residente.calcularFaixaEtaria();

        assertEquals("Idoso Longevo", faixa);
    }
}

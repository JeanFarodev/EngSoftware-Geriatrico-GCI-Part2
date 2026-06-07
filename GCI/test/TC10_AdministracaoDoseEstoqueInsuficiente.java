import model.Medicamento;
import org.junit.Test;

/**
 * TC10 - Verifica se o sistema lança exceção ao tentar
 * administrar uma dose maior do que o estoque disponível.
 *
 * <p>Cenário: de exceção</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC10_AdministracaoDoseEstoqueInsuficiente {

    /**
     * Dado um medicamento com apenas 3 unidades em estoque,
     * quando tentar administrar 10 unidades,
     * então deve lançar IllegalArgumentException.
     */
    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExcecaoParaEstoqueInsuficiente() {
        Medicamento med = new Medicamento(1, "Vitamina D", "1000UI", 3, 5, 50);

        med.administrarDose(10);
    }
}

import model.Atendimento;
import model.Enfermeiro;
import model.Residente;
import service.AtendimentoService;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * TC14 - Verifica se o histórico de atendimentos retorna
 * apenas os atendimentos do residente correto.
 *
 * <p>Cenário: válido</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 */
public class TC14_HistoricoAtendimentoResidente {

    /**
     * Dados dois residentes com atendimentos distintos,
     * quando consultar o histórico de um deles,
     * então deve retornar apenas os atendimentos daquele residente.
     */
    @Test
    public void deveRetornarApenasAtendimentosDoResidenteCorreto() {
        AtendimentoService service = new AtendimentoService();

        Residente r1 = new Residente(1, "Glória Martins",
                LocalDate.of(1944, 6, 20), "Sônia Martins", "Hipotireoidismo");
        Residente r2 = new Residente(2, "Waldemar Santos",
                LocalDate.of(1938, 11, 3), "Renata Santos", "Artrite");
        Enfermeiro enf = new Enfermeiro(1, "Juliana Lima", "COREN-789", "Noite");

        Atendimento a1 = new Atendimento(1, r1, enf,
                LocalDateTime.now(), "Aplicação de insulina", "");
        Atendimento a2 = new Atendimento(2, r2, enf,
                LocalDateTime.now(), "Troca de curativo", "");
        Atendimento a3 = new Atendimento(3, r1, enf,
                LocalDateTime.now(), "Verificação de glicemia", "");

        service.registrar(a1);
        service.registrar(a2);
        service.registrar(a3);

        List<Atendimento> historico = service.historicoDoResidente(r1);

        assertEquals(2, historico.size());
    }
}

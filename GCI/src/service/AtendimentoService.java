package service;

import model.Atendimento;
import model.Residente;
import java.util.ArrayList;
import java.util.List;

/**
 * Serviço responsável pelo registro e consulta de atendimentos da casa de repouso.
 * Permite registrar novos atendimentos e consultar histórico por residente.
 *
 * <p>Esta implementação é um <b>stub</b> (protótipo simulado) que mantém
 * os dados em memória. Não é necessária implementação completa de persistência.</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 * @version 1.0
 */
public class AtendimentoService {

    /** Lista interna que simula o repositório de atendimentos. */
    private List<Atendimento> atendimentos = new ArrayList<>();

    /**
     * Registra um novo atendimento no sistema.
     *
     * @param atendimento objeto Atendimento a ser registrado
     * @throws IllegalArgumentException se o atendimento for inválido
     * @see Atendimento#isValido()
     */
    public void registrar(Atendimento atendimento) {
        if (atendimento == null || !atendimento.isValido()) {
            throw new IllegalArgumentException("Atendimento inválido para registro.");
        }
        atendimentos.add(atendimento);
    }

    /**
     * Retorna o histórico de atendimentos de um residente específico.
     *
     * @param residente residente cujo histórico será consultado
     * @return lista de atendimentos do residente
     */
    public List<Atendimento> historicoDoResidente(Residente residente) {
        List<Atendimento> historico = new ArrayList<>();
        for (Atendimento a : atendimentos) {
            if (a.getResidente() != null && a.getResidente().getId() == residente.getId()) {
                historico.add(a);
            }
        }
        return historico;
    }

    /**
     * Retorna todos os atendimentos registrados no sistema.
     *
     * @return lista com todos os atendimentos
     */
    public List<Atendimento> listarTodos() {
        return new ArrayList<>(atendimentos);
    }

    /**
     * Retorna a quantidade total de atendimentos registrados.
     *
     * @return número de atendimentos
     */
    public int totalAtendimentos() {
        return atendimentos.size();
    }
}

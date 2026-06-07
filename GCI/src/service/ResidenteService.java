package service;

import model.Residente;
import java.util.ArrayList;
import java.util.List;

/**
 * Serviço responsável pelo gerenciamento de residentes da casa de repouso.
 * Fornece operações de cadastro, busca, atualização e remoção de residentes.
 *
 * <p>Esta implementação é um <b>stub</b> (protótipo simulado) que mantém
 * os dados em memória. Não é necessária implementação completa de persistência.</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 * @version 1.0
 */
public class ResidenteService {

    /** Lista interna que simula o repositório de residentes. */
    private List<Residente> residentes = new ArrayList<>();

    /**
     * Cadastra um novo residente no sistema.
     *
     * @param residente objeto Residente a ser cadastrado
     * @throws IllegalArgumentException se o residente for nulo ou o nome estiver vazio
     */
    public void cadastrar(Residente residente) {
        if (residente == null || residente.getNome() == null || residente.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Residente inválido para cadastro.");
        }
        residentes.add(residente);
    }

    /**
     * Busca um residente pelo seu identificador único.
     *
     * @param id identificador do residente
     * @return o residente encontrado ou {@code null} se não existir
     */
    public Residente buscarPorId(int id) {
        for (Residente r : residentes) {
            if (r.getId() == id) return r;
        }
        return null;
    }

    /**
     * Retorna todos os residentes cadastrados no sistema.
     *
     * @return lista com todos os residentes
     */
    public List<Residente> listarTodos() {
        return new ArrayList<>(residentes);
    }

    /**
     * Retorna todos os residentes de uma determinada faixa etária.
     *
     * @param faixaEtaria string da faixa etária (ex: "Idoso Avançado")
     * @return lista de residentes da faixa informada
     */
    public List<Residente> listarPorFaixaEtaria(String faixaEtaria) {
        List<Residente> resultado = new ArrayList<>();
        for (Residente r : residentes) {
            if (r.calcularFaixaEtaria().equals(faixaEtaria)) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    /**
     * Remove um residente do sistema pelo seu identificador.
     *
     * @param id identificador do residente a remover
     * @return {@code true} se foi removido, {@code false} se não encontrado
     */
    public boolean remover(int id) {
        return residentes.removeIf(r -> r.getId() == id);
    }

    /**
     * Retorna a quantidade total de residentes cadastrados.
     *
     * @return número de residentes
     */
    public int totalResidentes() {
        return residentes.size();
    }
}

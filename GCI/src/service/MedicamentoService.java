package service;

import model.Medicamento;
import java.util.ArrayList;
import java.util.List;

/**
 * Serviço responsável pelo controle de medicamentos da casa de repouso.
 * Gerencia o cadastro, consulta e alertas de estoque dos medicamentos.
 *
 * <p>Esta implementação é um <b>stub</b> (protótipo simulado) que mantém
 * os dados em memória. Não é necessária implementação completa de persistência.</p>
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 * @version 1.0
 */
public class MedicamentoService {

    /** Lista interna que simula o repositório de medicamentos. */
    private List<Medicamento> medicamentos = new ArrayList<>();

    /**
     * Cadastra um novo medicamento no sistema.
     *
     * @param medicamento objeto Medicamento a ser cadastrado
     * @throws IllegalArgumentException se o medicamento for nulo ou o nome estiver vazio
     */
    public void cadastrar(Medicamento medicamento) {
        if (medicamento == null || medicamento.getNome() == null || medicamento.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Medicamento inválido para cadastro.");
        }
        medicamentos.add(medicamento);
    }

    /**
     * Busca um medicamento pelo seu identificador único.
     *
     * @param id identificador do medicamento
     * @return o medicamento encontrado ou {@code null} se não existir
     */
    public Medicamento buscarPorId(int id) {
        for (Medicamento m : medicamentos) {
            if (m.getId() == id) return m;
        }
        return null;
    }

    /**
     * Retorna a lista de medicamentos com estoque abaixo do mínimo configurado.
     * Utilizado para gerar alertas automáticos de reposição.
     *
     * @return lista de medicamentos com estoque baixo
     */
    public List<Medicamento> listarEstoqueBaixo() {
        List<Medicamento> alertas = new ArrayList<>();
        for (Medicamento m : medicamentos) {
            if (m.isEstoqueBaixo()) alertas.add(m);
        }
        return alertas;
    }

    /**
     * Retorna todos os medicamentos cadastrados.
     *
     * @return lista com todos os medicamentos
     */
    public List<Medicamento> listarTodos() {
        return new ArrayList<>(medicamentos);
    }

    /**
     * Retorna a quantidade total de medicamentos cadastrados.
     *
     * @return número de medicamentos
     */
    public int totalMedicamentos() {
        return medicamentos.size();
    }
}

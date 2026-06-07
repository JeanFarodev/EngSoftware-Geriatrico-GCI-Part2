package model;

import java.time.LocalDateTime;

/**
 * Representa um registro de atendimento realizado por um enfermeiro
 * a um residente da casa de repouso.
 * Armazena data, hora, tipo de atendimento e observações.
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 * @version 1.0
 */
public class Atendimento {

    /** Identificador único do atendimento. */
    private int id;

    /** Residente que recebeu o atendimento. */
    private Residente residente;

    /** Enfermeiro que realizou o atendimento. */
    private Enfermeiro enfermeiro;

    /** Data e hora do atendimento. */
    private LocalDateTime dataHora;

    /** Tipo/descrição do atendimento realizado. */
    private String tipoAtendimento;

    /** Observações adicionais sobre o atendimento. */
    private String observacoes;

    /**
     * Constrói um novo Atendimento com os dados fornecidos.
     *
     * @param id              identificador único
     * @param residente       residente atendido
     * @param enfermeiro      enfermeiro responsável
     * @param dataHora        data e hora do atendimento
     * @param tipoAtendimento descrição do tipo de atendimento
     * @param observacoes     observações adicionais
     */
    public Atendimento(int id, Residente residente, Enfermeiro enfermeiro,
                       LocalDateTime dataHora, String tipoAtendimento, String observacoes) {
        this.id = id;
        this.residente = residente;
        this.enfermeiro = enfermeiro;
        this.dataHora = dataHora;
        this.tipoAtendimento = tipoAtendimento;
        this.observacoes = observacoes;
    }

    /**
     * Verifica se o atendimento é válido, ou seja, possui residente,
     * enfermeiro, data/hora e tipo preenchidos.
     *
     * @return {@code true} se o atendimento está completo, {@code false} caso contrário
     */
    public boolean isValido() {
        return residente != null && enfermeiro != null &&
               dataHora != null &&
               tipoAtendimento != null && !tipoAtendimento.trim().isEmpty();
    }

    // ─── Getters e Setters ─────────────────────────────────────────

    /**
     * Retorna o identificador do atendimento.
     * @return id
     */
    public int getId() { return id; }

    /**
     * Define o identificador do atendimento.
     * @param id novo id
     */
    public void setId(int id) { this.id = id; }

    /**
     * Retorna o residente atendido.
     * @return residente
     */
    public Residente getResidente() { return residente; }

    /**
     * Define o residente atendido.
     * @param residente residente
     */
    public void setResidente(Residente residente) { this.residente = residente; }

    /**
     * Retorna o enfermeiro responsável pelo atendimento.
     * @return enfermeiro
     */
    public Enfermeiro getEnfermeiro() { return enfermeiro; }

    /**
     * Define o enfermeiro responsável.
     * @param enfermeiro enfermeiro
     */
    public void setEnfermeiro(Enfermeiro enfermeiro) { this.enfermeiro = enfermeiro; }

    /**
     * Retorna a data e hora do atendimento.
     * @return dataHora
     */
    public LocalDateTime getDataHora() { return dataHora; }

    /**
     * Define a data e hora do atendimento.
     * @param dataHora nova data/hora
     */
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    /**
     * Retorna o tipo do atendimento.
     * @return tipoAtendimento
     */
    public String getTipoAtendimento() { return tipoAtendimento; }

    /**
     * Define o tipo do atendimento.
     * @param tipoAtendimento descrição do tipo
     */
    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    /**
     * Retorna as observações do atendimento.
     * @return observacoes
     */
    public String getObservacoes() { return observacoes; }

    /**
     * Define as observações do atendimento.
     * @param observacoes texto das observações
     */
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    /**
     * Retorna representação textual do atendimento.
     * @return string com dados principais
     */
    @Override
    public String toString() {
        return "Atendimento{id=" + id + ", residente='" +
               (residente != null ? residente.getNome() : "null") +
               "', tipo='" + tipoAtendimento + "', dataHora=" + dataHora + "}";
    }
}

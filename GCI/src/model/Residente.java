package model;

import java.time.LocalDate;
import java.time.Period;

/**
 * Representa um residente (paciente idoso) da casa de repouso.
 * Armazena dados pessoais, informações de saúde e calcula
 * automaticamente a idade com base na data de nascimento.
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 * @version 1.0
 */
public class Residente {

    /** Identificador único do residente. */
    private int id;

    /** Nome completo do residente. */
    private String nome;

    /** Data de nascimento do residente. */
    private LocalDate dataNascimento;

    /** Nome do responsável legal pelo residente. */
    private String responsavelLegal;

    /** Faixa etária calculada automaticamente. */
    private String faixaEtaria;

    /** Diagnóstico ou condição de saúde pré-existente. */
    private String diagnostico;

    /**
     * Constrói um novo Residente com os dados fornecidos.
     *
     * @param id               identificador único
     * @param nome             nome completo
     * @param dataNascimento   data de nascimento
     * @param responsavelLegal nome do responsável legal
     * @param diagnostico      diagnóstico ou condição pré-existente
     */
    public Residente(int id, String nome, LocalDate dataNascimento,
                     String responsavelLegal, String diagnostico) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.responsavelLegal = responsavelLegal;
        this.diagnostico = diagnostico;
        this.faixaEtaria = calcularFaixaEtaria();
    }

    /**
     * Calcula a idade atual do residente em anos completos,
     * com base na data de nascimento e na data atual do sistema.
     *
     * @return idade em anos
     */
    public int calcularIdade() {
        if (dataNascimento == null) return 0;
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    /**
     * Classifica o residente em uma faixa etária de acordo com sua idade.
     * <ul>
     *   <li>60–69 anos: Idoso Inicial</li>
     *   <li>70–79 anos: Idoso Intermediário</li>
     *   <li>80–89 anos: Idoso Avançado</li>
     *   <li>90+ anos:   Idoso Longevo</li>
     * </ul>
     *
     * @return string descritiva da faixa etária
     */
    public String calcularFaixaEtaria() {
        int idade = calcularIdade();
        if (idade >= 90) return "Idoso Longevo";
        if (idade >= 80) return "Idoso Avançado";
        if (idade >= 70) return "Idoso Intermediário";
        if (idade >= 60) return "Idoso Inicial";
        return "Fora de faixa";
    }

    // ─── Getters e Setters ─────────────────────────────────────────

    /**
     * Retorna o identificador do residente.
     * @return id
     */
    public int getId() { return id; }

    /**
     * Define o identificador do residente.
     * @param id novo id
     */
    public void setId(int id) { this.id = id; }

    /**
     * Retorna o nome do residente.
     * @return nome
     */
    public String getNome() { return nome; }

    /**
     * Define o nome do residente.
     * @param nome novo nome
     */
    public void setNome(String nome) { this.nome = nome; }

    /**
     * Retorna a data de nascimento.
     * @return dataNascimento
     */
    public LocalDate getDataNascimento() { return dataNascimento; }

    /**
     * Define a data de nascimento.
     * @param dataNascimento nova data
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        this.faixaEtaria = calcularFaixaEtaria();
    }

    /**
     * Retorna o nome do responsável legal.
     * @return responsavelLegal
     */
    public String getResponsavelLegal() { return responsavelLegal; }

    /**
     * Define o responsável legal.
     * @param responsavelLegal nome do responsável
     */
    public void setResponsavelLegal(String responsavelLegal) {
        this.responsavelLegal = responsavelLegal;
    }

    /**
     * Retorna o diagnóstico ou condição pré-existente.
     * @return diagnostico
     */
    public String getDiagnostico() { return diagnostico; }

    /**
     * Define o diagnóstico do residente.
     * @param diagnostico descrição do diagnóstico
     */
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }

    /**
     * Retorna a faixa etária calculada.
     * @return faixaEtaria
     */
    public String getFaixaEtaria() { return faixaEtaria; }

    /**
     * Retorna representação textual do residente.
     * @return string formatada com dados principais
     */
    @Override
    public String toString() {
        return "Residente{id=" + id + ", nome='" + nome + "', idade=" +
               calcularIdade() + ", faixaEtaria='" + calcularFaixaEtaria() + "'}";
    }
}

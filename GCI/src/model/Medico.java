package model;

/**
 * Representa um médico vinculado à casa de repouso.
 * Armazena dados profissionais e de contato do médico.
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 * @version 1.0
 */
public class Medico {

    /** Identificador único do médico. */
    private int id;

    /** Nome completo do médico. */
    private String nome;

    /** Número do CRM (Conselho Regional de Medicina). */
    private String crm;

    /** Especialidade médica. */
    private String especialidade;

    /** Telefone de contato do médico. */
    private String telefone;

    /**
     * Constrói um novo Médico com os dados fornecidos.
     *
     * @param id           identificador único
     * @param nome         nome completo
     * @param crm          número do CRM
     * @param especialidade especialidade médica
     * @param telefone     telefone de contato
     */
    public Medico(int id, String nome, String crm, String especialidade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

    /**
     * Valida se o CRM informado não é nulo e possui pelo menos 4 caracteres.
     *
     * @return {@code true} se o CRM é válido, {@code false} caso contrário
     */
    public boolean isCrmValido() {
        return crm != null && crm.trim().length() >= 4;
    }

    // ─── Getters e Setters ─────────────────────────────────────────

    /**
     * Retorna o identificador do médico.
     * @return id
     */
    public int getId() { return id; }

    /**
     * Define o identificador do médico.
     * @param id novo id
     */
    public void setId(int id) { this.id = id; }

    /**
     * Retorna o nome do médico.
     * @return nome
     */
    public String getNome() { return nome; }

    /**
     * Define o nome do médico.
     * @param nome novo nome
     */
    public void setNome(String nome) { this.nome = nome; }

    /**
     * Retorna o CRM do médico.
     * @return crm
     */
    public String getCrm() { return crm; }

    /**
     * Define o CRM do médico.
     * @param crm número do CRM
     */
    public void setCrm(String crm) { this.crm = crm; }

    /**
     * Retorna a especialidade do médico.
     * @return especialidade
     */
    public String getEspecialidade() { return especialidade; }

    /**
     * Define a especialidade do médico.
     * @param especialidade especialidade médica
     */
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    /**
     * Retorna o telefone de contato.
     * @return telefone
     */
    public String getTelefone() { return telefone; }

    /**
     * Define o telefone de contato.
     * @param telefone número de telefone
     */
    public void setTelefone(String telefone) { this.telefone = telefone; }

    /**
     * Retorna representação textual do médico.
     * @return string com dados principais
     */
    @Override
    public String toString() {
        return "Medico{id=" + id + ", nome='" + nome + "', crm='" + crm +
               "', especialidade='" + especialidade + "'}";
    }
}

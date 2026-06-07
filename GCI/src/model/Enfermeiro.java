package model;

/**
 * Representa um enfermeiro da casa de repouso.
 * Contém dados profissionais e controle de turno.
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 * @version 1.0
 */
public class Enfermeiro {

    /** Identificador único do enfermeiro. */
    private int id;

    /** Nome completo do enfermeiro. */
    private String nome;

    /** Número do COREN (Conselho Regional de Enfermagem). */
    private String coren;

    /**
     * Turno de trabalho do enfermeiro.
     * Valores esperados: "Manhã", "Tarde", "Noite".
     */
    private String turno;

    /**
     * Constrói um novo Enfermeiro com os dados fornecidos.
     *
     * @param id    identificador único
     * @param nome  nome completo
     * @param coren número do COREN
     * @param turno turno de trabalho (Manhã, Tarde ou Noite)
     */
    public Enfermeiro(int id, String nome, String coren, String turno) {
        this.id = id;
        this.nome = nome;
        this.coren = coren;
        this.turno = turno;
    }

    /**
     * Verifica se o turno informado é válido.
     * Turnos válidos: "Manhã", "Tarde", "Noite".
     *
     * @return {@code true} se o turno é válido, {@code false} caso contrário
     */
    public boolean isTurnoValido() {
        return turno != null &&
               (turno.equals("Manhã") || turno.equals("Tarde") || turno.equals("Noite"));
    }

    // ─── Getters e Setters ─────────────────────────────────────────

    /**
     * Retorna o identificador do enfermeiro.
     * @return id
     */
    public int getId() { return id; }

    /**
     * Define o identificador do enfermeiro.
     * @param id novo id
     */
    public void setId(int id) { this.id = id; }

    /**
     * Retorna o nome do enfermeiro.
     * @return nome
     */
    public String getNome() { return nome; }

    /**
     * Define o nome do enfermeiro.
     * @param nome novo nome
     */
    public void setNome(String nome) { this.nome = nome; }

    /**
     * Retorna o COREN do enfermeiro.
     * @return coren
     */
    public String getCoren() { return coren; }

    /**
     * Define o COREN do enfermeiro.
     * @param coren número do COREN
     */
    public void setCoren(String coren) { this.coren = coren; }

    /**
     * Retorna o turno de trabalho do enfermeiro.
     * @return turno
     */
    public String getTurno() { return turno; }

    /**
     * Define o turno de trabalho do enfermeiro.
     * @param turno turno (Manhã, Tarde ou Noite)
     */
    public void setTurno(String turno) { this.turno = turno; }

    /**
     * Retorna representação textual do enfermeiro.
     * @return string com dados principais
     */
    @Override
    public String toString() {
        return "Enfermeiro{id=" + id + ", nome='" + nome +
               "', coren='" + coren + "', turno='" + turno + "'}";
    }
}

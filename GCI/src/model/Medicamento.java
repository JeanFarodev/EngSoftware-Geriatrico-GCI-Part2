package model;

/**
 * Representa um medicamento controlado pela casa de repouso.
 * Armazena informações sobre dosagem, estoque mínimo e máximo.
 *
 * @author Jean Faro, João Victor, Guilherme Paiva
 * @version 1.0
 */
public class Medicamento {

    /** Identificador único do medicamento. */
    private int id;

    /** Nome do medicamento. */
    private String nome;

    /** Dosagem padrão prescrita (ex: "500mg"). */
    private String dosagem;

    /** Quantidade atual em estoque. */
    private int quantidadeEstoque;

    /** Quantidade mínima permitida em estoque. */
    private int quantidadeMinima;

    /** Quantidade máxima permitida em estoque. */
    private int quantidadeMaxima;

    /**
     * Constrói um novo Medicamento com os dados fornecidos.
     *
     * @param id                identificador único
     * @param nome              nome do medicamento
     * @param dosagem           dosagem padrão
     * @param quantidadeEstoque quantidade atual em estoque
     * @param quantidadeMinima  quantidade mínima de alerta
     * @param quantidadeMaxima  quantidade máxima do estoque
     */
    public Medicamento(int id, String nome, String dosagem,
                       int quantidadeEstoque, int quantidadeMinima, int quantidadeMaxima) {
        this.id = id;
        this.nome = nome;
        this.dosagem = dosagem;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
    }

    /**
     * Verifica se o estoque está abaixo do nível mínimo configurado.
     *
     * @return {@code true} se o estoque está baixo, {@code false} caso contrário
     */
    public boolean isEstoqueBaixo() {
        return quantidadeEstoque < quantidadeMinima;
    }

    /**
     * Registra a administração de uma dose ao residente,
     * decrementando a quantidade em estoque.
     *
     * @param quantidade quantidade a ser administrada/retirada do estoque
     * @throws IllegalArgumentException se a quantidade for inválida ou o estoque for insuficiente
     */
    public void administrarDose(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        if (quantidade > quantidadeEstoque) {
            throw new IllegalArgumentException("Estoque insuficiente para administrar a dose.");
        }
        this.quantidadeEstoque -= quantidade;
    }

    // ─── Getters e Setters ─────────────────────────────────────────

    /**
     * Retorna o identificador do medicamento.
     * @return id
     */
    public int getId() { return id; }

    /**
     * Define o identificador do medicamento.
     * @param id novo id
     */
    public void setId(int id) { this.id = id; }

    /**
     * Retorna o nome do medicamento.
     * @return nome
     */
    public String getNome() { return nome; }

    /**
     * Define o nome do medicamento.
     * @param nome novo nome
     */
    public void setNome(String nome) { this.nome = nome; }

    /**
     * Retorna a dosagem padrão.
     * @return dosagem
     */
    public String getDosagem() { return dosagem; }

    /**
     * Define a dosagem padrão.
     * @param dosagem nova dosagem
     */
    public void setDosagem(String dosagem) { this.dosagem = dosagem; }

    /**
     * Retorna a quantidade atual em estoque.
     * @return quantidadeEstoque
     */
    public int getQuantidadeEstoque() { return quantidadeEstoque; }

    /**
     * Define a quantidade em estoque.
     * @param quantidadeEstoque nova quantidade
     */
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /**
     * Retorna a quantidade mínima de estoque.
     * @return quantidadeMinima
     */
    public int getQuantidadeMinima() { return quantidadeMinima; }

    /**
     * Define a quantidade mínima de estoque.
     * @param quantidadeMinima novo mínimo
     */
    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    /**
     * Retorna a quantidade máxima de estoque.
     * @return quantidadeMaxima
     */
    public int getQuantidadeMaxima() { return quantidadeMaxima; }

    /**
     * Define a quantidade máxima de estoque.
     * @param quantidadeMaxima novo máximo
     */
    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    /**
     * Retorna representação textual do medicamento.
     * @return string com dados principais
     */
    @Override
    public String toString() {
        return "Medicamento{id=" + id + ", nome='" + nome +
               "', dosagem='" + dosagem + "', estoque=" + quantidadeEstoque + "}";
    }
}

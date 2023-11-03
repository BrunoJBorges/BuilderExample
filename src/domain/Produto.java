package domain;

public class Produto {
	private String nome;
    private int quantidade;

    // Construtor
    public Produto(String nome, int quantidade) {
    	super();
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Método para obter o nome do produto
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do produto
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter a quantidade do produto
    public int getQuantidade() {
        return quantidade;
    }

    // Método para definir a quantidade do produto
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + ", Quantidade: " + quantidade;
    }

}

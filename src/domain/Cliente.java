package domain;

public class Cliente {
	private String nome;

    // Construtor
    public Cliente(String nome) {
    	super();
        this.nome = nome;
    }

    // Método para obter o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Cliente: " + nome;
    }
}
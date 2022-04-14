package model;

public class Funcionario {

	private String nome;
	private String cpf;
	private String item;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", item=" + item + "]";
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
}
